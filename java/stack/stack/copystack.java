package stack;

import java.util.Scanner;
import java.util.Stack;

public class copystack {

    

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of input");
        n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i =0 ; i<n ; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("The stack is :");
        System.out.println(st);


        // reverse stack

        Stack <Integer> rt = new Stack<>();
        while (st.size()>0) {
            rt.push(st.pop());
            
        }
        System.out.println("The reverse of the stack is :");
        System.out.println(rt);

        // copy stack means reverse rt stack

        Stack<Integer> gt = new Stack<>();
        while (rt.size()>0) {
            gt.push(rt.pop());
        }
        System.out.println("the copy of original stack is :");
        System.out.println(gt);
        
    }
    
}
