package com.cjc.msCreate.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.msCreate.RepositryI.HomeRepositry;
import com.cjc.msCreate.ServiceI.HomeService;
import com.cjc.msCreate.model.student;
@Service
public class ServiceImpl implements HomeService{

	@Autowired
	HomeRepositry hr;
	
	@Override
	public void saveData(student s) {
		hr.save(s);
		
	}

}
