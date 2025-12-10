//n series sum by do while

import java.util.Scanner;

public class pdf_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter N: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        do{
            sum += i*i;
            i++;
        }
        while (i<=n);
            System.out.println("result "+sum);

    }
}
