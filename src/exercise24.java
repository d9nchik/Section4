import java.util.Scanner;

public class exercise24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first country: ");
        String first = input.next();
        System.out.print("Enter the second country: ");
        String second = input.next();
        System.out.print("Enter the third country: ");
        String third = input.next();

        System.out.print("The three countries in descending order are ");

        if (first.compareToIgnoreCase(second) >= 0 && first.compareToIgnoreCase(third) >= 0) {
            if (second.compareToIgnoreCase(third) >= 0)
                System.out.println(first + " " + second + " " + third);
            else
                System.out.println(first + " " + third + " " + second);
        } else if (second.compareToIgnoreCase(first) >= 0 && second.compareToIgnoreCase(third) >= 0) {
            if (first.compareToIgnoreCase(third) >= 0)
                System.out.println(second + " " + first + " " + third);
            else
                System.out.println(second + " " + third + " " + first);
        } else {
            if (first.compareToIgnoreCase(second) >= 0)
                System.out.println(third + " " + first + " " + second);
            else
                System.out.println(third + " " + second + " " + first);
        }
    }
}
