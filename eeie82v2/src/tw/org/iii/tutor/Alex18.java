package tw.org.iii.tutor;

import tw.org.iii.apis.scooter;

public class Alex18 {

	public static void main(String[] args) {
		scooter s1 = new scooter("white");
		s1.upSpeed();
		s1.upSpeed();
		s1.upSpeed();
		s1.chGear(2);
		System.out.println(s1.getSpeed());
		System.out.println(s1.getColor());
	}

}
