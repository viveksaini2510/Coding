
import bank.bank;

class Shape{
    String color;

    public void area(){
        System.out.println("display area");
    }

}

class Triangle extends Shape{
    public void area(int l , int h){
        System.out.println(1/2*l*h);
    }
}

class Cricle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int a){
        System.out.println(3/4*a*a);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";

        @SuppressWarnings("unused")
        bank.Account account1 = new bank.Account();
        account1.name = "customer1";
    }   
}
