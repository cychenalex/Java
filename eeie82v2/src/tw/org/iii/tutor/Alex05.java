package tw.org.iii.tutor;

import java.util.Scanner;

public class Alex05 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		if (a++ <= 10 && b-- >= 3)
		{
			System.out.printf("OK; a = %d, b = %d\n", a, b);
			System.out.printf("XX; a = %d, b = %d", a, b);
		}
		System.out.println();
		int c = 2, d = 3;
		System.out.println(c & d);
	}

}
