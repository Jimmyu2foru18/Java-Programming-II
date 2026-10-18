
public class Main {

	public static void main(String[] args) {
		StudentInh myStudent = new StudentInh("Jimmy", 700123);
		StudentAtInh myStudent2 = new StudentAtInh("Bob", 600123, "Football");
		{
			System.out.println(myStudent);
			System.out.println();
			System.out.println(myStudent2);
		}
	}
}
