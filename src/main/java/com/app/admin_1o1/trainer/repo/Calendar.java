package com.app.admin_1o1.trainer.repo;

import com.app.admin_1o1.model.CalenderModal;

public interface Calendar {
	CalenderModal getDataByProgramId(String programId);
}
