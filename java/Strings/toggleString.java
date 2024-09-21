public class toggleString {

    public static void main(String[] args) {
        String s = "PhYSiCS";
        for(int i=0; i<s.length(); i++){
            boolean flag=true;
            char ch= s.charAt(i);
            if(ch ==' ') continue;
            int asci = (int)ch;
            if(asci>=97) flag = false;
            if(flag==true){
              asci+=32;
              char dh = (char)asci;
              s = s.substring(0, i) + dh + s.substring(i+1);
            }
            
            else{
              asci-=32;
              char dh = (char)asci;
              s = s.substring(0, i) + dh + s.substring(i+1);
            }
          }
          System.out.println("The toggle string is :");
          System.out.println(s);

    }
    
}
