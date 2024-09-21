import java.util.*;
public class asciicode{
static void combination(String dig ,String [] kp ,String res){

    if(dig.length()==0){
        System.out.print(res +" ");
        return;
    }
    int currNum = dig.charAt(0)-'0'; 
    String currChoices = kp[currNum];
    for(int i=0; i<currChoices.length();i++){
        combination(dig.substring(1), kp, res+ currChoices.charAt(i));
    }
    
    } 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a digit  :");
        String dig = sc.nextLine();
        String[] kp={"","", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(dig, kp, "");
    }

}