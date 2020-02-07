import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String s1 = input.next();
        System.out.print("Enter string s2: ");
        String s2 = input.next();

        System.out.print(s2 + " is ");

        if (!s1.contains(s2))
            System.out.print("not ");
        System.out.println("a substring of " + s1);
    }
}
