package AugustChallenge;

public class PowerOfFour {

    public static boolean isPowerOfFourUsingBitLogic(int num){

        if ( ( num & (num-1) ) == 0 && num%3==1 )  // bit manipulation
            return true;

        return false;
    }

    public static boolean isPowerOfFour(int num) { // recursion

        if (num==0)
            return false;

        if (num==1)
            return true;

        if( num%4 ==0 )
            return isPowerOfFour(num/4);

        return false;
    }

    public static void main(String[] args) {
        int num = 0;

        System.out.println( isPowerOfFourUsingBitLogic(num));
    }
}

