package tw.org.iii.tutor;

public class Alex25 {

	public static void main(String[] args) {
		Alex231 obj = new Alex231();
		obj.m1((byte)2);
//		obj.m1((byte)1, (byte)2);    //The method m1(int, byte) is ambiguous(混淆不清) for the type Alex231
//		int a = (byte)2;
	}

}

/*Overload 多型*/
class Alex231
{
	void m1()
	{
		System.out.println("m1()");
	}
	
	int m1(int a)
	{
		System.out.println("m1(int)");
		return 0;
	}
	
	void m1(byte b)
	{
		System.out.println("m1(byte)");
	}
	
	void m1(int a, byte b)
	{
		System.out.println("m1(int, byte)");
	}
	
	void m1(int a, int b)
	{
		System.out.println("m1(int, int)");
	}
	
	void m1(byte a, int b)
	{
		System.out.println("m1(byte, int)");
	}
}
