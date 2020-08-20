package AugustChallenge;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public static int longestPalindrome(String s) {

        HashMap<Character,Integer> set = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i) ;
            if(set.get(ch)==null)
                set.put(ch,1);
            else
                set.put(ch,set.get(ch)+1);
        }

        int op = 0;
        boolean flag = false;

        for(Map.Entry m : set.entrySet()){
            int n = (int) m.getValue();
            System.out.println(n);
            if(n%2==0){
                op += n;
            }else{
                if(n>1){
                    op = op + (n-1);
                }
                flag = true;
            }
        }
        if(flag)
            op +=1;
        return op;
    }

    public static void main(String[] args) {
        String str = "abba";
        longestPalindrome(str);
    }
}
