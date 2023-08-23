package com.example.day5.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hospitalname")
public class HospitalModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hospitalId;
	@Column	(name="hospitalname")
	private String hospitalName;
   private String address;
   private String doctors;
   private String nurse;
   private String outpatient;
   private String inpatient;
public int getHospitalId() {
	return hospitalId;
}
public void setHospitalId(int hospitalId) {
	this.hospitalId = hospitalId;
}
public String getHospitalName() {
	return hospitalName;
}
public void setHospitalName(String hospitalName) {
	this.hospitalName = hospitalName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDoctors() {
	return doctors;
}
public void setDoctors(String doctors) {
	this.doctors = doctors;
}
public String getNurse() {
	return nurse;
}
public void setNurse(String nurse) {
	this.nurse = nurse;
}
public String getOutpatient() {
	return outpatient;
}
public void setOutpatient(String outpatient) {
	this.outpatient = outpatient;
}
public String getInpatient() {
	return inpatient;
}
public void setInpatient(String inpatient) {
	this.inpatient = inpatient;
}
   

   
}
