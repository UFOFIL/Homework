

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        System.out.println("Welcome to my program. Enter 3 numbers of accounts series");
        int base, term, step, result;
        Scanner scanner = new Scanner(System.in);

        base = scanner.nextInt();
        System.out.println("Your base number is: " + base);
        term = scanner.nextInt();
        System.out.println("Your term number is: " + term);
        step = scanner.nextInt();

        while (step <= 0) {
            System.out.println("Please enter the positive number.");
            step = scanner.nextInt();
        }

        System.out.println("Your step number is: " + step + "\n");
        System.out.println("The result of series is: " + "\n");

        result = base;
        System.out.print(base + "\t");
        for (int i = 1; i < step; i++) {
            result += term;
            System.out.print(+result + "\t");
        }
        System.out.println("\n" + "\n" + "Goodbye!");
    }
}
