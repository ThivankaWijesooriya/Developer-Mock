package com.onezero.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.onezero.model.Atm;

public class AtmMapper implements RowMapper<Atm> {

	@Override
	public Atm mapRow(ResultSet rs, int rowNum) throws SQLException {

		Atm atm = new Atm();

		atm.setId(rs.getString("MTVDEV"));

		atm.setLocation(rs.getString("MTLOC"));

		atm.setStreetaddress(rs.getString("MTADR"));

		atm.setCity(rs.getString("MTCTY"));

		atm.setState(rs.getString("MTSTE"));

		atm.setCountrycode(rs.getString("MTCCOD"));

		return atm;
	}

}
