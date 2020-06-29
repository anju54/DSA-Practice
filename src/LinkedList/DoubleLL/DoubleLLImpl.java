package LinkedList.DoubleLL;

public class DoubleLLImpl {

   Node head;
   Node tail;

    class Node {
        int data ;
        Node next;
        Node prev;

        Node(int d){
            data = d;
            next = null;
            prev = null;
        }
    }

    public void insertAtStart(int value){
        Node node = new Node(value);
        if(head==null){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void insertAtLast(int value){
        Node node = new Node(value);
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public void insertByIndex(int index,int value){ // index = 2
        int count = 1;
        Node currentNode = head;
        while (currentNode.next!=null){
            count++;

            if(count==index)
                break;
            else
                currentNode = currentNode.next;
        }
        Node newnode = new Node(value);
        newnode.next = currentNode.next;
        newnode.prev = currentNode.next.prev;
        currentNode.next = newnode;
    }

    public void deleteFirstElement(){
        if(head.next==null)
            head = tail = null;
        else{
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteLastElement() {
        if (head.next == null)
            head = tail = null;
        else{
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void reverse() {
        if (head == null){
            System.out.println("Linked list is empty");
        return;
        }
       else{
            System.out.println("Linked list in reverse order");
           Node temp = tail;
           while (head!=tail && temp!=null){
               System.out.println(temp.data);
               temp = temp.prev;
           }
       }

    }

    public void display(){
        Node currentNode = head;
        if (head != null) {
            while (currentNode.next != null){
                System.out.print(currentNode.data +" --> ");
                currentNode = currentNode.next;
            }
        }
        System.out.println(currentNode.data);

    }

    public static void main(String[] args) {

        DoubleLLImpl list = new DoubleLLImpl();
        list.insertAtStart(15);
        list.insertAtLast(25);
        list.insertAtLast(30);
        //list.insertByIndex(2,50);
        list.insertAtLast(35);
        list.display();
        list.deleteFirstElement();
        list.deleteLastElement();
        list.display();
        //list.reverse();
    }

}
