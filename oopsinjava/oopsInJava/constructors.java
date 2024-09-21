class Student{
    String name ;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

     //TYPE 1 - this is non-perimeterised constructor

    // Student(){
    //     System.out.println("Constructor called");
    // }


    //TYPE 2 - this is perimeterised constructor

    // Student(String name, int age){
    //     this.name = name;
    //     this.age =age;
    // }


    // TYPE 3 - this is copy constructor

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    // a more constructor we have to make for s1 
    Student(){

    }
}

public class constructors {
    public static void main(String[] args) {
        Student s1 = new Student(); 
        s1.name = "vivek";
        s1.age = 22;
        Student s2 = new Student(s1);
        s2.printinfo();

    }
    
}
