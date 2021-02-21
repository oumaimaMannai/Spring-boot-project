package com.example.coupedemonde1.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.coupedemonde1.entities.Arbitre;
import com.example.coupedemonde1.entities.User;
import com.example.coupedemonde1.service.ArbitreService;

@RestController
public class ArbitreController {
	
	@Autowired
	private ArbitreService arbitreservice;
	
	@RequestMapping(method = RequestMethod.GET, value = { "/arbitrebyId/{id}" } )
	public Arbitre getArbitreById(@PathVariable long id) {
		return arbitreservice.getArbitreById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = { "/getarbitres" } )
	public ArrayList<Arbitre>  getallarbitres() {
		return arbitreservice.getallarbitres();
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = { "/addarbitre" } )
	public void saveArbitre(@RequestBody Arbitre arbitre) {
	  arbitreservice.saveArbitre(arbitre);
	}
	
	

	@RequestMapping(method = RequestMethod.DELETE, value = { "/deletearbitre/{id}" })
	public String deletearbitre(@PathVariable long id) {
		 arbitreservice.deletearbitre(id);
		 return"200 ok";
	}

	 

}
