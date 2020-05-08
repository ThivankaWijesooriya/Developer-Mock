package com.onezero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onezero.model.Atm;
import com.onezero.model.Statistics;
import com.onezero.service.AtmService;
import com.onezero.service.StatisticsService;

@RestController
//@CrossOrigin(origins = {"http://localhost:8100", "http://10.82.152.56:8100"})
@CrossOrigin
public class AtmRestController {

		
	@Autowired
	private AtmService atmService;
	
	@Autowired
	private StatisticsService statisticsService;
	

	@RequestMapping(value = "/atm/all", method = RequestMethod.GET)
	public ResponseEntity<List<Atm>> getAllAtm() {

		try {

			List<Atm> atmlist = atmService.getAllAtm();

			return new ResponseEntity<List<Atm>>(atmlist, HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<List<Atm>>(HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/atm/{city}", method = RequestMethod.GET)
	public ResponseEntity<List<Atm>> getAtm(@PathVariable("city") String city) {

		try {

			List<Atm> atmlist = atmService.getAtmByCity(city);

			return new ResponseEntity<List<Atm>>(atmlist, HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<List<Atm>>(HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/atm/statistics", method = RequestMethod.GET)
	public ResponseEntity<Statistics> getAtmStatistics() {

		try {

			Statistics statobject = statisticsService.getStatistics();
			
			System.out.println(statobject.getTotalnoissues());

			return new ResponseEntity<Statistics>(statobject,HttpStatus.OK);

		} catch (Exception e) {

			e.printStackTrace();
			return new ResponseEntity<Statistics>(HttpStatus.BAD_REQUEST);
		}

	}

}
