import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angle = 18;

        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        System.out.println("The coordinates of five points on the pentagon are");

        System.out.printf("(%.2f, %.2f)\n", (radius * Math.cos(Math.toRadians(angle))),
                (radius * Math.sin(Math.toRadians(angle))));
        angle+=72;
        System.out.printf("(%.2f, %.2f)\n", (radius * Math.cos(Math.toRadians(angle))),
                (radius * Math.sin(Math.toRadians(angle))));
        angle+=72;
        System.out.printf("(%.2f, %.2f)\n", (radius * Math.cos(Math.toRadians(angle))),
                (radius * Math.sin(Math.toRadians(angle))));
        angle+=72;
        System.out.printf("(%.2f, %.2f)\n", (radius * Math.cos(Math.toRadians(angle))),
                (radius * Math.sin(Math.toRadians(angle))));
        angle+=72;
        System.out.printf("(%.2f, %.2f)", (radius * Math.cos(Math.toRadians(angle))),
                (radius * Math.sin(Math.toRadians(angle))));
    }
}
