import java.util.Scanner;

public class exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee’s name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        System.out.println("\nEmployee Name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay Rate : $" + payRate);

        double grossPay = hours * payRate;
        System.out.println("Gross Pay: $" + grossPay);

        System.out.println("Deductions:");
        System.out.printf("\tFederal Withholding (20.0%%): $%.2f\n", (grossPay * federalTax));
        System.out.printf("\tState Withholding (9.0%%): $%.2f\n", (grossPay * stateTax));
        System.out.printf("\tTotal Deduction : $%.2f\n", (grossPay * (stateTax + federalTax)));
        System.out.printf("NetPay: $%.2f\n", (grossPay * (1 - stateTax - federalTax)));
    }
}
