package com.example.day5.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day5.model.HospitalModel;
import com.example.day5.repository.HospitalRepository;



@Service
public class HospitalService {
	@Autowired
	public HospitalRepository hrepo;
	public String saveHospital(HospitalModel h)
	{
		hrepo.save(h);
		return "Data is saved to database";
	}
	public List<HospitalModel> getHospital()
	{
		return hrepo.findAll();
	}
	public HospitalModel updateHospital(HospitalModel hm) {
		return hrepo.saveAndFlush(hm);
	}
	public boolean updateHospitalif(int hospitalId,HospitalModel hm) {
		if(hrepo.existsById(hospitalId)) {
			hrepo.save(hm);
			return true;
		}
		return false;
	}
	public boolean deleteHospitalif(int hospitalId) {
		if(hrepo.existsById(hospitalId)) {
			hrepo.deleteById(hospitalId);
			return true;
		}
		return false;
	}
	public void deleteHospital(int hospital_id) {
		System.out.println("Deleted");
		hrepo.deleteById(hospital_id);
	}
	public Optional<HospitalModel> getUserId(int userId){
		Optional<HospitalModel>hospital=hrepo.findById(userId);
		if(hospital.isPresent()) {
			return hospital;
		}
		return null;
	}

}
