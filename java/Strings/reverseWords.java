public class reverseWords {

    public static void main(String[] args) {
        String s = "I am an online educator .";
        String ans = "";
        StringBuilder sd = new StringBuilder();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                sd.append(ch);
            }
            else{
                sd.reverse();
                ans+= sd;
                ans+= " ";
                sd = new StringBuilder();
            }
        }
        System.out.println(ans);
    }
    
}
