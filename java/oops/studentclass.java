package oops;



public class studentclass {

    public static void main(String[] args) {

        System.out.println(Student.getnumberofstudents());
        Student s1 = new Student("vivek", 52,36.2);
        
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);
        System.out.println(s1.schoolname);
        System.out.println(s1.getnumberofstudents());
        Student s2 = new Student("viveksaini", 55,86.2);
        System.out.println(s2.getnumberofstudents());
    }
    
}
