package String;

import java.util.HashSet;

public class LeetCode387 {

    public static int firstUniqChar(String s) {

        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++){
            int position = s.charAt(i) - 'a';
            System.out.println(position);
            counts[position]++;
        }
        for (int i = 0; i < s.length(); i++) if (counts[s.charAt(i) - 'a'] == 1) return i;
        return -1;

    }

    public static void main(String[] args) {
        String s1 = "leetcodel";
        System.out.println(firstUniqChar(s1));
    }
}
