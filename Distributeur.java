class Distributeur {
	Monnayeur monnayeur;
	Cafetiere cafetiere;
	int prixUnitaire;
	int pot;
	Distributeur() {
		monnayeur = new Monnayeur(new int[] {2,2,2,2,2});
		cafetiere = new Cafetiere();
		prixUnitaire = 70;
		pot = 0;
	}
	private void cashin(int amount) {
		while (amount>0){
			if(amount>=200) { 
				monnayeur.coinIn(200);
				amount-=200;
			} else if (amount>=100) {
				monnayeur.coinIn(100);
				amount-=100;
			} else if (amount>=50) {
				monnayeur.coinIn(50);
				amount-=50;
			} else if (amount>=20) {
				monnayeur.coinIn(20);
				amount-=20;
			} else if (amount>=10) {
				monnayeur.coinIn(10);
				amount-=10;
			}
		}
	}
	void insertPot(int amount) {
		pot+=amount;
	}
	int buyCoffee(int nbCoffee) {
		int coffeeBought=0;
		while(pot>=prixUnitaire && coffeeBought<nbCoffee){
			if(!cafetiere.isEmpty()) 
				pot-=prixUnitaire;
				cafetiere.coffee();
				coffeeBought++;
		}
		cashin(coffeeBought*prixUnitaire);
		pot=0;
		return coffeeBought;
	}
}