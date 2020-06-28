package Stack;

import java.util.Stack;

public class MinStackWithoutExtraSpace {

    Stack<Integer> stack = new Stack<>();
    int min = 0;

    public void push(int num){
        if(stack.empty()){
            stack.push(num);
            min = num;
        } else if( num < min){
            int topNum = 2 * num - min;
            min = num;
            stack.push(topNum);
        }else{
            stack.push(num);
        }
    }

    public void min(){
        System.out.println("min in stack : " +min );
    }

    public void display(){
        while (!stack.empty()) {
            System.out.print(stack.peek() + ", ");
            stack.pop();
        }
    }

    public void pop(){
        if(stack.empty()){
            return ;
        }else if(stack.peek()<min){
            min = 2 * min - stack.peek();
        }else if(stack.peek()>min)
            stack.pop();
    }

    public int top(){
        if(stack.empty()){
            return -1;
        }else if(stack.peek()<min){
            return min;
        }else{
            return stack.peek();
        }
    }

    public static void main(String[] args) {

        MinStackWithoutExtraSpace m = new MinStackWithoutExtraSpace();
        m.push(18);
        m.push(19);
        m.push(29);

        m.push(15);
        m.pop();
        m.min();
        m.push(16);
        m.push(2);
        m.min();
        m.display();
    }
}
