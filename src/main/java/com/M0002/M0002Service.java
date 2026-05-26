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

	
	public void saveTor(M0002Model m) {
		
		
		 TOREntity torentity = new TOREntity();
		 torentity.setTorCode(m.getTorCode());
		 torentity.setTorNm(m.getTorName());
		 torentity.setAddrressNm(String.format("%-30s",m.getAdrress1()) + String.format("%-30s",m.getAdrress2()));
		 torentity.setTel(m.getTel());
		 torentity.setDaihyoNm(m.getDaihyoName());
		 torentity.setYasumi( m.getYasumisun() + m.getYasumimon() + m.getYasumitue() + m.getYasumiwed() + m.getYasumithu() + m.getYasumifri() + m.getYasumisat());
		
		
		torrepository.save(torentity);
		
	}
	
	public void deleteTor(M0002Model  m) 
	{	
		torrepository.deleteById(m.getTorCode());
	}
	
	
}