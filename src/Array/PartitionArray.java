package Array;

// leetcode 1013
public class PartitionArray {

    public boolean canThreePartsEqualSum(int[] A) {

        int len = A.length;
        int totalsum = 0;
        for(int i=0;i<len;i++)
            totalsum = totalsum + A[i];

        int sumInEachPart = totalsum / 3;

        if( totalsum % 3 != 0)
            return false;
        else
        {
            int i = 0;
            int sum = 0;
            while(i< len-2){
                sum = sum + A[i];
                i++;
                if(sum==sumInEachPart)
                    break;
            }
            int sum1 = 0;

            while(i<A.length-1){
                sum1 = sum1 + A[i++];
                if(sum1==sumInEachPart)
                    break;
            }
            int sum2 = 0;

            for(int j=i;j<A.length;j++)
                sum2+=A[j];

            if(sum==sum1 && sum2==sum1)
                return true;
            else
                return false;
        }

    }
}
