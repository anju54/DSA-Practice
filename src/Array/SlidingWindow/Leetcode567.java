package Array.SlidingWindow;

import java.util.HashMap;

public class Leetcode567 {

    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";

        System.out.println( checkInclusion(s1,s2) );
    }

    public static boolean checkInclusion(String s1, String s2) {

        HashMap<Character,Integer> map = new HashMap<>();
        int matched = 0;
        int start = 0;

        for(int i=0;i<s1.length();i++)
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);

        for(int end=0;end<s2.length();end++){

            char ch = s2.charAt(end);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch)==0)
                    matched++;
            }
            if(map.size()==matched)
                return true;

            if(end >= s1.length() - 1){
                char left = s2.charAt(start++);
                if(map.containsKey(left)){
                    if(map.get(left)==0)
                        matched--;
                    map.put(left, map.get(left)+1);
                }
            }
        }
        return false;
    }
}
