import java.util.*;

public class mapinterrfaceExamples {


    public static void main(String[] args) {
        Map<Integer,String> mp = new HashMap<>();
        mp.put(3, "aman");
        mp.put(1, "riya");
        mp.put(2, "Rohan");
        mp.putIfAbsent(1, "vivek");
        System.out.println(mp.entrySet());
        System.out.println(mp);
        System.out.println(mp.get(2));
        System.out.println(mp.containsKey(4));
        System.out.println(mp.containsValue("riya"));
        System.out.println(mp.keySet());
        System.out.println(mp.values());

        // iterating over keys 

        for(Integer i : mp.keySet()){
            System.out.println(i);
        }
        for(var i : mp.values()){   // we can use var or String both
            System.out.println(i);
        }

        // iterate over key value mapping 

        for(var e : mp.entrySet()){
            System.out.println(e);     // can use e.getvalue() , e.getkeys()
        }
    }
}
