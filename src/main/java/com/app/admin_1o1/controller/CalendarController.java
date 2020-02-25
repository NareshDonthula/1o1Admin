package com.app.admin_1o1.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.admin_1o1.model.CalenderModal;
import com.app.admin_1o1.trainer.repo.Calendar;
import com.app.admin_1o1.trainer.repo.CalendarRepository;


import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/calendar")
@Api(value="1o1_admin", description="CRUD operations on calendar")
@CrossOrigin
public class CalendarController {
    private final Calendar calendar;
    private final CalendarRepository calendarRepoository;
    
    public CalendarController(Calendar calendar, CalendarRepository calendarRepoository) {
    	this.calendar = calendar;
    	this.calendarRepoository = calendarRepoository;
    }
 // Get calendar data created by a trainer by program id
 	@RequestMapping(value = "/{program_id}", method = RequestMethod.GET)
 	public CalenderModal getCalenderByProgramId(@PathVariable String program_id) {
 		return calendar.getDataByProgramId(program_id);
 	}
}
