import java.util.Scanner;
public class printsubsequence {

    static void printSSQ(String s ,String currAns){
        if(s.length()==0){
            System.out.print(currAns+" , ");
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        printSSQ(remString, currAns+curr);
        printSSQ(remString, currAns);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println("The subsequences of "+s+ " is : ");
        printSSQ(s, " ");


    }
}
