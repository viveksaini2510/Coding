import java.util.*;
class recursion{
    static void printincresing(int n){
        if(n>=1){
            System.out.print(n+" ");
            printincresing(n-1);
            
        }
       return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        printincresing(n);
        
    }
}