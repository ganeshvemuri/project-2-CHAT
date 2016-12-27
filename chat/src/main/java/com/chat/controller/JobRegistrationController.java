package com.chat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chat.Dao.JobRegistrationDao;

import com.chat.model.jobRegistration;

@RestController
public class JobRegistrationController {

	@Autowired
	JobRegistrationDao jobregistrationDao;
	
@RequestMapping(value="/saveJob",headers="Accept=Application/json",method=RequestMethod.POST)
	
	public void saveJob(@RequestBody jobRegistration reg)
	{
		jobregistrationDao.saveJob(reg);
	}

@RequestMapping(value="/viewAppliedJobs/{job_Id}",headers="accept=Application/json",method=RequestMethod.GET)
public List<jobRegistration> viewAppliedJobs(@PathVariable("job_Id") int job_Id)
	{
		
		return jobregistrationDao.viewAppliedJobs(job_Id);
	}}
