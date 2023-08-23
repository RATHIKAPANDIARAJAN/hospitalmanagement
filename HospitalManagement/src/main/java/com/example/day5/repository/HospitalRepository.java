package com.example.day5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day5.model.HospitalModel;



public interface HospitalRepository extends JpaRepository<HospitalModel, Integer>{

}
