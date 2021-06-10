package LinkedList.Recursion;

public class PrintUsingRecursion {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node temp = head;
        print(head,temp);
    }

    private static void print(Node head,Node temp){

        if (temp==null)
            return;

        System.out.println(temp.data);
        if (temp.next != null)
            print(head,temp.next);
    }
}
