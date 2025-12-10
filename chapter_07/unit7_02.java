//method overloading

class Sum{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class unit7_02 {
    public static void main(String[] args) {
        Sum n = new Sum();


        System.out.println("sum (2 numbers): "+ n.add(10,20));
        System.out.println("sum (3 numbers): "+ n.add(10,20,30));
    }
}
