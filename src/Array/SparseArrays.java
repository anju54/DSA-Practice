package Array;

// ques link : https://www.hackerrank.com/challenges/sparse-arrays/problem
public class SparseArrays {

    static int[] matchingStrings(String[] strings, String[] queries) {

        //int l1 = strings.length();
        int l2 = queries.length;

        int[] result = new int[l2];
        int i = 0;

        for(String query : queries){
            int count = 0;

            for(String str : strings){
                if(query.equalsIgnoreCase(str))
                    count++;
            }
            result[i++] = count;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] s1 = new String[]{"ab","ab","abc"};
        String[] s2 = new String[]{"ab","abc","bc"};
        int[] arr = matchingStrings(s1,s2);

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }

}
