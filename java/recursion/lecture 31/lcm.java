import java.util.*;
public class lcm{
    static int hcf(int a, int b){
       if(b==0){
        return a;
       }
       return hcf(b, a%b);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The gcd is : "+hcf(a, b));
        System.out.println("The lcm of the numbers : ");
        int lcm = a*b/hcf(a, b);
        System.out.println(lcm);
    }
}