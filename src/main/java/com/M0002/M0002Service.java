package com.M0002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entities.TOREntity;
import com.Repositories.TORRepository;


@Service
public class M0002Service {
    @Autowired
    TORRepository torrepository;
    
	public  TOREntity findbyId(String torcode) {
		// TODO 自動生成されたメソッド・スタブ
		TOREntity torentity = torrepository.findById(torcode).orElse(null);
		return  torentity;
	}

	
	public void saveTor(M0002Model m002) {
		
		TOREntity entity = new TOREntity();
		entity.setTorCode(m002.getTorCode());
		entity.setTorNm(m002.getTorName());
		//entity.setAdrress(m002.getAdrress());
		entity.setTel(m002.getTel());
		entity.setDaihyoNm(m002.getDaihyoName());
		entity.setYasumi(m002.getYasumimon() + 
				m002.getYasumitue() + 
				m002.getYasumiwed() + 
				m002.getYasumithu() + 
				m002.getYasumifri() + 
				m002.getYasumisat() + 
				m002.getYasumisun()
);
		
		
		torrepository.save(entity);
		
	}
	
	
}