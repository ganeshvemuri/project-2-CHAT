package com.chat.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chat.model.jobRegistration;

@Transactional
@Repository
public class JobRegistrationDaoImpl implements JobRegistrationDao {

	@Autowired
	SessionFactory sessionfactory;
	
	public void saveJob(jobRegistration reg) {
		sessionfactory.getCurrentSession().save(reg);
		
	}

	public List<jobRegistration> viewAppliedJobs(int job_Id) {
		Criteria crt=sessionfactory.getCurrentSession().createCriteria(jobRegistration.class);
		crt.add(Restrictions.eq("job_Id",job_Id));
		List list=crt.list();
		return list;
	}

}
