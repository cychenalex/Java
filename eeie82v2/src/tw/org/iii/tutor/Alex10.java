package tw.org.iii.tutor;

public class Alex10 {

	public static void main(String[] args) {
		int[] ary = new int[3];
		System.out.println(ary[0]);
		System.out.println(ary[1]);
		System.out.println(ary[2]);
		System.out.println(ary.length);
		
		System.out.println("----------");
		
		ary[0] = 0;
		ary[2] = 10;
		for (int i = 0 ; i < ary.length ; i++)
		{
			System.out.println(ary[i]);
		}
		
		System.out.println("----------");
		
		for (int j : ary)
		{
			System.out.println(j);
		}
		

	}

}
