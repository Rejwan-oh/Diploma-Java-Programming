//arrays sort numbers

import java.util.Arrays;
import java.util.Scanner;

public class unit5_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 10 numbers: ");
        int a[] =new int[10];

        for (int i = 0; i<10; i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("sorted numbers: ");

        for (int num: a){
            System.out.println(num);
        }
    }
}
