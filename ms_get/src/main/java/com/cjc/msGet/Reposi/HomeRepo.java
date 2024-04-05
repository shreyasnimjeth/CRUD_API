package com.cjc.msGet.Reposi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.msGet.model.Student;

@Repository
public interface HomeRepo extends CrudRepository<Student, Integer>{

	
}
