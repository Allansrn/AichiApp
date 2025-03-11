package models;

import java.util.Date;

public class Client {

	//private Date date;
	private String prenom;
	private String nom;
	private String adresse;
	private int telFixe;
	private int telMobile;
	private String email;
	
	
	public Client(String prenom,String nom,String adresse,int telFixe,int telMobile,String email) {
		this.prenom = prenom ;
		this.nom = nom ;
		this.adresse = adresse ;
		this.telFixe = telFixe ;
		this.telMobile = telMobile ;
		this.email = email ;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public int getTelFixe() {
		return telFixe;
	}


	public void setTelFixe(int telFixe) {
		this.telFixe = telFixe;
	}


	public int getTelMobile() {
		return telMobile;
	}


	public void setTelMobile(int telMobile) {
		this.telMobile = telMobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	


}
