import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(6);
        System.out.println(a);
        System.out.println(a.remove(2));
        System.out.println(a);
    }    
}
