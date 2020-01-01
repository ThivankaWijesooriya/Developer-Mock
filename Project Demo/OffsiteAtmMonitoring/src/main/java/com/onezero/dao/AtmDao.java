package com.onezero.dao;

import java.util.List;

import com.onezero.model.Atm;

public interface AtmDao {

	public List<Atm> getAllAtm();

	public List<Atm> getAtmByCity(String city);

}
