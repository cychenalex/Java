package tw.org.iii.tutor;

public class Alex06 {

	public static void main(String[] args) {
		int year = 2024;
		boolean isLeap;
		
		if (year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0))
		{
			isLeap = true;
		}
		else
		{
			isLeap = false;
		}
		
		
		System.out.printf("%d年為%s年",year, isLeap?"閏":"平");
	}

}
