package com.thinkxfactor.demoApp.repository;

import com.thinkxfactor.demoApp.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
}


