package tw.org.iii.tutor;

import java.util.Scanner;

public class Alex02 {

	public static void main(String[] args) {
		//1. 輸入
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入第一個個整數：");
		int num01 = scanner.nextInt();
		System.out.print("請輸入第二個整數：");
		int num02 = scanner.nextInt();
		int sum = num01 + num02;
		System.out.printf("%d + %d = %d\n", num01, num02, sum);
		int rot = num01 / num02;
		int rut = num01 % num02;
		System.out.printf("%d + %d = %d ...... %d", num01, num02, rot, rut);
	}

}
