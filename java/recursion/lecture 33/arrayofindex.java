import java.util.*;
public class arrayofindex {
    static ArrayList<Integer> allindices(int arr[], int n ,int target, int idx){
        ArrayList<Integer> ans = new ArrayList<>();
        if(idx>=n){
            return ans;
        }

        


        if(arr[idx]==target){
            ans.add(idx);
        }

        ArrayList<Integer> smallAns = allindices(arr, n, target, idx+1);

        ans.addAll(smallAns);
        return ans;

    }

    public static void main(String[] args) {
        int a[]= {1,2,4,4,5,4};
        int target = 4;
        ArrayList<Integer> ans = allindices(a, a.length, target, 0);
    
    for(Integer i: ans){
        System.out.print(i+" ");
    }
    }
}

