package com.cjc.msGet.ServiceImpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.msGet.Reposi.HomeRepo;
import com.cjc.msGet.ServiceI.HomeService;
import com.cjc.msGet.model.Student;
@Service
public class ServiceImpl implements HomeService
{

	@Autowired
	HomeRepo hr;
	
	@Override
	public Iterable<Student> getAll() {
		
		Iterable<Student> list = hr.findAll();
		return list;
	}

	@Override
	public Student editData(int id) {
		return hr.findById(id).get();
		
	}

}
