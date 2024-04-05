package com.cjc.msDelete.HomeRepositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.msDelete.model.Student;

@Repository
public interface HomeRepositry extends JpaRepository<Student, Integer>{

}
