package com.onezero.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.onezero.mapper.AtmMapper;
import com.onezero.model.Atm;

@Repository
public class AtmDaoImpl implements AtmDao {

	@Autowired
	@Qualifier("jdbcTemplate1")
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Atm> getAllAtm() {

		String sql = "select * from ASID119001.AMCHTB0p where MTBRAN = 1 and MTCCOD = 144";
		List<Atm> atmlist = jdbcTemplate.query(sql, new AtmMapper());
		return atmlist;
	}

	@Override
	public List<Atm> getAtmByCity(String city) {

		String sql = "select * from ASID119001.AMCHTB0p where MTBRAN = 1 and MTCCOD = 144 and MTCTY LIKE ?";
		List<Atm> atmlist = jdbcTemplate.query(sql, new Object[] { city.toUpperCase().trim() + "%" },
		new AtmMapper());
		return atmlist;

	}

}
