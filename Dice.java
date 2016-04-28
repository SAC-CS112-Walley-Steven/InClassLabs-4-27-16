
public class Dice {
	
	public static int OneThrow()
	{
		int randNum = 1+(int)(Math.random()*6);
		return randNum;
	}

	public static int Throw(int dices, int bounces)
	{
		int randNum = (dices*(1+(int)(Math.random()*6)))+bounces;
		return randNum;
	}
}
