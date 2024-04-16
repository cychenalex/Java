package tw.org.iii.tutor;

public class Alex24 {

	public static void main(String[] args) {
		Alex247 obj1 = new Alex247();
		obj1.m1();
		Alex244 obj2 = new Alex244();
		Alex244 obj3 = new Alex245();
		Alex244 obj4 = new Alex247();
		obj4.m1();
		Alex247 obj5 = (Alex247)obj4;    //Alex247
		obj5.m4();
//		Alex246 obj6 = (Alex246)obj4;    // Error -> 物件導向只認直系血親
		atact(obj2);
	}
	
	static void atact(Alex244 obj)
	{
		 obj.m1();
		 if (obj instanceof Alex247)
		 {
			 ((Alex247)obj).m4();
		 }
		 else if (obj instanceof Alex245)
		 {
			 ((Alex245)obj).m2();
		 }
	}

}

class Alex244
{
	Alex244(){System.out.println("Alex224");}
	void m1() {System.out.println("Alex244:m1()");}
}

class Alex245 extends Alex244
{
	Alex245(){System.out.println("Alex245");}
	void m1() {System.out.println("Alex245:m1()");}
	void m2() {System.out.println("Alex245:m2()");}
}

class Alex246 extends Alex244
{
	Alex246(){System.out.println("Alex246");}
	void m1() {System.out.println("Alex246:m1()");}
	void m3() {System.out.println("Alex246:m3()");}
}
class Alex247 extends Alex245
{
	Alex247(){System.out.println("Alex247");}
	void m1(){System.out.println("Alex247:m1()");}
	void m4(){System.out.println("Alex247:m4()");}
}