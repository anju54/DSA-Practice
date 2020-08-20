package LinkedList.Recursion;

public class PrintInReverseOrder {

    class Node{

        int data;
        Node next;

        Node(int d){

            data = d;
            next = null;
        }
    }

    public static void reversePrint(Node headPtr){

        if(headPtr == null)
            return;

        reversePrint(headPtr.next);
        System.out.println(headPtr.data);
    }

    public Node push(int data, Node head){

        Node node = new Node(data);
        if(head==null)
            head = node;
        else{
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
        return head;
    }

    public void show(Node node){

        System.out.println(" --- Printing linked list ---");
        while (node.next !=null){

            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }


    public static void main(String[] args) {

        PrintInReverseOrder llist1 = new PrintInReverseOrder();
        Node head = null;

        head = llist1.push(5,head);
        head = llist1.push(10,head);
        head = llist1.push(15,head);

        llist1.show(head);
        System.out.println(" --- Printing linked list in reverse order ---");
        reversePrint(head);
    }
}
