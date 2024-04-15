package tw.org.iii.apis;

public class Bike /*extends Object*/ {    /*類別*/
	protected double speed;    /*屬性*/
	//public -> 公開看見 
	//private -> 生命範圍僅在最外圍括號內 / 本類別
	//protected -> 使用給繼承的子類別
	
	public void upSpeed()    //void -> 方法沒有傳回值
	{
		if (speed < 1)
		{
			speed = 1;
		}
		else
		{
			speed = speed * 1.5;
		}
	}
	
	public void downSpeed()
	{
		if (speed >= 1)
		{
			speed = speed * 0.5;
		}
		else
		{
			speed = 0;
		}
	}
	
	public double getSpeed()
	{
		return speed;    //return
	}
}
