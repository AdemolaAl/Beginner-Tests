import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("What is your age? ");
        int age = scanner.nextInt();
        
        System.out.println("Your Name is " + name + " and you are " + age + " years old.");
        scanner.close();
    }
}
