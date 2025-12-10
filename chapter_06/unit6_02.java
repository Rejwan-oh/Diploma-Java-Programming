// create TRIANGLE CLASS AND solve area of triangle

import java.util.Scanner;

public class TRIANGLE{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter A: ");
        int a = sc.nextInt();

        System.out.println("enter B: ");
        int b = sc.nextInt();

        System.out.println("enter C: ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && c+a>b){
            double s = (a+b+c)/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("the area is : "+ area);
        }
        else {
            System.out.println("triangle not possible");
        }
    }
}
