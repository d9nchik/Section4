import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters:");
        String symbols = input.next();

        String output = "";

        switch (symbols.charAt(0)) {
            case 'I':
                output = "Information Management";
                break;
            case 'C':
                output = "Computer Science";
                break;
            case 'A':
                output = "Accounting";
                break;
            default:
                System.out.println("Invalid input");
                System.exit(1);
        }

        output += " ";

        switch (symbols.charAt(1)) {
            case '1':
                output += "Freshman";
                break;
            case '2':
                output += "Sophomore";
                break;
            case '3':
                output += "Junior";
                break;
            case '4':
                output += "Senior";
                break;
            default:
                System.out.println("Invalid input");
                System.exit(1);
        }

        System.out.println(output);
    }
}
