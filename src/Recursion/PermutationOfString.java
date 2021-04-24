package Recursion;

public class PermutationOfString {

    public static void main(String[] args) {
        String str= "123";
        solve("",str);
    }

    private static void solve(String op, String ip) {

        if (ip.length() == 0){
            System.out.println(op);
            return;
        }
        for (int i=0;i<ip.length();i++){
             String op1 = op;
             String ip1 = ip;
             op1 = op + ip.substring(i,i+1);

             ip1 = ip.substring(0,i) + ip.substring(i+1);

             solve(op1,ip1);
        }
    }
}
