package models;

public class Article {
	private String nom ;
	private String description ;
	private double prix ;
	private int quantite ;
	
	public Article ( String nom , String description , double prix , int quantite) {
		this.nom = nom;
		this.description = description ;
		this.prix = prix ;
		this.quantite = quantite ;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public double getPrix() {
		return this.prix;
	}
	
	public double getQuantite() {
		return this.quantite;
	}
	
	public void setNom(String nom) {
		this.nom = nom ; 
	}
	
	public void setDescription(String description) {
		this.description = description ; 
	}
	
	
	public void setPrix(double prix) {
		this.prix = prix ; 
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite ; 
	}
	
	
	
	
	
}
