package gestion;

public class Personne {

	  private String nom;
	  private String adresse;
	  private int numeroDeTelephone;

	  public Personne(String nom, String adresse, int numeroDeTelephone) {
	    this.nom = nom;
	    this.adresse = adresse;
	    this.numeroDeTelephone = numeroDeTelephone;
	  }

	public String getNom() {
	    return nom;
	  }

	  public String getAdresse() {
	    return adresse;
	  }

	  public int getNumeroDeTelephone() {
	    return numeroDeTelephone;
	  }

}
