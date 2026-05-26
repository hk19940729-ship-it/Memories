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

	
	public void saveTor(M0003Model m) {
		
		TOKEntity entity = new TOKEntity();
		entity.setTokcode(m.getTokcode());
		entity.setToknm(m.getTokName());
		//entity.set(m.getAdrress());
		entity.setTel(m.getTel());
		entity.setDaihyonm(m.getName());
		entity.setYasumi( m.getYasumisun() + m.getYasumimon() + m.getYasumitue() + m.getYasumiwed() + m.getYasumithu() + m.getYasumifri() + m.getYasumisat());
				
		
		tokrepository.save(entity);
		
	}

	
	
}