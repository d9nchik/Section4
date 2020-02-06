import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        char symbol = input.next().charAt(0);

        int number = 0;

        if (symbol >= '0' && symbol <= '9') {
            number = symbol - '0';
        } else if ((symbol >= 'A' && symbol <= 'F')) {
            number = symbol - 'A' + 10;
        } else if ((symbol >= 'a' && symbol <= 'f')) {
            number = symbol - 'a' + 10;
        } else {
            System.out.println(symbol + " is an invalid input");
            System.exit(1);
        }


        int a = number % 2;
        number /= 2;
        int b = number % 2;
        number /= 2;
        int c = number % 2;
        number /= 2;
        int d = number % 2;

        System.out.println("The binary value is " + d + c + b + a);
    }
}
