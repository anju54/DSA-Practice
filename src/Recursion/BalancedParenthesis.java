package Recursion;

import java.util.ArrayList;

public class BalancedParenthesis {
    public static void main(String[] args) {
        int number = 3;
        ArrayList<String> v = new ArrayList<>();
        int close = number;
        int open = number;
        String op = "";
        solve(open,close,op,v);

        System.out.println(v);
    }

    public static void solve(int open,int close,String op, ArrayList<String> v){

        if(open==0 && close==0){
            v.add(op);
            return;
        }

        if(open!=0){
            String op1 = op;
            op1 = op1 + "(";
            solve(open-1,close,op1,v);
        }

        if(close>open){
            String op2 = op;
            op2 = op2 + ")";
            solve(open,close-1,op2,v);
        }
    }
}
