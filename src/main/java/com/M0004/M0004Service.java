package com.M0004;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entities.CALEntity;

@Service
public class M0004Service {
	
	@Autowired
	private M0004Repository m0004repository;
		
	
	public List<CALEntity> SearchDays(String ymd){
	/*	String ymstr = new SimpleDateFormat("yyyy/MM").format(ymd);
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM");
		try {
		     ym = sdf.parse(ymstr);
		} catch (ParseException e) {
		    // ここを書かないとコンパイルエラー
		    e.printStackTrace();
		}
		List<CALEntity> calList =calRepository.findAllByDay(ym);
		calList.sort(Comparator.comparing(CALEntity::getDay)); */
		
		return m0004repository.CalSearch(ymd);
		
	}
	
	public List<M0004Result> Search(M0004Model model) {
			
		return m0004repository.Search(model.getYmd());
	}

	public void save(M0004Model model) {
		
	}
	
}