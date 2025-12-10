//N series sum

import java.util.Scanner;

public class pdf_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter N: ");
        int n = sc.nextByte();

        int sum = 0;

        for (int i =0; i<=n; i++) {
            sum += i * i;
        }
        System.out.println("the sum is "+ sum);
    }

}
