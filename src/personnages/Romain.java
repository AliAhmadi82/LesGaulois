package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
		this.nbEquipement = 0;
		assert isInvariantVerified() : "La force d'un Romain doit être positive ou nulle.";
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	private boolean isInvariantVerified() {
		return force >= 0;
	}

	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0 : "La force du coup reçu doit être positive.";

		int ancienneForce = force;

		force = force - forceCoup;
		if (force < 1) {
			force = 0;
			parler("J'abandonne !");
		} else {
			parler("Aie");
		}

		assert force < ancienneForce : "La force d’un Romain a diminué.";
		assert isInvariantVerified() : "La force d'un Romain doit être positive ou nulle.";
	}

	@Override
	public String toString() {
		return nom;
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
	}
}