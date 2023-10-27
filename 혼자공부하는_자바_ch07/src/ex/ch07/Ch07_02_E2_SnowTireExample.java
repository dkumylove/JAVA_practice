package ex.ch07;

public class Ch07_02_E2_SnowTireExample {

	public static void main(String[] args) {
		Ch07_02_E2_SnowTire snowTire = new Ch07_02_E2_SnowTire();
		Ch07_02_E2_Tire tire = snowTire;
		
		snowTire.run();
		tire.run();

	}

}
