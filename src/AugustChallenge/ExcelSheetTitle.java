package AugustChallenge;

public class ExcelSheetTitle {

    public static void main(String[] args) {

        int n = 701;
        System.out.println( convertToTitle(n) );
    }

    public static String convertToTitle(int n) {

        String op = "";

        while( n>0 ){
            int ascii = 'A' + ( ( n-1 )%26 );
            op = (char) ascii + op;
            n = (n-1)/26;
        }
        return op;
    }
}
