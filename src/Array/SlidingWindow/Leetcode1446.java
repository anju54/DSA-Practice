package Array.SlidingWindow;

public class Leetcode1446 {

    public static int maxPower(String s) {

        int count = 1;
        int maxLen = 1;

        for(int end=1;end<s.length();end++){
            if(s.charAt(end) == s.charAt(end-1)){
                count++;
            }else{
                count = 1;
            }
            maxLen = Math.max(maxLen,count);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "cc";
        System.out.println(maxPower(s));
    }
}
