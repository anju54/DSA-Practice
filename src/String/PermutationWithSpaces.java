package String;

// https://practice.geeksforgeeks.org/problems/permutation-with-spaces3627/1
public class PermutationWithSpaces {

    public static void main(String[] args) {
        String ip = "abc";
        String op = "";

        op = op + ip.charAt(0);
        ip = ip.substring(1);

        solve(ip,op);
    }

    public static void solve(String ip,String op){

        String op1 = op;
        String op2 = op;

        if(ip.length()==0){
            System.out.println(op);
            return;
        }
        op2 = op2 + "_" + ip.charAt(0);
        op1 = op1 + ip.charAt(0);

        ip = ip.substring(1);

        solve(ip,op1);
        solve(ip,op2);
    }
}
