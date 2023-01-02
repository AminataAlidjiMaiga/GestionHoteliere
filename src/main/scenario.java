package main;
import gestion.Chambre;
import gestion.Client;
import gestion.Hotel;
import gestion.Reservation;
import gestion.Personne;
import gestion.Employe;

public class scenario {
	
	public static void main(String[] args) {
		// Création d'un hôtel avec 3 chambres
		Hotel hotel = new Hotel("Hôtel des Lilas");
		hotel.ajouterChambre(new Chambre(101, 75.0));
		hotel.ajouterChambre(new Chambre(102, 80.0));
		hotel.ajouterChambre(new Chambre(103, 90.0));

		// Création de deux clients
		Client client1 = new Client("Marie Dupont", "12, rue des Fleurs",0752552147);
		Client client2 = new Client("John Smith", "34, avenue des Arbres",07535575);
		
		// Création d'un employé et ajout à l'hôtel
		Employe employe = new Employe("Jane Doe", "56, boulevard des Étoiles", 987654321, "Réception", 12345);
		hotel.ajouterEmploye(employe);

		
		// Réservation de la chambre 101 par Marie Dupont pour 2 nuits
		hotel.reserverChambre(client1, 101, 2,employe);

		// Réservation de la chambre 102 par John Smith pour 3 nuits
		hotel.reserverChambre(client2, 102, 3,employe);

		// Tentative de réservation de la chambre 103, qui est déjà occupée
		hotel.reserverChambre(client1, 103, 2,employe);

		// Affichage de la facture de Marie Dupont
		hotel.afficherFacture(client1);

		// Affichage de la facture de John Smith
		hotel.afficherFacture(client2);

		// Tentative d'affichage de la facture d'un client qui n'a pas de réservation
		Client client3 = new Client("Salia Traore", "56, boulevard des Étoiles",0754);
		hotel.afficherFacture(client3);
		
		//Tentative de réservation d'une chambre déjà occuppée
		Client client4 = new Client("Aminata", "7, Chemin du scientifique",0754);
		hotel.reserverChambre(client4, 102, 4, employe);

	}

}
