package AugustChallenge;

public class PowerOfFour {

    public static boolean isPowerOfFour(int num) {

        if (num==0)
            return false;

        if (num==1)
            return true;

        if( num%4 ==0 )
            return isPowerOfFour(num/4);

        return false;
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println( isPowerOfFour(num));
    }
}

