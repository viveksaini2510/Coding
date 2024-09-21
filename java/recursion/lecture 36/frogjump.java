import java.util.*;
public class frogjump{

    static int best(int []h, int n, int idx){
        if(idx ==n-1) return 0;

        int op1 = Math.abs(h[idx]-h[idx+1])+best(h, n, idx+1);
        if(idx==n-2) return op1;
        int op2 = Math.abs(h[idx]-h[idx+2])+best(h, n, idx+2);

        return Math.min(op1, op2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h []= {10,30,40,20};
        System.out.println(best(h, h.length , 0));
    }
}