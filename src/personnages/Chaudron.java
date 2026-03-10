package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	public Chaudron() {
		this.quantitePotion = 0;
		this.forcePotion = 0;
	}
	public boolean resterPotion() {
		return quantitePotion > 0;
	}
	public void remplir(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	public int getForcePotion() {
		return forcePotion;
	}
	public void diminuerQuantite() {
		if (quantitePotion > 0) {
			quantitePotion--;
		}
	}
}
