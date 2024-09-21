import java.util.*;
public class count {
    static int countdigit(int n){
        if(n<10 && n>=0){
            return 1;
        }
       return countdigit(n/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int n = sc.nextInt();
        System.out.println(countdigit(n));
    }
    
}
