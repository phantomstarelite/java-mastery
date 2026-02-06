package Java_Mastery.Foundation;

import java.util.Scanner;

public class Caso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the option: ");

        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Start");
                break;

            case 2:
                System.out.println("Stop");
                break;
                
            default:
                System.out.println("Exit");
                break;    
        }
    }
}
