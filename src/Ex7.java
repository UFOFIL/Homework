public class Ex7 {
    public static void main(String[] args) {

        int first;
        int second;
        int third;
        int number;
        int example;
        int armstrong;
        System.out.print("The armstrong numbers is: ");

        for (number = 100; number <= 1000; number++) {
            example = number;
            first = example % 10;
            example /= 10;
            second = example % 10;
            example /= 10;
            third = example % 10;

            armstrong = (first * first * first) + (second * second * second) + (third * third * third);

            if (armstrong == number) {
                System.out.print(armstrong + " ");
            }
        }
    }
}
