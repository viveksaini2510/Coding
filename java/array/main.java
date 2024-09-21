class ArrayExample{
    
    // void sumofarray(){
    //     int arr[]={1,2,5,7,9,7,4,10,2};
    //     int sum = 0;
    //     for(int i = 0; i<arr.length; i++){
    //         sum=sum+arr[i];

    //     }
    //     System.out.println(sum);
    // }


    // void maxvalue(){
    //     int arr[]={1,2,5,7,9,7,4,10,2};
    //     int max=0;
    //     int i=0;
    //     int a = 0;
    //     for( i=0; i<arr.length; i++){
    //         if(max<arr[i])
    //         max=arr[i];
    //         if(arr[i]==max){
    //             a=i;
    //         }
            
    //     }
    //     System.out.println("maximum value of array is " +max+ " at index " + a);
    //     System.out.println(arr.length);
    //}

    void searchelement(){
        
        int arr[]={2,3,4,5,6,7,1,5,8,2,4,6};
        int ans=7;
        for(int i=0; i<arr.length; i++){
            if(ans==arr[i]){
                System.out.println("Element "+ans+" is found at index "+i);
            }
        }
    }

}

public class main {
    public static void main(String[] args) {
       
        ArrayExample obj = new ArrayExample();
       // obj.sumofarray();
      // obj.maxvalue();
      obj.searchelement();
    }
    
}
