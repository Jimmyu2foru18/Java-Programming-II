package Loopexexercises;

public class Multiples4 {

	public static void main(String[] args) 
	{
		//multiples of 4, how many contain #123 in a row
		
		int x= 123;
		String value =Integer.toString(x);
		 
		for(int i=0;i<value.length();i++)
		{
		 x= x * 2;
		}
		System.out.println(value.contains(value));

	}

}
