package com.app.admin_1o1.trainer.repo;
import java.util.List;
import com.app.admin_1o1.model.ProgramModel;
public interface  Program{
	
    List<ProgramModel> getAllProgramsById(String userId);
    void updateProgram(ProgramModel model);
    ProgramModel getProgramByProgramId(String programId);
	/*
	 * ProgramModel addNewProgram(ProgramModel program);
	  ProgramModel UpdateMyprogram(String
	 * programId, ProgramModel data);
	 */
}
