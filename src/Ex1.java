import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        System.out.println(" Welcome to my program!" + "\n Please, enter the values of quadratic equation (a, b, c).");
        double a, b, c, dis, root1, root2;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println("Your values is: " + a + ", " + b + ", " + c);

        dis = (b * b) - 4 * a * c;
        System.out.println("Discriminant is: " + dis);
        if (dis >= 0) {
            System.out.println("Root of discriminant is: " + Math.sqrt(dis));
            if (dis == 0) {
                root1 = (-b) / (2 * a);
                System.out.println("There is only one root. It is: " + root1);
            } else if (dis != 0) {
                root1 = ((-b) + Math.sqrt(dis)) / (2 * a);
                root2 = ((-b) - Math.sqrt(dis)) / (2 * a);
                System.out.println("There is two roots: " + root1 + " , " + root2);
            }
        } else {
            System.out.println("We don't have a roots here.");
        }
        System.out.println("Goodbye!");
    }
}
