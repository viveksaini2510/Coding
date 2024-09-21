import java.util.*;
public class multidimarray {

    static void printarray(int arr[][]){
           for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr[i].length ;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int m = sc.nextInt();
        System.out.println("Enter array's Elements:");
        int arr[][] = new int [n][m];

        for(int i = 0; i<n; i++){
            for(int j=0; j<m ;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        

        // int arr[][]= {
        //     {1,2,3} ,
        //     {4,5,6},
        //     {7,8,9}
        //              };
        System.out.println("The array elements is:");
         printarray(arr);
    }
}
