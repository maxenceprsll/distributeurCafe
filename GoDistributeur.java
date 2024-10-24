class GoDistributeur {
	public static void main(String[] args) {
		Distributeur d = new Distributeur();
		d.insertPot(140);
		System.out.println(d.buyCoffee(2));
		System.out.println(d.monnayeur);
		System.out.println(d.cafetiere);
	}
}