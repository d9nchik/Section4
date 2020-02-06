import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char symbol = input.next().charAt(0);

        if (symbol == 'A' || symbol == 'B' || symbol == 'C'
                || symbol == 'a' || symbol == 'b' || symbol == 'c')
            System.out.println("The corresponding number is 2");
        else if (symbol == 'D' || symbol == 'E' || symbol == 'F'
                || symbol == 'd' || symbol == 'e' || symbol == 'f')
            System.out.println("The corresponding number is 3");
        else if (symbol == 'G' || symbol == 'H' || symbol == 'I'
                || symbol == 'g' || symbol == 'h' || symbol == 'i')
            System.out.println("The corresponding number is 4");
        else if (symbol == 'J' || symbol == 'K' || symbol == 'L'
                || symbol == 'j' || symbol == 'k' || symbol == 'l')
            System.out.println("The corresponding number is 5");
        else if (symbol == 'M' || symbol == 'N' || symbol == 'O'
                || symbol == 'm' || symbol == 'n' || symbol == 'o')
            System.out.println("The corresponding number is 6");
        else if (symbol == 'P' || symbol == 'Q' || symbol == 'R' || symbol == 'S'
                || symbol == 'p' || symbol == 'q' || symbol == 'r' || symbol == 's')
            System.out.println("The corresponding number is 7");
        else if (symbol == 'T' || symbol == 'U' || symbol == 'V'
                || symbol == 't' || symbol == 'u' || symbol == 'v')
            System.out.println("The corresponding number is 8");
        else if (symbol == 'W' || symbol == 'X' || symbol == 'Y' || symbol == 'Z'
                || symbol == 'w' || symbol == 'x' || symbol == 'y' || symbol == 'z')
            System.out.println("The corresponding number is 9");
        else
            System.out.println(symbol + " is an invalid input");
    }
}
