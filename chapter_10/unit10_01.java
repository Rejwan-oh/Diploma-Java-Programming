//interface use

interface Printable {
    void print();
}

class A implements Printable {
    public void print() {
        System.out.println("Printing...");
    }
}

public class unit10_01 {
    public static void main(String[] args) {
        A obj = new A();
        obj.print();
    }
}
