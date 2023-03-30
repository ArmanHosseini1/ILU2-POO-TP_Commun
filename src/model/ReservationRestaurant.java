package model;

public class ReservationRestaurant extends Reservation{
	int numService;
	int numTable;
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.numService = numService;
		this.numTable = numTable;
	}
	public String toString() {
		String chaine = "Le " + jour + "/" + mois + " : table n�" + numTable;
		if(numService==1) {
			chaine += " pour le premier service.";
		}
		else {
			chaine += " pour le deuxième service.";
		}
		return chaine;
	}
}
