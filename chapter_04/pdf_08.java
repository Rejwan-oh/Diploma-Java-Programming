//n series negative index

import java.util.Scanner;

public class pdf_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter N: ");
        int n = sc.nextInt();

        while (n>=1){
            System.out.println(n);
            n--;
        }
    }
}
