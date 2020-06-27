package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MinStackWithExtraSpace {

    Stack<Integer> supportingStack = new Stack<>();
    Stack<Integer> stack = new Stack<>();

    public void push(int num) {

        if(stack.empty()){
            supportingStack.push(num);
        }else if(num < supportingStack.peek()){
            supportingStack.push(num);
        }
        stack.push(num);
    }

    public void pop(){
        if(stack.peek() == supportingStack.peek()){
            stack.pop();
            supportingStack.pop();
        }else{
            stack.pop();
        }
    }

    public void min(){
        System.out.println("min in stack : " +supportingStack.peek() );
    }

    public void display(){
        while (!stack.empty()) {
            System.out.print(stack.peek() + ", ");
            stack.pop();
        }
    }

    public static void main(String[] args) {

        MinStackWithExtraSpace m = new MinStackWithExtraSpace();
        m.push(18);
        m.push(19);
        m.push(29);

        m.push(15);
        m.pop();
        m.min();
        m.push(16);

        m.display();
    }
}
