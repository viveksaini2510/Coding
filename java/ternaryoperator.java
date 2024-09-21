import java.util.*;
public class ternaryoperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        String ans= (num%2==0)?"even":"odd";
        System.out.println(ans);
    }
}