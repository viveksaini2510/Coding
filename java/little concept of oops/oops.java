public class oops{

    public static Fraction add(Fraction f1, Fraction f2){
        int numerator = f1.num*f2.den+ f1.den*f2.num;
        int denomenator = f1.den*f2.den;
        Fraction f3 = new Fraction(numerator, denomenator);
        return f3;
    }

    public static Fraction multiply(Fraction f1, Fraction f2){
        int numerator = f1.num*f2.num;
        int denomenator = f1.den*f2.den;
        Fraction f3 = new Fraction(numerator, denomenator);
        return f3;
    }

    public static Fraction subtract(Fraction f1, Fraction f2){
        int numerator = f1.num*f2.den - f1.den*f2.num;
        int denomenator = f1.den*f2.den;
        Fraction f3 = new Fraction(numerator, denomenator);
        return f3;
    }

    public static Fraction divide(Fraction f1, Fraction f2){
        int numerator = f1.num*f2.den;
        int denomenator = f1.den*f2.num;
        Fraction f3 = new Fraction(numerator, denomenator);
        return f3;
    }

    public static int gcd(int num, int den){
        int min = Math.min(num, den);
        for(int i=min;i>=1;i--){
            if(num%i==0 && den%i==0){
                return i;
            }
        }
        return min ;

    }
    public static class Fraction{
        int num;
        int den;

        public Fraction(int num , int den){
        this.num = num;
        this.den = den;
        simplify();
      }

      public void simplify(){
        int hcf = gcd(num, den);
        num=num/hcf;
        den= den/hcf;
      }
    }

    
    public static void main(String[] args) {
        Fraction f1= new Fraction(8,3);
        System.out.println("the first fraction is "+f1.num +"/"+f1.den);
        Fraction f2= new Fraction(7,3);
        System.out.println("the second fraction is "+f2.num +"/"+f2.den);

        
         Fraction f3 = add(f1, f2);
         System.out.println("the sum is "+f3.num +"/"+f3.den);
         Fraction f4 = subtract(f1, f2);
         System.out.println("the difference is "+f4.num +"/"+f4.den);
         Fraction f5 = multiply(f1, f2);
         System.out.println("the multiply is "+f5.num +"/"+f5.den);

         Fraction f6 = divide(f1, f2);
         System.out.println("the divide is "+f6.num +"/"+f6.den);

    }
}
