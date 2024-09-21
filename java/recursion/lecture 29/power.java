import java.util.*;
public class power {
  static int powerofnumber(int p, int q){
    if(q==0){
        return 1;
    }
   
    return powerofnumber(p, q-1) *p;

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
