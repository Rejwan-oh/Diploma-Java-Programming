import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter radius: ");
        double r = sc.nextDouble();

        double area = (22*r*r)/7;

        System.out.println("the area is: "+ area);
    }
}
