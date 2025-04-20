package com.example.Course.Registration.System.repository;

import com.example.Course.Registration.System.model.courseRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRegisterRepo extends JpaRepository<courseRegister,Integer> {

}
