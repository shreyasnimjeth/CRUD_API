package com.cjc.msCreate.RepositryI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.msCreate.model.student;

@Repository
public interface HomeRepositry extends JpaRepository<student, Integer>{

	
}
