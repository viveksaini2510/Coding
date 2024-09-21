import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int a=0;
        int sum = 0;
        while(n!=0)
        {
            a=n%10;
            sum=sum+a;
            n=n/10;
            
        }
        System.out.println("the sum of digit of a given number is:"+sum);
    }
    
}
