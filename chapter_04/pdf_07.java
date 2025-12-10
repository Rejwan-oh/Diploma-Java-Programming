//roots check

import java.util.Scanner;

public class pdf_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;  // discriminant

        if (d > 0) {
            // two real roots
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Two real roots: " + r1 + " and " + r2);
        }
        else if (d == 0) {
            // one real root
            double r = -b / (2 * a);
            System.out.println("One real root: " + r);
        }
        else {
            // no real root
            System.out.println("No real root possible (imaginary roots)");
        }
    }
}

