package Java_Mastery.Foundation;
import java.util.Scanner;

public class ScannerLearn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        System.out.println("\n-----User Description------");
        System.out.println("Your name is: " +name);
        System.out.println("Your age is: " +age);
        System.out.println("Your percentage is: " +percentage);

        sc.close();
    }
}
