package recursion;

public class Print1toN {

    public static void main(String[] args) {
        int[] arr = {5, 2, 1};  // Input array
        int sum = 0;
        sum = print(arr.length,0,arr,sum);
        System.out.println("sum : "+sum);
    }

    public static int print(int n,int index,int[] arr,int sum){
        if (index==n)
            return sum;
        System.out.println(arr[index]);
        sum = sum + arr[index];
        return print(n,index+1,arr,sum);
    }
}
