import java.util.*;
public class example4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        int ans = 0;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                ans=ans-i;
            }
            else
            {
                ans = ans + i ;
            }

        }
        System.out.println("answer is :"+ans);
    }
    
}