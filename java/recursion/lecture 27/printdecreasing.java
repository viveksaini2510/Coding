import java.util.*;
public class printdecreasing {

    static void printdecresing(int n){
        if(n==1){
            System.out.print(n +" ");
            return;
        }
        System.out.print(n+" ");
        printdecresing(n-1);

       


        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        printdecresing(n);
        
    }    
}