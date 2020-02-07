import java.util.Scanner;

public class exercise26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your amount: ");
        String dollars = input.next();//"11.56"


        System.out.println("Your dollars: " +(dollars.substring(0,dollars.indexOf('.')))+"$ "+
                dollars.substring(dollars.indexOf('.')+1) +" cents.");
    }
}
