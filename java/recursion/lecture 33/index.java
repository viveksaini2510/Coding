import java.util.*;
public class index {
    static void findindices(int arr[], int n ,int target, int idx){
        if(idx>=n){
            return;
        }
        if(arr[idx]==target){
            System.out.print(idx +" ");
        }
        findindices(arr, n, target, idx+1);
    }

    public static void main(String[] args) {
        int a[]= {1,2,3,6,2,4,2,1,3,6};
        int target = 2;
        findindices(a, a.length, target, 0);
    }
}
