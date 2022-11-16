import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int size;
        System.out.println("Welcome to my program. Please, enter the size of rhombus.");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        while (size < 3 || size % 2 == 0) {
            System.out.println("Please enter an odd number greater than 3");
            size = scanner.nextInt();
        }
        int noOfColumns = 1;
        int noOfSpaces = size / 2;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= noOfSpaces; j++) {
                System.out.print(" ");
            }
            if (i < size / 2 + 1) {
                noOfSpaces = noOfSpaces - 1;
            } else {
                noOfSpaces = noOfSpaces + 1;
            }
            for (int j = 1; j <= noOfColumns; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < size / 2 + 1) {
                noOfColumns = noOfColumns + 2;
            } else {
                noOfColumns = noOfColumns - 2;
            }
        }
        System.out.println("\n"+" Goodbye!");

    }
}

