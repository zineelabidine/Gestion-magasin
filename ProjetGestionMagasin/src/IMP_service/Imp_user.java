package IMP_service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Produit;
import model.User;
import service.ServiceUser;

public class Imp_user implements ServiceUser{
	Connection conx;

	public Imp_user () {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conx = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionmagasin", "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}}

	@Override
	public User login(User u) {
		
		try {
			Statement ste = conx.createStatement();
			String requte = "SELECT * from user_magasin where username='"+u.getNom()+"'";
			ResultSet result = ste.executeQuery(requte);
			User u_retour = new User();
			u_retour.setId(0);
			u_retour.setNom("");
			u_retour.setPass("");
		
			
			while (result.next()) {
				 u_retour.setId(result.getInt(1));
				 u_retour.setNom(result.getString(2));
				 u_retour.setPass(result.getString(4));
				 u_retour.setType(result.getString(3));
				 u_retour.setEtat(result.getString(5));
		
			}
			System.out.println(u_retour);
				return u_retour;
		} catch (SQLException e) {
			e.printStackTrace();
			
		}

		return u;
		

}

	@Override
	public void ajouter(User u) {
		try {
			Statement ste=conx.createStatement();
			System.out.println(u.getEtat());
				String requte ="INSERT INTO user_magasin(username, type, pass,etat) VALUES ('"+u.getNom()+"','"+u.getType()+"','"+u.getPass()+"','"+u.getEtat()+"');";
				ste.execute(requte);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}

	@Override
	public void suprimer(int id_user) {
		System.out.println("implementation suprimer");
		System.out.println(id_user);
		try {
			Statement ste=conx.createStatement();
				String requte = "DELETE FROM client_produit WHERE id_client="+id_user+";";
				ste.execute(requte);
				requte="DELETE FROM user_magasin WHERE id="+id_user+";";
				ste.execute(requte);
		} catch (Exception e) {
			e.printStackTrace();
	}}

	@Override
	public void modifier(User u,int id_user) {
		try {
			Statement ste=conx.createStatement();
				String requte = "UPDATE user_magasin SET username='"+u.getNom()+"',type='"+u.getType()+"',pass='"+u.getPass()+"',etat='"+u.getEtat()+"' WHERE id="+id_user+";";
				ste.execute(requte);
		} catch (Exception e) {
			e.printStackTrace();
	}
		
	}

	@Override
	public ArrayList<User> getall() {
		ArrayList<User> listuser = new ArrayList<User>();
		try {
			Statement ste = conx.createStatement();
			String requte = "SELECT * from user_magasin";
			ResultSet result = ste.executeQuery(requte);
			User us;
			while (result.next()) {
				us = new User();
				us.setId(result.getInt(1));
				us.setNom(result.getString(2));
				us.setType(result.getString(3));
				us.setPass(result.getString(4));
				us.setEtat(result.getString(5));
				listuser.add(us);
			}
			return listuser;
		} catch (SQLException e) {
			e.printStackTrace();
			return listuser;
		}
	}
	
}
