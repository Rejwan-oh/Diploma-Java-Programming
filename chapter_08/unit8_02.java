//overridden method

class animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class dog extends animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class unit8_02{
    public static void main(String[] args) {
        animal a = new dog();
        a.sound();
    }
}
