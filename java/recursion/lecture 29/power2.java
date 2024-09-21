import java.util.*;
public class power2 {
    static int powerofnumber(int p, int q){
        if(q==0){
            return 1;
        }
       if(q%2==0){
        return powerofnumber(p, q/2) *powerofnumber(p, q/2) ;
       }
        
        return p * powerofnumber(p, q/2) *powerofnumber(p, q/2) ;
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base digit");
        int p = sc.nextInt();
        System.out.println("Enter the power digit");
        int q = sc.nextInt();
        System.out.println("The answer is :");
        System.out.println(powerofnumber(p,q));
    }
    
}
