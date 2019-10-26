package service;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Produit;



public interface ServiceProduit {
	public void ajouter_produit(Produit p) ;
	public void suprimer_produit(int id) ;
	public void suprimer_produit_facutre(int id,int id_user) ;
	public void modifier_produit(Produit p, int id);
	public ArrayList<Produit> getall();
	public void achter(int id_produit, int id_user);
	public ArrayList<Produit> panier(int id_user);
}
