import java.util.*;
public class printnumber{

    static void printincreasing(int n){
        if(n==1){
            System.out.print(n +" ");
            return;
        }
        printincreasing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        printincreasing(n);

    }
}
