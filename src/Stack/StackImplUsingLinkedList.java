package Stack;

public class StackImplUsingLinkedList {

    Node top;

    class Node{
        int value;
        Node next;

        Node(int data){
            this.value = data;
            next = null;
        }
    }

    public void push(int value){

        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    public void pop(){
        if(top==null) // if stack is empty that means head is null
            return;
        System.out.println("Popped element : "+top.value);
        Node temp = top;
        top = top.next;
        temp = null;
    }

    public int peek(){
        System.out.println("Printing the top of the stack : "+top.value);
        return top.value;
    }

    public void show(){
        Node node = top;
        while (node.next !=null){
            System.out.print(node.value + ",");
            node = node.next;
        }
        System.out.print(node.value + "\n");
    }

    public static void main(String[] args) {
        StackImplUsingLinkedList stack = new StackImplUsingLinkedList();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.show();
        stack.pop();
        stack.pop();
        stack.show();
        stack.peek();
    }
}
