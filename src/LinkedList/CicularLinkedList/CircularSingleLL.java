package LinkedList.CicularLinkedList;

public class CircularSingleLL {

    Node head;
    Node tail;

    class Node {
        int data ;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    // Create a very first linked list
    public void add(int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        node.next = node;
    }

    public void insert(int value,int location){

        Node node = new Node(value);
        if( head==null ){ // there is no linked list
            return;
        }else if( location==0 ) { // we want to insert at first position in a existing linked list
            node.next = head;
            tail.next = head;
            head = node;
            // no need to do anything with tail as its already pointing to the last element
        } else if( location > 0 ){ // insert at specific location
            Node tempNode = head;
            for(int i=0;i<location-1;i++){
                node.next = tempNode.next;
            }
            tempNode.next = node;
        }
    }

    public void insertAtEnd(int value){
        Node node = new Node(value);
        //node.next = head;
        tail.next = node;
        tail = node;
        tail.next = head;
    }

    public void display(){
        Node currentNode = head;
        if (head != null) {
            do {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            } while (currentNode != head);
        }
    }

    public static void main(String[] args) {
        CircularSingleLL object = new CircularSingleLL();
        object.add(12);

        object.insertAtEnd(20);
        object.display();
    }
}
