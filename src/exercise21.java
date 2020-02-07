import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String ssn = input.next();
        System.out.print(ssn + " is ");

        if (Character.isDigit(ssn.charAt(0)) && Character.isDigit(ssn.charAt(1)) &&
                Character.isDigit(ssn.charAt(2)) && Character.isDigit(ssn.charAt(4)) &&
                Character.isDigit(ssn.charAt(5)) && Character.isDigit(ssn.charAt(7)) &&
                Character.isDigit(ssn.charAt(8)) && Character.isDigit(ssn.charAt(9)) &&
                Character.isDigit(ssn.charAt(10)) && (ssn.length() == 11)) {
            System.out.print("a valid");
        } else
            System.out.print("an invalid");
        System.out.println(" social security number");
    }
}
