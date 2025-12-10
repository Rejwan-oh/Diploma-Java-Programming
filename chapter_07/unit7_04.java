//copy constructor

class Box {
    int value;

    Box(int v) {
        value = v;
    }

    Box(Box b) {
        value = b.value;
    }
}

public class unit7_04 {
    public static void main(String[] args) {
        Box b1 = new Box(10);
        Box b2 = new Box(b1);

        System.out.println(b1.value);  // 10
        System.out.println(b2.value);  // 10
    }
}
