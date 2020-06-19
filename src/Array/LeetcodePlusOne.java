package Array;

// ques link : https://leetcode.com/problems/plus-one/

public class LeetcodePlusOne {

    public int[] plusOne(int[] digits) {

        int len = digits.length;
        int carry = 0;
        for(int i=len-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else
                digits[i] = 0;
        }

        int result[] = new int[len+1];
        result[0] = 1;
        return result;
    }

    // write the main method here
}
