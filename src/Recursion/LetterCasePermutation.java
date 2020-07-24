package Recursion;

import java.util.HashSet;

public class LetterCasePermutation {

    public static void solve(String ip,String op, HashSet<String> set){

        if(ip.length()==0){
            set.add(op);
            return;
        }

        char ch = ip.charAt(0);

        if(Character.isLetter(ip.charAt(0))){

            String op1 = op;
            String op2 = op;

            op1 = op1 + Character.toLowerCase(ch);
            op2 = op2 + Character.toUpperCase(ch);

            ip = ip.substring(1,ip.length());

            solve(ip,op1,set);
            solve(ip,op2,set);
        }else{
            String op1 = op;
            op1 = op1 + ch;

            ip = ip.substring(1,ip.length());

            solve(ip,op1,set);
        }

    }

    public static void main(String[] args) {
        String ip = "a1b2";
        String op = "";
        HashSet<String> set = new HashSet<>();
        solve(ip,op,set);

        for(String s: set){
            System.out.println(s);
        }
    }
}

