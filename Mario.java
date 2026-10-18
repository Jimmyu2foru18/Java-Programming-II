/** 
 * @author James McGuigan
 * CS 5210 Programming 2
 * Prof B.
 */
public class Mario 
{
	public static void main(String[] args) 
	{
		MarioCode MyMario = new MarioCode(60,5);
		
		MyMario.setcoins(20);
		MyMario.setlives(20);
		
		System.out.println(MyMario);
	}
}
