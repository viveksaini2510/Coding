package stack;
import java.util.*;
public class basic{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(36);
        st.push(5);

        // peak
        System.out.println(st.peek());
        System.out.println(st);

        st.pop();
        System.out.println(st.size());
        System.out.println(st);
        while (st.size()>1) {
            st.pop();
        }
        System.out.println(st);
    }
 }