import java.util.*;
public class gcd2{
    static int hcf(int a, int b){
       while(a%b!=0){
        int rem = a%b;
        a=b;
        b=rem;
       }
       return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The gcd is : "+hcf(a, b));
    }
}