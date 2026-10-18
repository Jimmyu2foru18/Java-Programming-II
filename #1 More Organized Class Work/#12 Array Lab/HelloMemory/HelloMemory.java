/**
 * @author James McGuigan CS 5210 Programming 2
 */

public class HelloMemory {
	public static void main(String[] args) {
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		String helloWorld = "hello world!";

		try {

			for (char c : alphabet) {
				System.out.print(c);
				Thread.sleep(60);
			}
			System.out.println(" ");

			for (char c : alphabet) {
				if (helloWorld.indexOf(c) == -1) {
					System.out.print("\b");
					Thread.sleep(150);
				}
			}
			System.out.println(" ");

			System.out.print(helloWorld);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}