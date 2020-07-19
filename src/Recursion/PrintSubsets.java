package Recursion;

// Print subsets/powersets/ or print all subsequences

public class PrintSubsets {

    public static void solve(String ip, String op){
        if(ip.length()==0){
            System.out.println(op);
            return;
        }
        String op1 = op;
        String op2 = op;

        op2 = op2 + ip.substring(0,1);

        ip = ip.substring(1,ip.length());

        solve(ip,op1);
        solve(ip,op2);
    }

    public static void main(String[] args) {
        String str= "123";
        solve(str,"");
    }
}
