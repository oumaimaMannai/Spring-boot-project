package com.example.coupedemonde1.service;

import java.util.ArrayList;

import com.example.coupedemonde1.entities.Arbitre;


public interface ArbitreService {
	
	
	
	
	public Arbitre getArbitreById(long id);

	public ArrayList<Arbitre> getallarbitres();
	
	public void saveArbitre (Arbitre arbitre) ;
	
	public String deletearbitre(long id);

}
