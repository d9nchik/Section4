import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char symbol = input.next().charAt(0);

        if (symbol >= 'A' && symbol <= 'F') {
            int number = 4 + 'A' - symbol;
            System.out.println("The numeric value for grade " + symbol + " is " + number);
        } else
            System.out.println(symbol + " is an invalid grade");
    }
}
