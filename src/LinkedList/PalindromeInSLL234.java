package LinkedList;

public class PalindromeInSLL234 {

    static Node  head;

    public static boolean isPalindrome() {

        Node slowPtr = head;
        Node fastPtr = head;

        // Find the middle node
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        Node midNode = slowPtr;

        if(fastPtr!=null) // list is odd so fastPtr will not point to null
            midNode = slowPtr.next;
        else
            midNode = slowPtr;

        // Reverse the second half of the list
        Node nextNode = midNode;
        Node prevNode = null;
        Node currentNode = midNode;
        while(nextNode!=null){
            nextNode = nextNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

        while (prevNode!=null){
            if(prevNode.data != head.data){
                return false;
            }
            prevNode = prevNode.next;
            head = head.next;
        }
        return  true;
    }

    class Node {
        int data ;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void insert(int data){
       Node node = new Node(data);

        if(head==null){
            head = node;
        }else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Node node = head;
        while (node.next !=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {

        PalindromeInSLL234 list = new PalindromeInSLL234();
        System.out.println("Printing the Linked list data : ");
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(20);
        list.insert(10);

        list.show();
        System.out.println( list.isPalindrome() );
    }

}
