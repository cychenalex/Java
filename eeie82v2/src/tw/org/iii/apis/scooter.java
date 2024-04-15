package tw.org.iii.apis;

public class scooter extends Bike {    /*extends -> 繼承 / 延伸 -> 父類別*/
	
	private int gear;
	private String color;
	
//	public scooter()
//	{
//		color = "red";
//	}
	
	public scooter(String color)
	{
		// super() -> 自動呼叫
		this.color = color;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public int chGear(int gear)
	{
		if (gear >= 0 && gear <= 4)
		{
			this.gear = gear;    // this -> 本類別的物件實體
		}
		return this.gear;
	}
	
	public void upSpeed()
	{
		if (speed < 1)
		{
			speed = 1;
		}
		else
		{
			speed = speed * 10.5 * gear;
		}
	}
}
