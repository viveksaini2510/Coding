
class algebra{
 
    

    int add(){
        int p=25;
        int q=63;

        return  p + q;

    }
    int sub(){
        int p=25;
        int q=63;
        return  p-q;
    }

    void demo(){
        
        
        int a = 5;
        System.out.println(a);
        
        for(int i = 0; i < 5; i++)
        {
            
            int b = 10;
            System.out.println(b);
        }
        if(true){
        int b=100;
        System.out.println(b);
        }
       
    }
    }



public class scopeofvariable{
    public static void main(String[] args){
       algebra obj = new algebra();
       obj.demo();
    }
}