import java.util.*;

public class occuranceofelement
{

   static int countOccurance(int arr[], int x){
 
    int count =0;
    
    for(int i=0; i<arr.length; i++)
    {
        if(arr[i]==x){
            count++;
        }
    }
    System.out.println("The element "+x+" is occured "+ count+ " times");
 return 0;
 }
    


    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of Arry");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter array Elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is:");
        
            for(int i=0; i<n; i++)
         {
            System.out.print(arr[i] +" ");
         }
        System.out.println();
        System.out.println("Enter the element whose occurance has to be count:");
        int x = sc.nextInt();
        occuranceofelement obj = new occuranceofelement();
        obj.countOccurance(arr, x);
    }
    

    
}
