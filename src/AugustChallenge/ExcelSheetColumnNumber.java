package AugustChallenge;

public class ExcelSheetColumnNumber {

    public static void main (String args[]){
        String s = "ZY";
        System.out.println(titleToNumber(s));
    }


    public static int titleToNumber(String s) {

        int result = 0;
        int len = s.length();

        for(int i=0;i<s.length();i++){
            int position = ( s.charAt(i) - 'A' ) + 1;
            result = result + (int) ( Math.pow(26,len-1) * position );
            len--;
        }
        return result;
    }
}
