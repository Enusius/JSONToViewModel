package ca.ulaval.glo4003.projet_de_session.web.viewmodels;

import java.util.ArrayList;

public class ViewModel{
	public String nom;
	public String prenom;
	public ArrayList<ViewModel2> list;
	
	public ArrayList<ViewModel2> getList(){
		return list;
	}
	
	public String getNom(){
		return nom;
	}
	
	public String getPrenom(){
		return prenom;
	}
}
