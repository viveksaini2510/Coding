import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        int i=1;
        int ans=1;
        for (i=1;i<=b; i++)
        {
            ans=ans*a;
        }
        System.out.println("answer = " +ans);

    }
    
}
