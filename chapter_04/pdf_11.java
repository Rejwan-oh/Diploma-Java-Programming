// fibonacci number

import java.util.Scanner;

public class pdf_11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");

        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
