package String;

import java.util.regex.Pattern;

public class SwapFirstAndLastCharacter {

    // Method to reverse words of a String
    static String reverseWords(String str)
    {
        Pattern pattern = Pattern.compile("\\s");

        String[] temp = pattern.split(str);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < temp.length; i++) {

            if(temp[i].length()==1)
                sb.append(temp[i]);
            else{
                char ch1 = temp[i].charAt(0);
                char ch2 = temp[i].charAt(temp[i].length()-1);
                String newStr = temp[i].substring(1,temp[i].length()-1);
                newStr = ch2 + newStr + ch1 + " ";
                sb.append(newStr);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        String s1 = "geeks for geeks";
        System.out.println(reverseWords(s1));

        String s2 = "I love Java Programming";
        System.out.println(reverseWords(s2));
    }
}
