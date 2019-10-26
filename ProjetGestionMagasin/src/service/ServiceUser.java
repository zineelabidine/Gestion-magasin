package service;

import java.util.ArrayList;


import model.User;

public interface ServiceUser {
public User login(User u);
public void ajouter(User u);
public void suprimer(int id_user);
public void modifier(User u,int id_user);
public ArrayList<User> getall();
}
