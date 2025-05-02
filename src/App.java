import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine();
        System.out.println("Enter RollNO");
        int rollNo = scanner.nextInt();
        Student student = new Student(name, rollNo);
        scanner.close();
    }
}
