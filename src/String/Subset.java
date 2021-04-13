package String;

// https://practice.geeksforgeeks.org/problems/power-set-using-recursion/1/?track=sp-recursion&batchId=105
public class Subset {

    public static void main(String[] args) {

        findSubSet("abc","");
    }

    public static void findSubSet(String ip,String op){  // s = ab

        String op1 = op;
        String op2 = op;

        if(ip.length()==0){
            System.out.println(op);
            return;
        }
        op2 = op2 + ip.charAt(0);

        ip = ip.substring(1);

        findSubSet(ip,op1);
        findSubSet(ip,op2);
    }
}
