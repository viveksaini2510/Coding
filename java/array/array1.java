import java.util.*;

class arrayExample{
    void demoArray1(){
        int ages[]= new int[3];
        

      ages[0] = 25;
      ages[1] = 12;
      ages[2]= 14;
    //   System.out.println(ages[0]);
    //   System.out.println(ages[1]);
    //   System.out.println(ages[2]);

      System.out.println(ages.length);


       for(int age : ages){
        System.out.println(age);
      }

      int i = 0;
      while(i<3){
        System.out.println(ages[i]);
        i++;
      }
    }
//       void demoArray2(){
//         String name[] = new String[5];
//         float weights[]= new float[4];

//         name[0]= "Himanshu Saini";
//         name[1]= "Deepanshu Saini";
//         name[2]= "vivek saini";

//         System.out.println(name[0]);
//         System.out.println(name[1]);
//         System.out.println(name[2]);

//         int arr[][]= new int[5][5];
//         arr[0][0] = 25;
//         arr[0][1]= 12;
//         arr[0][2]= 13;

//         arr[1][0] = 36;
//         arr[1][1]= 4;
//         arr[1][2]= 36;

//         arr[2][0] = 45;
//         arr[2][1]= 65;
//         arr[2][2]= 58;

//         System.out.println(arr[0][0]);
//         System.out.println(arr[0][1]);
//         System.out.println(arr[0][2]);
//         System.out.println(arr[1][0]);
//         System.out.println(arr[1][1]);
//         System.out.println(arr[1][2]);
//         System.out.println(arr[2][0]);
//         System.out.println(arr[2][1]);
//         System.out.println(arr[2][2]);
//         System.out.println(arr[0][0]);

//        int arr1[][][]= new int[2][2][2];

//       System.out.println(arr.length);
//       System.out.println(weights.length);
//       System.out.println(name.length);

//       for(int i=0; i<=2; i++){
//         System.out.println(name[i]);
//       }
      

    }

public class array1
{
    public static void main(String[] args) {
        arrayExample obj = new arrayExample();
        obj.demoArray1();
      //  obj.demoArray2();

        
    }
}