class Cafetiere {
	int doses;
	int dosesMax;
	Cafetiere(int doses, int dosesMax) {
		this.doses = doses;
		this.dosesMax = dosesMax;
	}	
	Cafetiere(int dosesMax) {
		this.dosesMax = dosesMax;
	}
	Cafetiere() {
		this.doses=10;
		this.dosesMax=10;
	}
	boolean isEmpty() {
		if(doses==0) return true;
		return false;
	}
	boolean refill(int doses) {
		if(doses+this.doses>this.dosesMax) return false;
		this.doses+=doses;
		return true;
	}
	boolean coffee() {
		if(doses==0) return false;
		doses-=1;
		return true;
	}
	public String toString() {
		return doses+"/"+dosesMax;
	}
}