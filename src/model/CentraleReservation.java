package model;

public class CentraleReservation<P extends Formulaire> {
	EntiteReservable<P>[] entités;
	int nbEntites;
	public CentraleReservation(EntiteReservable<P>[] entités) {
		this.entités = entités;
		nbEntites = 0;
	}
}
