package com.M0001.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entities.HINEntity;
import com.M0001.repository.M0001Repository;

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
}