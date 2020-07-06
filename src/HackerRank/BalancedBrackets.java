package HackerRank;

import java.util.Stack;

public class BalancedBrackets {

    static String isBalanced(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if( ch=='(' || ch=='{' || ch=='[')
                stack.push(ch);
            else{
                if(stack.size()>0){
                    if( stack.peek() == '{' && ch=='}' ||
                        stack.peek() == '[' && ch==']' ||
                        stack.peek() == '(' && ch==')'
                    )
                        stack.pop();
                    else
                        return "NO";
                }
                else
                    return "NO";
            }
        }
        if(stack.size()>0)
            return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        String s = "{{}(";
        System.out.println(isBalanced(s));
    }

}
