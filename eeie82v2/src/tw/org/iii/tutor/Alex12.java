package tw.org.iii.tutor;

public class Alex12 {

	public static void main(String[] args) {
		int[] p = new int[6];
		int point = 0;
		
		for (int i = 0 ; i < 100 ; i++)
		{
			point = (int)(Math.random() * 9) + 1;    //先運算再強制轉型
			p[point < 7 ? point - 1 : point - 4]++;
		}

		for (int i = 0 ; i < p.length ; i++)
		{
			System.out.printf("%d點出現%d次\n", i + 1, p[i]);
		}

	}

}
