//constructor methods

class Student {
    int roll;
    String name;
    int mark;

    public Student(){
         roll = 842537;
         name = "rejo";
         mark = 76;
        System.out.println("Roll is: "+roll);
        System.out.println("Name is: "+name);
        System.out.println("Mark is: "+mark);

    }
}

public class unit7_01 {
    public static void main(String[] args) {

        Student s = new Student();
    }

}
