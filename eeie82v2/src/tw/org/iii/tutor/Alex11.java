package tw.org.iii.tutor;

public class Alex11 {

	public static void main(String[] args) {
		int p1, p2, p3, p4, p5, p6;
		p1 = p2 = p3 = p4 = p5 = p6 = 0;
		
		for (int i = 0 ; i < 100 ; i++)
		{
			int point = (int)(Math.random() * 6) + 1;    //先運算再強制轉型
			
			if (point == 1)
			{
				p1++;
			}
			else if (point == 2)
			{
				p2++;
			}
			else if (point == 3)
			{
				p3++;
			}
			else if (point == 4)
			{
				p4++;
			}
			else if (point == 5)
			{
				p5++;
			}
			else
			{
				p6++;
			}
		}

		System.out.printf("1點出現%d次\n", p1);
		System.out.printf("2點出現%d次\n", p2);
		System.out.printf("3點出現%d次\n", p3);
		System.out.printf("4點出現%d次\n", p4);
		System.out.printf("5點出現%d次\n", p5);
		System.out.printf("6點出現%d次\n", p6);
	}

}
