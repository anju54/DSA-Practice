public class MergeTwoLinkedList1 {

    Node1 head;

    class Node1 {
        int data;
        Node1 next;

        Node1(int d){
            data = d;
            next = null;
        }
    }

    public void push(int data) {

        Node1 n = new Node1(data);

        if (null == head) {
            head = n;
        } else {

            Node1 temp = head;

            while (null != temp.next) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public void addToTheLast(Node1 node){
        if(head == null)
            head = node;
        else{
            Node1 n = head;
            while (n.next !=null ){
                n = n.next;
            }
            n.next = node;
        }
    }

    public Node1 merge(Node1 head1, Node1 head2){

        Node1 dummyNode = new Node1(0);

        Node1 tail = dummyNode;

        while(true){
            if(head1 == null){
                tail.next = head2;
                break;
            }
            if(head2 == null){
                tail.next = head1;
                break;
            }

            if(head1.data <= head2.data){
                tail.next = head1;
                head1 = head1.next;
            }else{
                tail.next = head2;
                head2 = head2.next;
            }

            /* Advance the tail */
            tail = tail.next;
        }
        return dummyNode.next;
    }

    public void print(){
        Node1 n = head;
        while (n.next !=null ){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void main(String args[])
    {
        MergeTwoLinkedList1 llist1 = new MergeTwoLinkedList1();
        MergeTwoLinkedList1 llist2 = new MergeTwoLinkedList1();

        llist1.push(5);
        llist1.push(10);
        llist1.push(15);

        llist2.push(2);
        llist2.push(3);
        llist2.push(10);

        llist1.head = llist1.merge(llist1.head, llist2.head);
        llist1.print();
    }
}