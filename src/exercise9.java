import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char symbol = input.next().charAt(0);

        System.out.println("The ASCII code for character " + symbol +
                " is " + (int) symbol);
    }
}
