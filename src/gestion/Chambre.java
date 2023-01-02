package gestion;

//Classe représentant une chambre de l'hôtel

public class Chambre {

	private int numero;
	  private double tarif;
	  private boolean estOccupee;

	  public Chambre(int numero, double tarif) {
	    this.numero = numero;
	    this.tarif = tarif;
	    estOccupee = false;
	  }

	  public int getNumero() {
	    return numero;
	  }

	  public double getTarif() {
	    return tarif;
	  }

	  public boolean isEstOccupee() {
	    return estOccupee;
	  }

	  public void setEstOccupee(boolean estOccupee) {
	    this.estOccupee = estOccupee;
	  }
	}
	


