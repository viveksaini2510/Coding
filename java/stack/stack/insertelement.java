package stack;

import java.util.Scanner;
import java.util.Stack;

public class insertelement {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("The stack is :");
        System.out.println(st);

        Stack <Integer> rt = new Stack<>();
        while (st.size()>0) {
            rt.push(st.pop());
        }
        //System.out.println(rt);
        System.out.println("Now enter the element which is placed at bottom :");
        int a = sc.nextInt();
        st.push(a);
        while (rt.size()>0) {
            st.push(rt.pop());
        }
        System.out.println("The new stack is :");
        System.out.println(st);

        // enter element at any index

        System.out.println("Enter index number for entering element:");
        int n = sc.nextInt();
        System.out.println("now enter the element that at index = "+ n +" :");
        int b = sc.nextInt();
        
        while (st.size()>n) {
            rt.push(st.pop());
        }
        st.push(b);
        while (rt.size()>0) {
            st.push(rt.pop());
        }
        System.out.println("The new stack is :");
        System.out.println(st);

        



     }
}
