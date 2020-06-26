package String;

import java.util.Arrays;

public class ValidAnagram242 {

    public static boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        if(Arrays.equals(tArr,sArr))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String s1 = "tac";
        String s2 = "cat";
        System.out.println(isAnagram(s1,s2));
    }
}

