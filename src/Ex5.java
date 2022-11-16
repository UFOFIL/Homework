import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my program. Please, Enter your number.");
        int number = scanner.nextInt();
        int num1 = 0;
        int num2 = 1;
        int result;
        for (int i = 1; i <= number; i++) {
            result = num1 + num2;
            num1 = num2;
            num2 = result;
            if (result == number) {
                System.out.println("This is a Fibonachi number");
                break;
            }

            if (result > number) {
                System.out.println("This is Not a Fibonachi number");
                break;
            }
        }
        System.out.println("Goodbye!");

    }
}










