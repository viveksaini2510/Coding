import java.util.*;
public class reverse2Darray {

    static void printarray(int arr[][]){
        for(int i=0; i<arr.length ; i++){
            for(int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }

    static void reverse(int a[][] ,int r1, int c1){
        int rev[][]= new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1;j++){
                rev[i][j]= a[i][c1-j-1];
            }
        }
        printarray(rev);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of a: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter Elements of array a:");
        int a[][] = new int [r1][c1];

        for(int i = 0; i<r1; i++){
            for(int j=0; j<c1 ;j++){
                a[i][j]= sc.nextInt();
            }
        }

        // System.out.println("Enter the number of rows and columns of b: ");
        // int r2 = sc.nextInt();
        // int c2 = sc.nextInt();
        // System.out.println("Enter Elements of array b:");
        // int b[][] = new int [r2][c2];

        // for(int i = 0; i<r2; i++){
        //     for(int j=0; j<c2 ;j++){
        //         b[i][j]= sc.nextInt();
        //     }
        // }

        System.out.println("Array a is :");
        printarray(a);
        System.out.println("Reverse of array is :");
        reverse(a, r1, c1);
       
    }
    
}
