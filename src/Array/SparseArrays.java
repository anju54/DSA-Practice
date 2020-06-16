package Array;

import java.util.HashMap;

// ques link : https://www.hackerrank.com/challenges/sparse-arrays/problem
public class SparseArrays {

    // time complexity is N*M
    static int[] matchingStrings(String[] strings, String[] queries) {

        //int l1 = strings.length();
        int l2 = queries.length;

        int[] result = new int[l2];
        int i = 0;

        for(String query : queries){
            int count = 0;

            for(String str : strings){
                if(query.equalsIgnoreCase(str))
                    count++;
            }
            result[i++] = count;
        }

        return result;
    }

    // time complexity is N+M
    static int[] secondApproach(String[] strings, String[] queries) {

        HashMap<String,Integer> hm = new HashMap<>();
        int l2 = queries.length;
        int i = 0;
        int[] result = new int[l2];

        for(String str : strings){
            if( hm.containsKey(str)){
                hm.put( str, hm.get(str)+1);
            }else{
                hm.put(str,1);
            }
        }
        for(String query : queries){
            if(hm.containsKey(query)){
                result[i++] = hm.get(query);
            }else{
                result[i++] = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] s1 = new String[]{"ab","ab","abc"};
        String[] s2 = new String[]{"ab","abc","bc"};
        int[] arr = secondApproach(s1,s2);

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }

}
