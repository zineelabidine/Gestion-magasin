package IMP_service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import model.Produit;
import service.ServiceProduit;

public class Imp_service_Produit implements ServiceProduit {
	Connection conx;

	public Imp_service_Produit() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conx = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionmagasin", "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void ajouter_produit(Produit p)  {

		
		try {
			System.out.println("a léintérieur de implem");
			System.out.println(p);
			Statement ste=conx.createStatement();

				String requte ="INSERT INTO produit (nom, prix) VALUES ('"+p.getNom()+"','"+p.getPrix()+"');";
				
				ste.execute(requte);
			
		
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void suprimer_produit(int id) {
		try {
			Statement ste = conx.createStatement();
			System.out.println("supression");
			String requte = "DELETE FROM client_produit WHERE id_produit="+id+";";
			ste.execute(requte);
			requte = "DELETE FROM produit WHERE id="+id+";";
			ste.execute(requte);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void modifier_produit(Produit p, int id) {
		try {
			Statement ste = conx.createStatement();
			System.out.println("supression");
			String requte = "UPDATE produit SET nom='"+p.getNom()+"',prix='"+p.getPrix()+"' WHERE id="+id+"";
			ste.execute(requte);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<Produit> getall() {
		ArrayList<Produit> listproduit = new ArrayList<Produit>();
		try {
			Statement ste = conx.createStatement();
			String requte = "SELECT * from produit";
			ResultSet result = ste.executeQuery(requte);
			Produit pro;
			while (result.next()) {
				pro = new Produit();
				pro.setId(result.getInt(1));
				pro.setNom(result.getString(2));
				pro.setPrix(result.getFloat(3));
				listproduit.add(pro);
			}
			return listproduit;
		} catch (SQLException e) {
			e.printStackTrace();
			return listproduit;
		}
		

	
	}

	@Override
	public void achter(int id_produit, int id_user) {
		try {
			Statement ste=conx.createStatement();
				String requte ="INSERT INTO client_produit(id_client, id_produit) VALUES ("+id_user+","+id_produit+");";		
				ste.execute(requte);	
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<Produit> panier(int id_user) {
		ArrayList<Produit> listproduit = new ArrayList<Produit>();
		try {
			Statement ste = conx.createStatement();
			String requte = "SELECT *\r\n" + 
					"FROM produit\r\n" + 
					"    JOIN client_produit ON produit.id = client_produit.id_produit\r\n" + 
					"WHERE client_produit.id_client="+id_user+"";
			ResultSet result = ste.executeQuery(requte);
			Produit pro;
			while (result.next()) {
				pro = new Produit();
				pro.setId(result.getInt(1));
				pro.setNom(result.getString(2));
				pro.setPrix(result.getFloat(3));
				listproduit.add(pro);
			}
			return listproduit;
		} catch (SQLException e) {
			e.printStackTrace();
			return listproduit;
		}
		

	
	}

	@Override
	public void suprimer_produit_facutre(int id,int id_user) {
		try {
			Statement ste = conx.createStatement();
			System.out.println("supression");
			String requte = "DELETE FROM client_produit WHERE id_produit="+id+" and id_client="+id_user+"";
			ste.execute(requte);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
