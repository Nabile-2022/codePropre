package ex1;

import java.util.Date;

public class Entreprise {

	private int siret;
	private String nom;
	private String adresse;
	private Date dateCreation;

	public static final int CAPITAL_MAX = 3000000;
	
	public int getSiret()
	{
		return siret;
	}

	public String getNom()
	{
		return nom;
	}

	public String getAdresse()
	{
		return adresse;
	}

	public Date getDateCreation()
	{
		return dateCreation;
	}
	
	public void afficherStatut(){
		
	}
	
}
