package Recursion;

public class GCD {

    public static int gcd(int a,int b){

        if (a==0)
            return b;
        if(b==0)
            return a;

        if(a==b)
            return a;

        if (a>b)
           return gcd(b,a%b);
        else
           return gcd(a%b,b);
    }

    public static void main(String[] args) {
        int a = 270;
        int b = 192;
        int result = gcd(a,b);
        System.out.println(result);
    }
}
