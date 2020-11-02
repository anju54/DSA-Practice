package Array.SlidingWindow;

public class Leetcode1004 {

    public static int longestOnes(int[] A, int K) {

        int start = 0;
        int maxLen = 0;
        int maxOnesCount = 0;

        for(int end=0; end<A.length;end++) {

            if(A[end]==1)
                maxOnesCount++;

            if(end - start + 1 - maxOnesCount > K){
                if(A[start]==1)
                    maxOnesCount--;
                start++;
            }
            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }

    public static void main(String[] args) {

        int[] A = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int K = 2;

        longestOnes(A,K);
    }
}
