class Monnayeur {
	int[] fond = new int[5];
	Monnayeur(int[] fond) {
		for(int i=0; i<5; i++) {
			this.fond[i]=fond[i];
		}
	}
	Monnayeur() {
		this(new int[] {0,0,0,0,0});
	}
	void coinIn(int coin) {
		switch(coin){
		case(10):
			this.fond[0]++;
			break;
		case(20):
			this.fond[1]++;
			break;
		case(50):
			this.fond[2]++;
			break;
		case(100):
			this.fond[3]++;
			break;
		case(200):
			this.fond[4]++;
			break;
		}

	}
	int balance() {
		int balance=0;
		balance+=this.fond[0]*10;
		balance+=this.fond[1]*20;
		balance+=this.fond[2]*50;
		balance+=this.fond[3]*100;
		balance+=this.fond[4]*200;
		return balance;
	}
	boolean isEmpty() {
		for(int n:fond) {
			if(n!=0) return false;
		}
		return true;
	}
	public String toString() {
		return "[10c : "+fond[0]+", 20c : "+fond[1]+", 50c : "+fond[2]+", 1e : "+fond[3]+", 2e : "+fond[4]+"]";
	}
}