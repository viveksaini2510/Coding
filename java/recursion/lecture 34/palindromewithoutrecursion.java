import java.util.Scanner;

public class palindromewithoutrecursion {

    static boolean palindrome(String s, int l, int r){
        while(l>=r){
            return true;
        }
        if((s.charAt(l)==s.charAt(r))&&palindrome(s, l+1, r-1)){
            return true;
        }
        return false;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        if(palindrome(s, 0, s.length()-1)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    
}
