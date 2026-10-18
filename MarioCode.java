public class MarioCode 
{
	private int lives; 
	private int coins;
	private boolean mario = false;

		public MarioCode(int i_coins, int i_lives) 
		{
			coins=i_coins;
			lives=i_lives;
		}

		public int getlives()
		{
			return lives;
		}
		public void setlives(int lives_A)
		{
			lives=lives_A;
		}

		public int getcoins()
{
	return coins;
}
public void setcoins(int coins_A)
{
	coins = coins_A;
}
public String toString()
{
	return ("Mario Has " + lives + " lives and " + coins + " coins!");
}
	

}
