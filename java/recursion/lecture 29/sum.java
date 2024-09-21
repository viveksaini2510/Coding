import java.util.*;
public class sum{
    static int sumofdigit(int n){
        if(n<10){
            return n;
        }
      return sumofdigit(n/10) +  n%10 ;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int n = sc.nextInt();
        System.out.println(sumofdigit(n));
        
    }
}