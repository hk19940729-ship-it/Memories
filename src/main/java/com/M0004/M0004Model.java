package com.M0004;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.Entities.CALEntity;

import lombok.Data;

@Data
public class M0004Model {

	private String ymd;
	private List<CALEntity> CalList = new ArrayList<>();
	private List<M0004Detail> M0004DetailList = new ArrayList<>(); //Newが必要
	
	public void applyTo(List<M0004Result> result, List<CALEntity> dayslist) {

		Map<String, List<M0004Result>> grouped =
			    result.stream()
			          .collect(Collectors.groupingBy(M0004Result::getHincode));
		Set<String> hincodeList = grouped.keySet();

		for(String hincode : hincodeList) {
			
			M0004Detail detail = new M0004Detail();
			M0004Result detailitem =
				    result.stream()
				          .filter(r -> r.getHincode().equals(hincode))
				          .findFirst()
				          .orElse(null);
			
			detail.apply(hincode, detailitem.getHiksuryo(),0, 0, detailitem.getYkeisu(), detailitem.getYjissu(), detailitem.getWkeisu(), detailitem.getWjissu());
			
			for(int j=0; j<=dayslist.size()-1 ;j++) {
				M0004Cell cell = new M0004Cell(); 
				
				cell.setDay(dayslist.get(j).getDay().toString());
				M0004Result item =
					    result.stream()
					          .filter(r -> r.getHincode().equals(grouped))
					          .filter(r -> r.getYmd().equals(cell.getDay()))
					          .findFirst()
					          .orElse(null);
				if (item != null) {
					cell.apply(dayslist.get(j).getDay().toString(),item.getKeisu(), item.getJissu());
				}
				detail.getCellList().add(cell);
			}
			M0004DetailList.add(detail);
		}
	}
	
	
}