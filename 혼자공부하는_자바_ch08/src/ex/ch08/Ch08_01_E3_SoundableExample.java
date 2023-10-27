package ex.ch08;

public class Ch08_01_E3_SoundableExample {
	
	private static void printSound(Ch08_01_E3_Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		printSound(new Ch08_01_E3_Cat());
		printSound(new Ch08_01_E3_Dog());
	}
	
}
