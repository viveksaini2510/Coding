package stack;
import java.util.*;
public class displaystack {


    public static void displayreverse(Stack<Integer> st){
        if(st.size()==0)return ;
        int top = st.pop();
        System.out.print( top + " ");
        displayreverse(st);
        st.push(top);
    }

    public static void display(Stack <Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        display(st);
        System.out.print(top+" ");
        st.push(top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("The stack is :");
        // Stack <Integer> rt = new Stack<>();
        // while (st.size()>0) {
        //     rt.push(st.pop());
            
        // }
        // while (rt.size()>0) {
        //    int x = rt.pop();
        //    System.out.print(x+" ");
        //    st.push(x);

        // }
        
        // by using array

        // int n = st.size();
        // int arr[]= new int[n];
        // for(int i = n-1 ; i>=0 ; i--){
        //     int x = st.pop();
        //     arr[i] = x;
        // }

        // for(int i =0 ; i<n; i++){
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }


        // by recursion
            display(st);
            System.out.println();
        displayreverse(st);
        

    }
    
}
