package com.M0004;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Entities.CALEntity;


@Repository
public class M0004Repository{
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public List<CALEntity> CalSearch(String ymd){
		String sql = "select "
				    +"DAY, "
				    +"WEEKDAY, "
				    +"HOLIDAY "
				    +"from CALMS "
				    +"where DAY>= DATEADD(day, 1, EOMONTH(:ymd, -1)) "
				    +"AND   DAY<= EOMONTH(:ymd) "
				    +"order by DAY ";
		
		//String ym = new SimpleDateFormat("yyyy/MM").format(ymd);
		Map<String, Object> params = Map.of("ymd",ymd);
		
		RowMapper<CALEntity> rowMapper = (rs, rowNum) -> {
			CALEntity dto = new CALEntity();
		    dto.setDay(rs.getDate("DAY"));
		    dto.setWEEKDAY(rs.getString("WEEkDAY"));
		    dto.setHOLIDAY(rs.getString("HOLIDAY"));
		    //消費予定数保留
		    //在庫予定数保留
		    return dto;
		};
		
		List<CALEntity> callist = namedParameterJdbcTemplate.query(sql, params, rowMapper);
		
		return callist;
		
	}
	
	
	public List<M0004Result> Search(String ymd) {
		
		String sql =
			    "select KEINO, YMD , t_kei.HINCODE, KIBONOKI, YKEISU, WKEISU, KEISU, "
			  + "YJISSU, WJISSU, JISSU, T_ZAI.HIKSURYO "
			  + "from t_kei "
			  + "left outer join ( "
			  + "    select HINCODE, sum(HIKSURYO) as HIKSURYO "
			  + "    from t_zai "
			  + "    group by HINCODE "
			  + ") t_zai "
			  + "on t_kei.HINCODE = t_zai.HINCODE "
			  + "where FORMAT(t_kei.YMD,'yyyy/MM') = FORMAT(CONVERT(date, :ymd),'yyyy/MM') "
			  + "order by HINCODE, YMD"
			  ;
		
		Map<String, Object> params = Map.of("ymd",ymd);
		
		
		RowMapper<M0004Result> rowMapper = (rs, rowNum) -> {
			M0004Result dto = new M0004Result();
		    dto.setKeino(rs.getString("KEINO"));
		    dto.setYmd(rs.getString("YMD"));
		    dto.setHincode(rs.getString("HINCODE"));
		    dto.setKibonoki(rs.getDate("KIBONOKI"));
		    dto.setYkeisu(rs.getDouble("YKEISU"));
		    dto.setWkeisu(rs.getDouble("WKEISU"));
		    dto.setKeisu(rs.getDouble("KEISU"));
		    dto.setYjissu(rs.getDouble("YJISSU"));
		    dto.setWjissu(rs.getDouble("WJISSU"));
		    dto.setJissu(rs.getDouble("JISSU"));
		    dto.setHiksuryo(rs.getDouble("HIKSURYO"));
		    //消費予定数保留
		    //在庫予定数保留
		    return dto;
		};
		
		return namedParameterJdbcTemplate.query(sql, params, rowMapper);

		
		
	}
	
	
	
	
}