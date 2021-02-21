package com.example.coupedemonde1.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coupedemonde1.Repository.ArbitreRepository;

import com.example.coupedemonde1.entities.Arbitre;

import com.example.coupedemonde1.service.ArbitreService;
@Service
public class ArbitreServiceimpl implements ArbitreService{
	
	
	
	@Autowired
	private ArbitreRepository Arbitrerepository;

	@Override
	public Arbitre getArbitreById(long id) {
		return Arbitrerepository.findArbitreById(id);

	}
	
	public ArrayList<Arbitre> getallarbitres() {

		ArrayList<Arbitre> arbitres = (ArrayList<Arbitre>) Arbitrerepository.findAll();
		return arbitres;
	}
	
@Override	
public void saveArbitre(Arbitre signUpRequest) {
	

				Arbitre arbitre = new Arbitre();
				arbitre.setId(signUpRequest.getId());
				arbitre.setNom(signUpRequest.getNom());
				arbitre.setPrenom(signUpRequest.getPrenom());
				arbitre.setNiveau(signUpRequest.getNiveau());

			
				Arbitrerepository.save(arbitre);
		Arbitrerepository.save(arbitre);
	}

@Override
public String deletearbitre(long id) {

	Arbitrerepository.deleteById(id);
	return "200 ok";
}




}
