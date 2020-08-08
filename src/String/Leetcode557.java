package String;

public class Leetcode557 {

    public static void main(String[] args) {
        String input = "Let's take LetCode contest";
        String res = reverseWholeSentence(input);
        System.out.println(res);
    }

    public static String reverseWholeSentence(String str){

        char[] arr = str.toCharArray();

        int i = 0; // it will keep the starting position
        int j = 0; // it will keep the end position

        while(j<= arr.length ){

            if(  j==arr.length || arr[j] == ' ' ){
                reverseString(arr,i,j-1);
                i = j + 1;
            }
            j++;
        }
        return new String(arr);

    }

    public static void reverseString(char[] arr,int start, int end){

        for(; start<end; start++, end--){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
