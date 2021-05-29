package com.revise;

import java.util.Stack;

public class QueueUsing2Stack {

    Stack<Integer> s1;
    Stack<Integer> s2;
    int front;
    int rear;
    int capacity;

    QueueUsing2Stack(){
        capacity = 5;
        s1 = new Stack<>();
        s2 = new Stack();
    }

    public void add(int num){
        s1.push(num);
    }

    public void print(){

        for (int idx : s1){
            System.out.println(idx);
        }
    }

    public int remove(){

        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int popped = s2.peek();
        s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return popped;
    }

    public static void main(String[] args) {
        QueueUsing2Stack queue = new QueueUsing2Stack();

        queue.add(3);
        queue.add(9);
        queue.add(23);
        queue.add(89);
        queue.remove();

        queue.print();
    }

}
