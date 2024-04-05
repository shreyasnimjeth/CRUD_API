package com.cjc.msUpdate.HomeRepositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.msUpdate.model.Student;

@Repository
public interface HomeRepositry extends JpaRepository<Student, Integer>{

}
