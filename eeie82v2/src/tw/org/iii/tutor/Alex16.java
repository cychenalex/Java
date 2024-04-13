package tw.org.iii.tutor;

public class Alex16 {

	public static void main(String[] args) {
		/*兩數交換*/
		
		int a = 10, b = 3;

		a = a + b;    //a = 13
		b = a - b;    //b = 10
		a = a - b;    //a = 3
		
		System.out.printf("a = %d, b = %d\n", a, b);
		
		int c = 10, d = 3;
		
		c = c ^ d;    //c = 13
		d = c ^ d;    //d = 10
		c = c ^ d;    //c = 3
		
		System.out.printf("c = %d, d = %d", c, d);

	}

}
