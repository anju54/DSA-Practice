package MathProblem;

public class ValidPerfectSquare367 {

    public static boolean isPerfectSquare(int num) {

        if(num%2!=0)
            return false;

        while(num>1){
            num = num /2;
            if(num%2!=0 && num>1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 100;
        System.out.println(isPerfectSquare(num));
    }
}
