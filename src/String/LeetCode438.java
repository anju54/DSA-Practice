package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode438 {

    public static List<Integer> findAnagrams(String s, String p) {

        int[] phash = new int[26];
        int[] shash = new int[26];

        List<Integer> ans = new ArrayList<>();

        int window = p.length();
        int len = s.length();
        int left = 0, right = 0;

        if(len<window)
            return ans;

        while(right<window){
            int temp = p.charAt(right) - 'a';
            int temp1 = s.charAt(right++) - 'a';
            phash[temp]++;
            shash[temp1]++;

        }
        right -=1;

        while(right<len){
            if(Arrays.equals(phash,shash))
                ans.add(left);
            right +=1;
            if(right!=len)
                shash[s.charAt(right)-'a'] +=1;

            shash[s.charAt(left)-'a'] -=1;
            left +=1;
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "aa";
        String p = "bb";
        findAnagrams(s,p);
    }
}
