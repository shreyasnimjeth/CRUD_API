package com.cjc.msUpdate.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.msUpdate.HomeRepositry.HomeRepositry;
import com.cjc.msUpdate.ServiceI.ServiceI;

import com.cjc.msUpdate.model.Student;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	HomeRepositry hr;
	
	@Override
	public void updateData(Student s) {
		hr.save(s);
	}

	
}
