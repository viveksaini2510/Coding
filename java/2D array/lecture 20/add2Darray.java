import java.util.*;
public class add2Darray {

    static void printarray(int arr[][]){
        for(int i=0; i<arr.length ; i++){
            for(int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }

    static void add(int a[][] , int r1, int c1, int b[][], int r2 , int c2){
        if(r1!=r2||c1!=c2){
            System.out.println("The dimensions of array are not same . please enter same dimensional array .");
            return;
        }
        

        int sum[][] = new int[r1][c1];
        for(int i=0 ; i< r1; i++){
            for(int j =0; j<c1;j++){
                sum[i][j]= a[i][j]+ b[i][j];
            }
        }
        System.out.println("The sum of array is :");
        printarray(sum);
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

        System.out.println("Enter the number of rows and columns of b: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        System.out.println("Enter Elements of array b:");
        int b[][] = new int [r2][c2];

        for(int i = 0; i<r2; i++){
            for(int j=0; j<c2 ;j++){
                b[i][j]= sc.nextInt();
            }
        }

        System.out.println("Array a is :");
        printarray(a);
        System.out.println("Array b is :");
        printarray(b);
        add(a, r1, c1, b, r2, c2);


    }
    
}
