package tw.org.iii.tutor;

public class Alex27 {

	public static void main(String[] args) {
//		Alex251 obj1 = new Alex251();
		Alex251 obj2 = new Alex252();
		Alex251 obj3 = new Alex253();
		obj2.m2();
		obj3.m2();
	}

}

/* Overload 多型*/

abstract class Alex251    //abstract抽象類別 -> 該類別無法直接建構出物件實體
{
	Alex251()
	{
		System.out.println("Alex251()");
	}
	
	void m1()
	{
		System.out.println("Alex251:m1()");
	}
	
	abstract void m2();    //抽象方法 -> abstract抽象類別
}

class Alex252 extends Alex251
{
	Alex252()
	{
		System.out.println("Alex252()");
	}
	
	void m2()    //在子類別定義父類別的抽象類別 -> Override
	{
		System.out.println("Alex252:m2()");
	}
}

class Alex253 extends Alex251
{
	Alex253()
	{
		System.out.println("Alex253()");
	}
	
	void m2()
	{
		System.out.println("Alex253:m2()");
	}
}
