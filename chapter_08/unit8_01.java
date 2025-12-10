//multilevel inheritance

class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("Baby dog can weep");
    }
}

public class unit8_01 {
    public static void main(String[] args) {
        BabyDog bd = new BabyDog();

        bd.eat();   // from Animal
        bd.bark();  // from Dog
        bd.weep();  // from BabyDog
    }
}
