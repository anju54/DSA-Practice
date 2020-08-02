package String;

// Aug day 1 challenge
public class CapitalLetter {

    public static boolean detectCapitalUse(String word) {

        int len = word.length();

        int capitals = 0;

        for(int i=0;i<len;i++){
            char ch = word.charAt(i);
            if( ch >= 'A' && ch <= 'Z' )
                capitals++;
        }

        if(capitals == len)
            return true;
        else if(capitals==0)
            return true;
        // if we found capital count is 1 then have to check whether it is the first char or not
        else return capitals == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z';
    }

    public static void main(String[] args) {
        String str = "flaG";
        boolean res = detectCapitalUse(str);
        System.out.println(res);
    }
}
