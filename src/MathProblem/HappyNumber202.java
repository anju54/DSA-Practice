package MathProblem;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {

    public static boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        while(n!=1){
            sum = calculateSquareSum(n);
            n = sum;
            if(set.contains(sum)){
                return false;
            }
            set.add(n);
        }
        return true;
    }

    public static int calculateSquareSum(int n){
        int digit = 0;
        int sum = 0;
        while(n>0){
            digit = n % 10;
            sum = digit*digit + sum;
            n= n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 2;
        System.out.println( isHappy(num) );
    }
}
