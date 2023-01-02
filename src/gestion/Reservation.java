package gestion;

import gestion.Chambre;
import gestion.Client;
import gestion.Employe;

//Classe représentant une réservation d'une chambre par un client

public class Reservation {

	private Client client;
	  private Chambre chambre;
	  private int nombreDeNuits;
	  private Employe employe;

	  public Reservation(Client client, Chambre chambre, int nombreDeNuits, Employe employe) {
	    this.client = client;
	    this.chambre = chambre;
	    this.nombreDeNuits = nombreDeNuits;
	    this.employe = employe;
	  }

	  public Client getClient() {
	    return client;
	  }

	  public Chambre getChambre() {
	    return chambre;
	  }
	  
	  public int getNombreDeNuits() {
		    return nombreDeNuits;
		  }

	  public Employe getEmploye() {
		    return employe;
		  }

	  public double calculerPrixTotal() {
		    return chambre.getTarif() * nombreDeNuits;
		  }
	
}
