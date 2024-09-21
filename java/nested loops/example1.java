import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();
        int i;
        int j;
        // for (i=1;i<=r;i++)
        // {
        //     for(j=1; j<=c; j++)
        //     {
        //         System.out.print("*");

        //     }
        // System.out.println();
        // }

        for (i=1;i<=r;i++)
        {
            for(j=1; j<=c; j++)
            {
                if(i==1||i==r||j==1||j==c)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }   
    }
}
