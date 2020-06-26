package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Ques link - https://leetcode.com/problems/group-anagrams/

public class GroupAnagram49 {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String> > map = new HashMap<>();
        for(int i=0;i<strs.length;i++){

            String s1 = strs[i];
            char[] s1Arr = s1.toCharArray();
            Arrays.sort(s1Arr);
            String newStr = new String(s1Arr);

            if( map.containsKey(newStr) ){
                map.get(newStr).add(s1);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s1);
                //System.out.println(newStr);
                map.put(newStr,list);
            }
        }

        List< List<String> > ans = new ArrayList<>();
        for(String s: map.keySet()){
            List<String> list = map.get(s);
            ans.add(list);
        }
        return ans;
    }

}
