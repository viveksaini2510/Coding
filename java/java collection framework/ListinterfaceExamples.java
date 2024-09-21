import java.util.*;

public class ListinterfaceExamples{

    static void ArrayListExamples(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(1));
        l.set(1, 10);
        System.out.println(l);
        System.out.println(l.contains(10));
    }

    static void StackExamples(){
        Stack<String> st = new Stack<>();
        st.push("pw");
        st.push("skills");
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.empty());
        
    }

    public static void main(String[] args) {
       // ArrayListExamples();
       StackExamples();
    }
}