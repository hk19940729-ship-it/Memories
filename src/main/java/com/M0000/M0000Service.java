package com.M0000;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entities.ANYCODEEntity;
import com.Repositories.ANYCODERepository;

@Service
public class M0000Service{
	
	@Autowired	
	ANYCODERepository ANYCODERepository;
	
	
	public  ANYCODEEntity getAnyCode(String anyCode) {
		
		ANYCODEEntity anycodeentity = ANYCODERepository.findById(anyCode).orElse(null);
	
		if(anycodeentity != null) {
			return anycodeentity;
		}else 
			return null;
		
	}
	
	
	
	
	public void SaveAnyCode(M0000Model m0000) {
		

		if (m0000.getIsNewal()) {
			ANYCODEEntity anycodeentity =new ANYCODEEntity();
			anycodeentity.setCodeKbn(m0000.getCodeKbn());
			anycodeentity.setCode(m0000.getAnyCode());
			anycodeentity.setCodeNm(m0000.getAnyName());
			
			ANYCODERepository.save(anycodeentity);
		}
		
	}

	
}