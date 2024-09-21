import java.util.*;
public class string{

    static String removechar(String s,int idx){
        
        if(idx==s.length()){
            return "" ;
        }
        String smallans = removechar(s, idx+1);
        char curr = s.charAt(idx);
        if(curr !=  'a'){
         return curr + smallans;
        }
        else
        {
            return smallans;
        }
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s = sc.nextLine();
        
        System.out.println(removechar(s,0));
    }
}
