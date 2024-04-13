package tw.org.iii.tutor;

import tw.org.iii.apis.Bike;

public class Alex17 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		int b2 = 10;
		System.out.println(b2);
		System.out.println(b1);    /*Bike 記憶體位置 ->
									*tw.org.iii.apis.Bike@2ff4acd0*/

//		b1.speed = 123;
//		System.out.println(b1.speed);    // 123.0
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		b1.downSpeed();
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		
		System.out.println(b1.getSpeed());
	}

}
