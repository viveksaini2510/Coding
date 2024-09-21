package oops;

public class fractions {

    public static fraction sub(fraction f1 , fraction f2){
        int numerator = f1.num*f2.den - f1.den*f2.num;
        int denomenator = f1.den*f2.den;
        fraction f3 = new fraction(numerator, denomenator);
        return f3;
    }

    public static fraction add2(fraction f1 , fraction f2){
        f1.num= f1.num*f2.den + f1.den*f2.num;
        f1.den = f1.den*f2.den;
        
        return f1;
    }



    public static fraction add(fraction f1 , fraction f2){
        int numerator = f1.num*f2.den + f1.den*f2.num;
        int denomenator = f1.den*f2.den;
        fraction f3 = new fraction(numerator, denomenator);
        return f3;
    }

    public static fraction mul(fraction f1 , fraction f2){
        int numerator = f1.num*f2.num;
        int denomenator = f1.den*f2.den;
        fraction f3 = new fraction(numerator, denomenator);
        return f3;
    }

    public static fraction divide(fraction f1 , fraction f2){
        int numerator = f1.num*f2.den;
        int denomenator = f1.den*f2.num;
        fraction f3 = new fraction(numerator, denomenator);
        return f3;
    }

    public static int gcd(int num, int den){
        int min = Math.min(num, den);
        for(int i=min; i>=1; i--){
            if(num%i==0 && den%i==0){
                return i;
            }
           
        }
        return min;
    }

    public static void print(fraction f){
        System.out.println(f.num + "/" + f.den);
    }

    public static class fraction{
        int num; 
        int den;

        public fraction(int num , int den){
            this.num = num;
            this.den = den;
            simplify();
        }

        public void simplify() {
           int hcf = gcd(num,den);
           num/=hcf;
           den/=hcf;
        }


    }
    
    public static void main(String[] args) {

        fraction f1 = new fraction(7,3);
        print(f1);
        fraction f2 = new fraction(35,21);
       
        print(f2);
        fraction f3 = add(f1,f2);
        print(f3);
        // fraction f4 = mul(f1, f2);
        // print(f4);
        // fraction f5 = sub(f1, f2);
        // print(f5);
        // fraction f6 = divide(f1, f2);
        // print(f6);
        add2(f1, f2);
        
        print(f1);
        



    
}
    
}
