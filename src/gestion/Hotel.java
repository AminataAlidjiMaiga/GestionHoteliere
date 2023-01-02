package gestion;

import java.util.ArrayList;
import java.util.List;

//Classe représentant l'hôtel

public class Hotel {

	  private String nom;
	  private List<Chambre> chambres = new ArrayList<>();
	  private List<Reservation> reservations = new ArrayList<>();
	  private List<Employe> employes = new ArrayList<>();

	  public Hotel(String nom) {
	    this.nom = nom;
	  }

	  public void ajouterChambre(Chambre chambre) {
	    chambres.add(chambre);
	  }

	  public Chambre chercherChambreDisponible(int numeroDeChambre) {
	    for (Chambre chambre : chambres) {
	      if (chambre.getNumero() == numeroDeChambre &&!chambre.isEstOccupee()) {
	          return chambre;
	      }
	    }
	    return null;
	  }
	  
	  public void reserverChambre(Client client, int numeroDeChambre, int nombreDeNuits, Employe employe) {
		  Chambre chambre = chercherChambreDisponible(numeroDeChambre);
		  if (chambre == null) {
		    System.out.println("La chambre demandée est indisponible.\n");
		    return;
		  }
		  Reservation reservation = new Reservation(client, chambre, nombreDeNuits, employe);
		  chambre.setEstOccupee(true);
		  reservations.add(reservation);
		}
	  
	  public Reservation chercherReservation(Client client) {
		  for (Reservation reservation : reservations) {
		    if (reservation.getClient().equals(client)) {
		      return reservation;
		    }
		  }
		  return null;
		}
	  
	  public void afficherFacture(Client client) {
		  Reservation reservation = chercherReservation(client);
		  if (reservation == null) {
		    System.out.println("Le client "+client.getNom()+" n'a pas de réservation en cours.\n");
		    return;
		  }
		  System.out.println("Facture pour le client " + client.getNom() + " :");
		  System.out.println("  Chambre n°" + reservation.getChambre().getNumero() + " (" + reservation.getNombreDeNuits() + " nuits) : " + reservation.calculerPrixTotal() + " €");
		  System.out.println("Réservation prise en charge par " + reservation.getEmploye().getNom() + " du service " + reservation.getEmploye().getService() + ".");
		  System.out.println("Merci pour votre séjour à l'hôtel " + nom + " !\n");
		}

		public void ajouterEmploye(Employe employe) {
		  employes.add(employe);
		}
		}
	  
		  


