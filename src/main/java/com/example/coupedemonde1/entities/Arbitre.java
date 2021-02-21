package com.example.coupedemonde1.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Arbitre implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nom;
	private String prenom;
	private String niveau;
	
	@OneToOne
	@JoinColumn(name = "image_id", referencedColumnName = "id")
	private String image;
	
	public Arbitre(String nom, String prenom, String niveau,String image) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.niveau = niveau;
		this.image = image;
	}


	public Arbitre() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Arbitre [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", niveau=" + niveau + "]";
	}

	

	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNiveau() {
		return niveau;
	}


	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
	
	

}
