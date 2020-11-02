package Array.SlidingWindow;

import java.util.HashMap;

public class Leetcode424 { //  aabccbb

    public static int solve(String s, int k){
        int start = 0;
        int maxLen = 0;
        int maxRepeatCharCount = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int end=0; end<s.length();end++) {

            char ch = s.charAt(end);

            map.put(ch, map.getOrDefault(ch,0)+1);

            maxRepeatCharCount = Math.max(maxRepeatCharCount, map.get(ch));

            if(end-start+1 - maxRepeatCharCount > k){
                char leftOverChar = s.charAt(start);
                map.put(leftOverChar, map.get(leftOverChar)-1);
                start++;
            }

            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

       System.out.println( solve(s,k) );
    }
}
