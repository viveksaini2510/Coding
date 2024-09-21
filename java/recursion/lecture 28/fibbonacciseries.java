import java.util.*;
public class fibbonacciseries {
    static int fn(int n ){
        if(n==0||n==1)
        return n;
        return fn(n-1)+fn(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        for(int i=0 ; i<=n; i++){
          System.out.print(fn(i) +" "); 
        }
        
    }
    
}
