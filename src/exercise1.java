import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = 5 * s * s / 4 / Math.tan(Math.PI / 5);

        System.out.println("The area of the pentagon is " + (int) (area * 100 + 0.5) / 100.0);
    }
}
