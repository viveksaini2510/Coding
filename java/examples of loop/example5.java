import java.util.*;
public class example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int i;
        int fact=1;
        if(n==0||n==1)
        {
            System.out.println("Factorial= " +n);
        }
        else
        {
            for (i=1; i<=n; i++)
        {
            fact=fact*i;
            System.out.println("Factorial of "+i+ "  is:" + fact);
        }
            
        }
        
       
    }
    
}
