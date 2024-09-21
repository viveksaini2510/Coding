import java.util.*;
public class gcd{
    static int hcf(int a, int b){
        for( int i = Math.min(a, b) ; i>=1 ;i--){
            if(a%i==0&& b%i==0){
                return i;
            }
        }
        return 1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The gcd is : "+hcf(a, b));
    }
}