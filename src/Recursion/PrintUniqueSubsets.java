package Recursion;

import java.util.HashSet;

public class PrintUniqueSubsets {

    public static void solve(String ip, String op,HashSet<String> set){

        if(ip.length()==0){

            if(set.add(op)){
                System.out.println(op);
            }
            return;
        }
        String op1 = op;
        String op2 = op;

        op2 = op2 + ip.substring(0,1);

        ip = ip.substring(1,ip.length());

        solve(ip,op1,set);
        solve(ip,op2,set);
    }


    public static void main(String[] args) {
        String str= "aab";
        HashSet<String> set = new HashSet<>();
        solve(str,"",set);
    }
}
