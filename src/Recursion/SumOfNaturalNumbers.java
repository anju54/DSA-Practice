package Recursion;

public class SumOfNaturalNumbers {

    public static int sum(int num){

        if (num==1)
            return num;

        return num + sum(num-1);
    }

    public static void main(String[] args) {
        int num = 4;
        int result = sum(num);
        System.out.println(result);
    }
}
