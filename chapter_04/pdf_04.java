//(-) with for loop

import java.util.Scanner;

public class pdf_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number: ");
        int a = sc.nextInt();

        System.out.println("enter second number: ");
        int b = sc.nextInt();

        int result = a;

        for (int i = 0; i<b; i++){
            result--;
        }
        System.out.println("result: "+result);
    }
}
