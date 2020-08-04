package AugustChallenge;

// Ques link - https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {

    public static boolean isPalindrome(String s){

        int start = 0;
        int end = s.length()-1;

        while(start<end){
            boolean temp = Character.isLetterOrDigit(s.charAt(start));
            boolean temp1 = Character.isLetterOrDigit(s.charAt(end));


            if(temp && temp1){
                boolean compareVal = Character.toLowerCase( s.charAt(start) ) == Character.toLowerCase( s.charAt(end) );
                //compareVal = Character.compare(s.charAt(start), s.charAt(end));
                start++;
                end--;
                if(compareVal==false)
                    return false;
            }else if(temp==false)
                start++;
            else if(temp1==false)
                end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s1));
    }
}
