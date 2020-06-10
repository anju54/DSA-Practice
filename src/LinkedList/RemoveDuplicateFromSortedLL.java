package LinkedList;

public class RemoveDuplicateFromSortedLL {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void push(int data) {

        Node n = new Node(data);
        if (null == head) {
            head = n;
        } else {
           Node temp = head;
            while (null != temp.next) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public void removeDuplicate(){
        Node current = head;

        if(current==null || current.next==null)
            return;

        Node next_next;
        while(current.next!=null){

            if(current.data == current.next.data){

                next_next = current.next.next;
                current.next = null;
                current.next = next_next;
            }else{
                current = current.next;
            }
        }
    }
    public void print(){
        Node n = head;
        while (n.next !=null ){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void main(String args[])
    {
        RemoveDuplicateFromSortedLL llist1 = new RemoveDuplicateFromSortedLL();


        llist1.push(5);
        llist1.push(5);
        llist1.push(15);

        llist1.removeDuplicate();
        llist1.print();
    }
}
