package com.M0099;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entities.ANYCODEEntity;
import com.Repositories.ANYCODERepository;

@Service
public class M0099Service{
	@Autowired
	ANYCODERepository anyRepository;
	
	public List<ANYCODEEntity> getAnyList() {
		return anyRepository.findAll();
	}
	
}
