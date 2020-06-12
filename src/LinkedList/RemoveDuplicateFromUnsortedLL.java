package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateFromUnsortedLL {

    Node head;

    class Node{

        int data;
        Node next;

        Node(int d){
            data = d;
        }
    }

    public void push(int data){

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
    }

    public void show(){
        Node node = head;
        System.out.println(" --- Printing linked list ---");
        while (node.next !=null){

            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void calDistinctElement(){

        HashMap<Integer, Integer> hash = new HashMap<Integer,Integer>();

        Node prevNode = head ;
        Node currentNode = head.next;
        Node temp; //keeping it so that last node would be eligible for garbage collection

        hash.put(head.data,1);

        while(currentNode!=null){
            if( hash.containsKey(currentNode.data) ){
                prevNode.next = currentNode.next;
                temp = currentNode;
                currentNode = currentNode.next;
                temp.next = null;
            }else{
                hash.put(currentNode.data,1);
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }

        for(Map.Entry m : hash.entrySet()){
            System.out.println(m.getKey()+ "--" + m.getValue());
        }

    }

    public static void main(String[] args) {
        RemoveDuplicateFromUnsortedLL pde = new RemoveDuplicateFromUnsortedLL();
        pde.push(1);
        pde.push(3);
        pde.push(4);
        pde.push(5);
        pde.push(2);
        pde.push(4);
        pde.push(3);

        pde.calDistinctElement();
        pde.show();
    }
}
