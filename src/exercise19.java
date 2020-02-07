import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String number = input.next();

        int firstDigit = number.charAt(8)-'0';
        int secondDigit = number.charAt(7)-'0';
        int thirdDigit = number.charAt(6)-'0';
        int fourthDigit = number.charAt(5)-'0';
        int fifthDigit = number.charAt(4)-'0';
        int sixthDigit = number.charAt(3)-'0';
        int seventhDigit = number.charAt(2)-'0';
        int eighthDigit = number.charAt(1)-'0';
        int ninthDigit = number.charAt(0)-'0';

        int checkSum = (firstDigit * 9 + secondDigit * 8 + thirdDigit * 7 +
                fourthDigit * 6 + fifthDigit * 5 + sixthDigit * 4 +
                seventhDigit * 3 + eighthDigit * 2 + ninthDigit) % 11;
        System.out.print("The ISBN-10 number is " + ninthDigit + eighthDigit + seventhDigit +
                sixthDigit + fifthDigit + fourthDigit +
                thirdDigit + secondDigit + firstDigit);
        if (checkSum < 10)
            System.out.println(checkSum);
        else
            System.out.println("X");
    }
}
