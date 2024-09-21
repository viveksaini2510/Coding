import java.util.*;
public class problem2 {
    static int sumofnumber(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return sumofnumber(n-1) - n;
        }
        return sumofnumber(n-1) + n;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println(sumofnumber(n));
    }
    
}
