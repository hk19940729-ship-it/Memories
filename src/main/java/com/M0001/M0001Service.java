package com.M0001;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entities.HINEntity;

@Service
public class M0001Service {
    @Autowired
    M0001Repository M0001Repository;
    /**
     * レコードを全件取得する。
     * 
     * @return
     */
    public List<HINEntity> findAllWeatherData() {
        return M0001Repository.findAll();
    }
	public  HINEntity findbyId(String hincode) {
		// TODO 自動生成されたメソッド・スタブ
		HINEntity hinentity = M0001Repository.findById(hincode).orElse(null);
		return  hinentity;
	}
	
	public Boolean  existshincode(String hincode) {
		HINEntity hinentity = M0001Repository.findById(hincode).orElse(null);
		if(hinentity != null) {
			return true;
		}else
			return false;
	}
	
	
	public Boolean  existTniCode(String tniCode) {
		HINEntity tnientity = M0001Repository.findById(tniCode).orElse(null);
		if(tnientity != null) {
			return true;
		}else
			return false;
	}
	
	
	
	
	public void saveHin(M0001 m001) {
		
		HINEntity entity = m001.toHINEntity();
		M0001Repository.save(entity);
		
	}
	
	
}