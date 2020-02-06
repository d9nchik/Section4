import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter binary digits (0000 to 1111): ");
        String binaryNumber = input.next();

        int firstDigit = (int) binaryNumber.charAt(0) - '0';
        int secondDigit = (int) binaryNumber.charAt(1) - '0';
        int thirdDigit = (int) binaryNumber.charAt(2) - '0';
        int fourthDigit = (int) binaryNumber.charAt(3) - '0';

        int number = firstDigit * 8 + secondDigit * 4 + thirdDigit * 2 + fourthDigit;

        System.out.println("The decimal value is " + number);
    }
}
