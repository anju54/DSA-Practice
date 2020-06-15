package Array;

// ques link - https://www.hackerrank.com/challenges/new-year-chaos/problem

public class NewYearChaos {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 3, 7, 8, 6, 4};
        minimumBribes(arr);
    }

    static void minimumBribes(int[] q) {
        int len = q.length;
        int bribes = 0;
        for(int i=len-1;i>0;i--){
            if(q[i] != i+1){
                if(q[i-1] == i+1){
                    q[i-1] = q[i];
                    bribes += 1;
                }else if ( q[i-2] == i+1){
                    q[i-2] = q[i-1];
                    q[i-1] = q[i];
                    bribes +=2;
                }else{
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }

        System.out.println(bribes);
    }
}
