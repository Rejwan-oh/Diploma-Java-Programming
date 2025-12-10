//nested interface

class Outer {
    interface Inner {
        void message();
    }
}

class Test implements Outer.Inner {
    public void message() {
        System.out.println("Hello from Nested Interface");
    }
}

public class unit10_02 {
    public static void main(String[] args) {
        Test t = new Test();
        t.message();
    }
}
