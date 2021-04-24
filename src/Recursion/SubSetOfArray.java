package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSetOfArray {

    public static void main(String[] args) {

        ArrayList<Integer> ip = new ArrayList<>();
        ip.add(1);ip.add(2);ip.add(3);

        solve(ip,new ArrayList<>());

    }

    public static void solve(List<Integer> input, List<Integer> output ){
        if(input.size() == 0) {
            System.out.println(output);
            return;
        }

        List<Integer> op1 = new ArrayList<Integer>(output);
        List<Integer> op2 = new ArrayList<Integer>(output);

        op2.add(input.get(0));
        input.remove(0);

        solve(new ArrayList<Integer>(input), op1);
        solve(new ArrayList<Integer>(input), op2);
    }
}
