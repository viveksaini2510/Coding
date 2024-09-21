import java.util.*;
public class multiply2Darray {

    static void printarray(int arr[][]){
        for(int i=0; i<arr.length ; i++){
            for(int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }

    static void multiply(int a[][], int r1,int c1,int b[][], int r2, int c2){
        if(c1!=r2){
            System.out.println("Multiply of matrices is not possible . Please enter valid matrix:");
            return;
        }
        int mul[][]= new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2; j++){
                for(int k =0; k<c1; k++){
                    /*
                    ul[i][j]= ith row of a * jth col of b
                     */
                    mul[i][j]+= a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Multiplication of 2 matrices:");
        printarray(mul);
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
        multiply(a, r1, c1, b, r2, c2);
    }
    
}
