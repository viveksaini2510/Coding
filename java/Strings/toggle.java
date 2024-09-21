import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :");
        StringBuilder s = new StringBuilder(sc.nextLine());

        for(int i=0; i<s.length(); i++){
          boolean flag=true;
          char ch= s.charAt(i);
          if(ch ==' ') continue;
          int asci = (int)ch;
          if(asci>=97) flag = false;
          if(flag==true){
            asci+=32;
            char dh = (char)asci;
            s.setCharAt(i, dh);
          }
          
          else{
            asci-=32;
            char dh = (char)asci;
            s.setCharAt(i, dh);
          }
        }
        System.out.println("The toggle string is :");
        System.out.println(s);
    }
    
}
