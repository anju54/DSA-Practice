package Array;

import java.util.HashMap;
import java.util.Map;

// https://www.techiedelight.com/find-minimum-index-repeating-element-array/
public class MinIndexOfRepeatedNum {

    public static void main(String[] args) {

        int arr[] = new int[]{ 5, 6, 3, 4, 3, 6, 4 };

        System.out.println(findMinIndexOfRepeatedNumber(arr));
    }

    static int findMinIndexOfRepeatedNumber(int arr[]){

        Map<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])){
                int value = map.get(arr[i]);
                min = Math.min(value,min);
            }else
                map.put(arr[i],i);
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
