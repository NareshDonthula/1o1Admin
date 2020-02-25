package com.app.admin_1o1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.admin_1o1.model.ProgramModel;
import com.app.admin_1o1.trainer.repo.Program;
import com.app.admin_1o1.trainer.repo.ProgramRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/program")
@Api(value = "1o1_admin", description = "CRUD operations on program")
@CrossOrigin
public class ProgramController {
	private final ProgramRepository programRepository;
	private final Program program;

	public ProgramController(ProgramRepository programRepository, Program program) {
		this.programRepository = programRepository;
		this.program = program;

	}

	// Get all program created by a trainer by trainer id
	@RequestMapping(value = "/trainer/{trainer_id}", method = RequestMethod.GET)
	public List<ProgramModel> getAllProgramsById(@PathVariable String trainer_id) {
		return program.getAllProgramsById(trainer_id);
	}

	// Update trainer status
	@RequestMapping(value = "/status", method = RequestMethod.POST)
	public void updateTrainer(@RequestBody ProgramModel model) {
		program.updateProgram(model);
	}

	// Get a program by program id
	@RequestMapping(value = "/{program_id}", method = RequestMethod.GET)
	public ProgramModel getProgramById(@PathVariable String program_id) {
		return program.getProgramByProgramId(program_id);
	}

}
