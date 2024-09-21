import java.util.TreeSet;

public class SetInterface {



    public static void main(String[] args) {
       // HashSet<Integer> st = new HashSet<>();
        TreeSet<Integer> st = new TreeSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(25);
        st.add(85);
        st.add(4);
        st.add(45);
        System.out.println(st);
        // st.add(1);
        // st.add(1);
        // st.add(2);
        // System.out.println(st);
        // st.remove(2);
        // System.out.println(st.contains(2));
        // System.out.println(st.size());
    }
}
