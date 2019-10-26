package model;

public class User {
	int id;
	String nom;
	String pass;
	String type;
	String etat;
	public User() {
		super();
	}
	public User(int id, String nom, String pass, String type, String etat) {
		super();
		this.id = id;
		this.nom = nom;
		this.pass = pass;
		this.type = type;
		this.etat = etat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", pass=" + pass + ", type=" + type + ", etat=" + etat + "]";
	}
	
}
