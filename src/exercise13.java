import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char symbol = input.next().charAt(0);

        if ((symbol>='A'&&symbol<='Z')||(symbol>='a'&&symbol<='z')){
            if (symbol=='A'||symbol=='E'|| symbol=='I'||symbol=='O'||symbol=='U' ||symbol=='Y'
            || symbol=='a' || symbol=='e'||symbol=='i' ||symbol=='o'||symbol=='u'||symbol=='y')
                System.out.println(symbol + " is a vowel");
            else
                System.out.println(symbol + " is a consonant");
        }
        else
            System.out.println(symbol + " is an invalid input");
    }
}
