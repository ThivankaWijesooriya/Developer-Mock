package com.onezero.service;

import java.util.List;

import com.onezero.model.Atm;

public interface AtmService {

	public List<Atm> getAllAtm();

	public List<Atm> getAtmByCity(String city);

}
