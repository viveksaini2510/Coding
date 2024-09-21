import java.util.*;
public class problem1{

    static void multiple(int n, int k){
        if(k==1){
            System.out.println(n);
            return ;
        }
        multiple(n, k-1);
        System.out.println(n*k);
        
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Enter value of k :");
        int k = sc.nextInt();
        System.out.println("The multiples of "+n+" are: ");
        multiple(n, k) ;
    }
}