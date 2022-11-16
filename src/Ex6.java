import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int userInput;
        int finalSum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my program. Please enter your full number.");
        userInput = scanner.nextInt();
        System.out.println("Your number is : "+userInput);

        int sum=0;
        while (userInput!=0){
            sum=sum+(userInput%10);
            userInput=userInput/10;

        }
        System.out.println("The sum of numbers is: "+sum);
        System.out.println("Goodbye!");
    }
}







