package com.example.coupedemonde1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.coupedemonde1.entities.Arbitre;


public interface ArbitreRepository  extends JpaRepository<Arbitre, Long>{

	
	
	public Arbitre findArbitreById(long id);

}
