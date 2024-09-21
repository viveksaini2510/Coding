class student{
    String name;
    static String schoolname;

    public static void changeschool(){
        schoolname = "new school";
    }
}

public class static1 {
    public static void main(String[] args) {
        student.schoolname= "gps";
        student s1 = new student();
        s1.name = "vivek";
        s1.changeschool();
        System.out.println(s1.schoolname);
    }
}
