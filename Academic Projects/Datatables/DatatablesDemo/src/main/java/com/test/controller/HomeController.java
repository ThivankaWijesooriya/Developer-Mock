package com.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.test.model.Catalog;

@Controller
public class HomeController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getHome(Model model) {
		
		List<Catalog> priceList = new ArrayList<>();
		
		Catalog cat1 = new Catalog("Handbag",100);
		Catalog cat2 = new Catalog("Watch",200);
		
		priceList.add(cat1);
		priceList.add(cat2);
		
		
		Gson gson = new Gson() ;
		String CatList = gson.toJson(priceList);
		
		model.addAttribute("catlist",CatList);
		
 		return "index";
	}
	
}
