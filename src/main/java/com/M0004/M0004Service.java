package com.M0004;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entities.CALEntity;
import com.Entities.KEIEntity;
import com.Repositories.KEIRepository;

@Service
public class M0004Service {
	
	@Autowired
	private M0004Repository m0004repository;
		
	@Autowired
	private KEIRepository keirepository;
	
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
		List<M0004Detail> detaillist = model.getM0004DetailList();
		for (int i=0 ;i<=detaillist.size() - 1 ;i++) {
			M0004Detail detail = detaillist.get(i);
			List<M0004Cell> celllist = detail.getCellList();
			for (int j=0 ; j<=celllist.size() -1 ;j++) {
				M0004Cell cell = celllist.get(j);
				String keino = detail.getHincode() + "-" + cell.getDay();
				KEIEntity keientity = EditKei(keino, model, detail, cell);
				keirepository.save(keientity);
			}
		 }
		}
	
	private KEIEntity EditKei(String keino, M0004Model model,M0004Detail detail,M0004Cell cell ) {
		KEIEntity keientity = new KEIEntity();
		keientity.setKeino(keino);
		keientity.setYmd(cell.getDay());
		keientity.setHincode(detail.getHincode());
		keientity.setKibonoki(cell.getDay());
		keientity.setYkeisu(detail.getNenKeiSu());
		keientity.setWkeisu(detail.getSyuKeiSu());
		keientity.setKeisu(cell.getHiKeiSu());
		
		return keientity;
	}
}
		
	
	
