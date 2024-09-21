class pen{
    String color;
    String type;  //ball or gel

    public void write(){
        System.out.println("Write something ");
    }

    public void printcolor(){
        System.out.println(this.color);
    }

    public void printtype(){
        System.out.println(this.type);
    }
}

// make another class

class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class oops{
    public static void main(String[] args) {
        // pen pen1 = new pen();
        // pen1.color= "blue";
        // pen1.type = "gel";

        // pen1.write();


        // pen pen2= new pen();
        // pen2.color ="black";
        // pen2.type= "ball";

        // pen1.printcolor();
        // pen1.printtype();
        // pen2.printcolor();
        // pen2.printtype();


     
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "vivek saini";
        s2.name = "Anshika srivastava";
        s1.age = 22;
        s2.age = 21;
        s1.printinfo();
        s2.printinfo();
    }
}