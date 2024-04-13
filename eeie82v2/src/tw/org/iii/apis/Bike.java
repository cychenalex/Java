package tw.org.iii.apis;

public class Bike {    /*類別*/
	double speed;    /*屬性*/    //public -> 公開看見
	
	public void upSpeed()    //void -> 方法沒有傳回值
	{
		if (speed < 1)
		{
			speed = 1;
		}
		else
		{
			speed = speed * 10.5;
		}
	}
	
	public void downSpeed()
	{
		if (speed > 1)
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
