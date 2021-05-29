package com.revise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStrLen {
    public static void main(String[] args) {
        String str = "geeksforg";

        lengthOfLongestSubstring(str);
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int j=0; int maxL =0; int i=0;
        while(j< s.length()){
            if(! hs.contains(s.charAt(j))){
                hs.add(s.charAt(j++));
                maxL = Math.max(maxL, j-i);
            }else{
                hs.remove(s.charAt(i++));
            }
        }return maxL;
    }


}
