class Student{
    String name ;
    int age ;

    // same name single functions cab do more than one operations
    public void printinfo(String name){
        System.out.println(name);
    }

    public void printinfo(int age){
        System.out.println(age);
    }

    public void printinfo(String name, int age){
        System.out.println(name + " " + age);
    }

}

public class polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "vivek";
        s1.age = 22;

        s1.printinfo(s1.name);
        s1.printinfo(s1.age);
        s1.printinfo(s1.name , s1.age);
    }
    
}
