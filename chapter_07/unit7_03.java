//only methods

class Sum1{
    int add(int a , int b){
        return a+b;
    }
}

public class unit7_03 {
    public static void main(String[] args) {
        Sum1 n = new Sum1();

        System.out.println("sum is: "+n.add(20,30));
    }
}
