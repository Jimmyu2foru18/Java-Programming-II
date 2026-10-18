import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Student[] students = new Student[5];


        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();

            students[i] = new Student(name, age, address, email);
        }


        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.print("Enter an address to search for students: ");
        String searchAddress = scanner.nextLine();
        System.out.println("Students living at " + searchAddress + ":");
        for (Student student : students) {
            if (student.getAddress().equalsIgnoreCase(searchAddress)) {
                System.out.println(student.toString());
            }
        }

        // Print students with email addresses containing "gmail.com"
        System.out.println("Students with email addresses containing 'gmail.com':");
        for (Student student : students) {
            if (student.getEmail().contains("gmail.com")) {
                System.out.println(student.toString());
            }
        }

        scanner.close();
    }
}

