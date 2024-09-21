package oops;


public class Student {
    String name;
    int rno;
    double percent;
    final String schoolname = "gps";
    private static int numberofstudents;

    public Student(String name, int rno, double percent){
        this.name= name;
        this.rno = rno;
        this.percent = percent;
        numberofstudents++;
    }

    public static int getnumberofstudents(){
        return numberofstudents;
    }

}