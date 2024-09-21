import java.util.*;
public class arraylist {
    public static class ArrayList{
        int arr[]= new int[2];
        int index =0;
        int size=0;
        public void add(int ele){
            if(size==arr.length){
                int brr[] = Arrays.copyOf(arr,arr.length*2);
                arr= brr;
            }
            arr[index]=ele;
            index ++;
            size++;
        }

        public void set(int index , int val){
            arr[index]= val;
        }

    }

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(2);
        arr.add(1);
        arr.add(3);
        System.out.println(arr.size);
        arr.set(0,5);
        
        System.out.println(arr);
    }
}
