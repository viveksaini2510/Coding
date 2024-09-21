package stack;

import java.util.Scanner;
import java.util.Stack;

public class reversestack {

    public static void reverse(Stack <Integer> st){
        if(st.size()==1) return;
        int top =st.pop();
        reverse(st);
        pushbottom(top,st);
    }

    public static void pushbottom(int x, Stack <Integer> st){
        if (st.size()==0) {
            st.push(x);
            return; 
        }
        int top  = st.pop();
        pushbottom(x, st);
        st.push(top);

    }


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st);
        reverse(st);
        System.out.println(st);


    }
    
}
