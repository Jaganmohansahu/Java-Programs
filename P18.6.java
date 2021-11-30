class Usecar
{
	public static void main(String[] args) {
		Maruti m = new Maruti(1001);
		Santro s = new Santro(5005);

		Car ref;

		ref = m; // ref = s; // to use santro car

		ref.openTank();
		ref.steering(1, 90);
		ref.braking(500);
	}
}