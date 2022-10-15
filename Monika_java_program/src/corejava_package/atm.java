package corejava_package;
class withdraw
{
	int amt_with = 1000;
	void show()
	{
		System.out.println("Super Class");
	}
}

public class atm  extends withdraw{
	int amt_left = 15000;
	void show()
	{
		super.show();
		System.out.println("Child class");
		
	}
}
