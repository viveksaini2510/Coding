import java.util.Scanner;

public class palindrome {
    static String reverse(String s, int idx){
        if(idx== s.length()){
            return "";
        }
        String smallans = reverse(s, idx+1);
        return smallans + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String rev= reverse(s, 0);
        if(rev.equals(s)){
            System.out.println(s+" is palindrome");
        }
        else{
            System.out.println(s+ " is Not palindrome" );
        }
    }

    
}
