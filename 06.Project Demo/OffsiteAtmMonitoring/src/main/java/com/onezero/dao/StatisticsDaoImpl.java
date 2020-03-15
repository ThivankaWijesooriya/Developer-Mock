package com.onezero.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.onezero.model.Statistics;

@Repository
public class StatisticsDaoImpl implements StatisticsDao{

	@Autowired
	@Qualifier("jdbcTemplate2")
	JdbcTemplate jdbcTemplate;
		
	@Override
	public Statistics getStatistics() {
		
		try {
			
			SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("sp_atmstatistics");
			
			MapSqlParameterSource in = new MapSqlParameterSource();
			
			in.addValue("noissues", 0);
			in.addValue("needsattention", 0);
			in.addValue("average", 0);
			
			Map<String, Object> out = jdbcCall.execute(in);
			
			Statistics statistics = new Statistics();
			
			statistics.setTotalnoissues((Integer)out.get("noissues"));
			statistics.setTotalneedattention((Integer)out.get("needsattention"));
			statistics.setTotalaverage((Integer)out.get("average"));
			
			return statistics;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
		
	}

}
