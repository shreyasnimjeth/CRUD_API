package com.cjc.msGet.ServiceI;

import com.cjc.msGet.model.Student;

public interface HomeService {

	public Iterable<Student> getAll();

	public Student editData(int id);

	
}
