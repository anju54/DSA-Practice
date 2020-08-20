package AugustChallenge;

public class GoatLatin {

    public static void main(String[] args) {

        String str = "I speak Goat Latin";
        String res = toGoatLatin(str);
        System.out.println(res);

    }

    public static String toGoatLatin(String s) {

        String arr[] = s.split(" ");
        String a = "";
        String output = "";

        for(int i=0;i< arr.length;i++){

            a = a + "a";

            Character ch = arr[i].charAt(0);
            if(isVowel(ch)){
                output = output + arr[i] + "ma" + a + " ";
            }else {
                output = output + arr[i].substring(1,arr[i].length()) + ch + "ma" + a + " ";
            }
        }
        output = output.substring(0,output.length()-1);
        return output;
    }

    public static boolean isVowel(Character ch){

        if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
            return true;
        else
            return false;
    }
}
