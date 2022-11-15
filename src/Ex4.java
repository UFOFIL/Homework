
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int number, simple;
        System.out.println("Enter your number.");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        boolean isSuccessed = false;
        simple = 0;
        int simpleCount = 0;
        int counter = 0;
        for (int i = 1; !isSuccessed; i++) {
            counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
                if (i == j && counter == 2) {
                    System.out.println(j);
                    simpleCount++;
                }
            }
            if (simpleCount == number) {
                isSuccessed = true;
            }

        }
    }
}

