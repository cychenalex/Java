package tw.org.iii.tutor;

public class Alex26 {

	public static void main(String[] args) {
		Alex242 obj = new Alex242();
		obj.m1();

	}

}

/* Override -> 子類別中的方法與父類別中的方法具有相同的方法名稱、參數、型別 */

class Alex241
{
	void m1()
	{
		System.out.println("Alex241:m1()");
	}
	public void m1(int a)    //相同訪問權限
	{
		System.out.println("Alex241:m(int)");
	}
}

class Alex242 extends Alex241
{
	void m1()
	{
		super.m1();    //此為物件方法，非建構式
		System.out.println("Alex242:m1()");
		super.m1();
	}
	void m2()
	{
		super.m1();
		this.m1();
	}
	public void m1(int a)    //相同訪問權限
	{
		System.out.println("Alex242:m1(int)");
	}
}

class Alex243 extends Alex242
{
	void m1()
	{
		super.m1();    // 只認父類別
	}
}