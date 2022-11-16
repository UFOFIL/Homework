import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3;
        for (int i = 1; i <= number; i++) {
            num3 = num1 + num2;
            if (num3==number){
                System.out.println("Fibonachi");
                boolean isFibo=true;
            }
            num1 = num2;
            num2 = num3;

        }

    }

}







