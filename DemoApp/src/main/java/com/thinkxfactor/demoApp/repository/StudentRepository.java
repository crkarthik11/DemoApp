package com.thinkxfactor.demoApp.repository;

import com.thinkxfactor.demoApp.entity.Admin;
import com.thinkxfactor.demoApp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}


