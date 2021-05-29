package Array.SlidingWindow;

import java.util.HashMap;

/**
 * Given a string s and an integer k, return the length of the longest substring of s
 * that contains at most k distinct characters.
 * Input: s = "eceba", k = 2
 * Output: 3
 * Explanation: The substring is "ece" with length 3.
 */
// from grokking the coding interview
public class LongestSubstrWithKDistinctChars {

    public static void main(String[] args) {
        String s = "eceba" ; int k = 2;
        int res = solve(s,k);
        System.out.println(res);
    }

    public static int solve(String s,int k){ // s = "araaci" k = 2

        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        int maxLen = 0;
        int start = 0;

        for(int end=0;end<s.length();end++){

            Character ch = s.charAt(end);
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);

            // if map size is more than k
            while (hashMap.size()>k){

                hashMap.put(ch, hashMap.get(ch) - 1);
                if(hashMap.get(ch) == 0){
                    hashMap.remove(ch);
                }
                start++;
            }
        maxLen = Math.max(maxLen, (end - start) + 1); // end -start + 1 bcz end will point to index value
        }
        return maxLen;
    }

}
