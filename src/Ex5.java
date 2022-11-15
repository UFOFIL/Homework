import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        int num1=0;
        int num2=1;
        int num3;
        for (int i=1;i<=nu;i++){
            //прибавляем
            num3=num1+num2;
            System.out.println(num3);
            if(number==num3){
                System.out.println("Yes it is Fibonachi");
            }
            else {
                System.out.println("Not Fibonachi");
            }
            //обновляем
            num1=num2;
            num2=num3;
        }
