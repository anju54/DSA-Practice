package recursion;

import java.util.ArrayList;
import java.util.List;

// ref - https://takeuforward.org/data-structure/combination-sum-1/
public class CombinationSum {

    public static void solve(int[] arr,int index,int target, ArrayList< Integer > op,List < List < Integer >> ans){
        if (index == arr.length){
            if (target == 0)
                ans.add(new ArrayList<>(op));
            return;
        }
        if (arr[index] < target){
            op.add( arr[index] );
            solve(arr,index,target-arr[index], op,ans);
            op.remove(op.size() - 1);
        }
        solve(arr,index+1,target-arr[index], op, ans);
    }

    public static  List < List < Integer >> findCombination(int[] arr,int target){
        List < List < Integer >> ans = new ArrayList<>();
        solve(arr,0,target,new ArrayList<>(), ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,7};  // Input array
        ArrayList< Integer > op = new ArrayList<>();
        int sum = 7;
        List <List< Integer >> ls = findCombination(arr,sum);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
