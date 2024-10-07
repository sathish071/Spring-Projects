package com.demo.practice2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.practice2.Bean.BeanClass;
import com.demo.practice2.Bean.Tamilnadu;
import com.demo.practice2.repository.TamilnaduRepository;
//@Service
public class TamilnaduService {
	
	@Autowired
	TamilnaduRepository tamilnaduRepository;
	
	public Tamilnadu addUser(Tamilnadu tamilnadu) {

		tamilnaduRepository.save(tamilnadu);

		return tamilnadu;
	}

	public Tamilnadu updateUserManual(int cmId,Tamilnadu tamilnadu) {
		
		Optional<Tamilnadu> dataForDb = tamilnaduRepository.findById(cmId);
		
		if(dataForDb.isPresent()) {
			
			Tamilnadu tn= dataForDb.get();
			tn.setCmCardNumber(tamilnadu.getCmCardNumber());
			tn.setCm(tamilnadu.getCm());
			
			return tamilnaduRepository.save(tn);
		}
		
		return null;
	}
	
	public Tamilnadu updateUser(Tamilnadu tamilnadu) {

		tamilnaduRepository.save(tamilnadu);

		return tamilnadu;
	}
	

	public List<Tamilnadu> viewAllUser() {
		return tamilnaduRepository.findAll();
	}

	public String deleteEmpUser(int id) {

		tamilnaduRepository.deleteById(id);
		return "delete sucessfully";
	}


}
