import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        int i;
        int j;
        for(i=1; i<=r; i++)
        {
            for(j=1; j<=r-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(i);
                for(int l=r-i; l<=r; l++)
                {
                    System.out.print(" ");
                }
                
                
            }
            System.out.println();
        }
    }
    
}
