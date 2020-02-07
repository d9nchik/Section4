import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userLine = input.nextLine();

        System.out.println("The length of string is " + userLine.length());
        System.out.println("The last symbol is " + userLine.charAt(userLine.length() - 1));
    }
}
