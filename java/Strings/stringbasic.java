import java.util.*;
public class stringbasic{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = "abcd";
        for(int i=0; i < s.length(); i++){
            for(int j=i+1;j<=s.length(); j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
}