package com.M0003;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entities.TOKEntity;
import com.Repositories.TOKRepository;


@Service
public class M0003Service {
    @Autowired
    TOKRepository tokrepository;
    
	public  TOKEntity findbyId(String tokcode) {
		// TODO 自動生成されたメソッド・スタブ
		TOKEntity tokentity = tokrepository.findById(tokcode).orElse(null);
		return  tokentity;
	}

	
	public void saveTor(M0003Model m003) {
		
		TOKEntity entity = new TOKEntity();
		entity.setTokcode(m003.getTokcode());
		entity.setToknm(m003.getTokName());
		//entity.set(m003.getAdrress());
		entity.setTel(m003.getTel());
		entity.setDaihyonm(m003.getName());
				
		
		tokrepository.save(entity);
		
	}
	
	
}