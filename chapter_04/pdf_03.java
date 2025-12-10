//grade check by switch

import java.util.Scanner;

public class pdf_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter mark (out of 100): ");
        int mark=sc.nextInt();

        switch (mark/10){
            case 10:
            case 9:
            case 8:
                System.out.println("A+");
                break;
            case 7:
                System.out.println("A");
                break;
            case 6:
                System.out.println("B");
                break;
            case 5:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            default:
                System.out.println("Chill, Have a nice day");
                break;
        }
    }
}
