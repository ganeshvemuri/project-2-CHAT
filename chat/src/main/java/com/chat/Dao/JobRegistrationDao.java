package com.chat.Dao;

import java.util.List;

import com.chat.model.jobRegistration;

public interface JobRegistrationDao {
	
	void saveJob(jobRegistration reg);
	List<jobRegistration> viewAppliedJobs(int job_Id);

}
