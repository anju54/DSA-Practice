package Recursion;

public class Multiply {

    public static int sum(int a,int b){

        if (b==1)
            return a;

        return a + sum(a,b-1);
    }

    public static void main(String[] args) {
        int num = 4;
        int num2 = 3;
        int result = sum(num,num2);
        System.out.println(result);
    }
}
