package tw.org.iii.tutor;

public class Alex28 {

	public static void main(String[] args) {
		Alex263 obj1 = new Alex263();
		Alex261 obj2 = new Alex263();
		Alex262 obj3 = new Alex263();
		
	}

}

/*interface -> 定義規格*/

interface Alex261
{
	void m1();
	void m2();
	//void m3(){}    // Error -> 不能有實作方法
}

interface Alex262
{
	void m3();
	void m4();
}

class Alex263 extends Object implements Alex261, Alex262    //implements -> interface實作的關鍵字
{
	public void m1()
	{
		
	}
	
	public void m2()
	{
		
	}
	
	public void m3()
	{
		
	}
	
	public void m4()
	{
		
	}
}

interface Alex264 extends Alex261, Alex262
{
	void m5();
}

class Alex265 implements Alex264
{
	public void m1()
	{
		
	}
	
	public void m2()
	{
		
	}
	
	public void m3()
	{
		
	}
	
	public void m4()
	{
		
	}
	
	public void m5()
	{
		
	}
}