import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Classroom myClassroom = new Classroom();

        String name;
        int id;

        while (true) {
            System.out.print("Enter the name (enter -1 to exit): ");
            name = scanner.nextLine();

            if (name.equals("-1")) {
                break;
            }

            System.out.print("Enter the ID: ");
            id = scanner.nextInt();

            if (id == -1) {
                break;
            }

            myClassroom.addStudent(name, id);
            scanner.nextLine();
        }

        scanner.close();

        myClassroom.printClassroom();
    }
}


