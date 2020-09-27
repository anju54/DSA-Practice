package Array;

import java.util.HashMap;
import java.util.Map;

// 167. Two Sum II - Input array is sorted

public class Leetcode167 {

    public int[] twoSum(int[] numbers, int target) {

        Map<Integer,Integer> set = new HashMap<>();

        int[] result = new int[2];

        set.put(numbers[0],1);

        for(int i=1;i<numbers.length;i++){

            int rem = target - numbers[i];
            if(set.containsKey(rem)){

                result[0] = set.get(rem);
                result[1] = i+1;
                if(result[0]<result[1])
                    return result;

            }
            set.put(numbers[i],i+1);

        }
        return result;
    }
}

//Input: numbers = [2,3,4], target = 6
//        Output: [1,3]
