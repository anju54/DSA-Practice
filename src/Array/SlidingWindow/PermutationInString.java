package Array.SlidingWindow;

import java.util.HashMap;

public class PermutationInString {

    public int lengthOfLongestSubstring(String s) {

        int start = 0;
        int maxLen = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int end=0; end<s.length();end++){

            char ch = s.charAt(end);
            if(map.containsKey(ch)){
                // int index = map.get(ch);
                // start = index + 1;
                start = Math.max(start,map.get(ch)+1);
            }

            map.put(ch,end);
            maxLen = Math.max(maxLen,end-start +1);
        }

        return maxLen;
    }
}
