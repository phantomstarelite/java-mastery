package Java_Mastery.Foundation;
import java.util.Scanner;

public class MultipleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Is you are learning java (true/false): ");
        boolean isLearningJava = sc.nextBoolean();

        System.out.println("\n -------User Details---------");
        System.out.println("Your name is: " +name);
        System.out.println("Your age is: " +age);
        System.out.println("Is Interested In Learning Java: " +isLearningJava);
    }
}
