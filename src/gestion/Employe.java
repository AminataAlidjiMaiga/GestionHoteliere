package gestion;

import gestion.Personne;

public class Employe extends Personne {

	 private String service;
	  private int matricule;

	  public Employe(String nom, String adresse, int numeroDeTelephone, String service, int matricule) {
	    super(nom, adresse, numeroDeTelephone);
	    this.service = service;
	    this.matricule = matricule;
	  }

	  public String getService() {
	    return service;
	  }

	  public int getMatricule() {
	    return matricule;
	  }

}
