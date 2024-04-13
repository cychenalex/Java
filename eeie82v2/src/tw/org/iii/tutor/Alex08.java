package tw.org.iii.tutor;

public class Alex08 {

	public static void main(String[] args) {
		int a = 0;
		for (func01() ; a < 10 ; func02())
		{
			System.out.println(a++);
		}
		System.out.println("------------");
		System.out.println(a);
	}
	
	static void func01() {
		System.out.println("Start");
	}
	
	static void func02() {
		System.out.println("End");
	}

}
