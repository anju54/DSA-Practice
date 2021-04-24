package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationInArray {

    public static void main(String[] args) {
        ArrayList<Integer> ip = new ArrayList<>();
        ip.add(1);ip.add(2);ip.add(3);

        solve(ip,new ArrayList<>());
    }

    private static void solve(ArrayList<Integer> ip, ArrayList<Integer> op) {

        if(ip.size() == 0) {
            System.out.println(op);
            return;
        }

        for (int i=0;i<ip.size();i++){
            ArrayList<Integer> op1 = new ArrayList<Integer>(op);
            ArrayList<Integer> ip1 = new ArrayList<Integer>(ip);

            op1.add(ip.get(i));
            ip1.remove(i);

            solve(ip1,op1);
        }

    }
}
