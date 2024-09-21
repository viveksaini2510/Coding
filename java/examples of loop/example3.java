import java.util.Scanner;
public class example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev =0;
        int a=0;
        while(n!=0)
        {
            a = n%10;
            rev = rev*10+ a;
            n/=10;
            
        }
        System.out.println("Reverse of the given number is:" +rev);

    }
    
}
