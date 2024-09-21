import java.util.*;
public class Issorted {
    static boolean sorted(int arr[], int idx){    
        if(arr[idx+1]>=arr[idx]){
            return true;
        }
        return sorted(arr, idx+1);
    }
    public static void main(String[] args) {
        int a[]= {1,2,3,4,9,5,1};
        if(sorted(a, 0)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    } 
}
