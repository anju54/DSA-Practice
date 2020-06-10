public class FindMiddleNode {

    Node head;

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

    /**
     * Efficient soln using slow fast pointer
     * i.e slow pointer moves by one and fast pointer by two.
     * When the fast pointer reaches end slow pointer will reach middle of the linked list.
     */
    public void calMiddleNode1(){
        Node slowPointer = head;
        Node fastPointer = head;

        if(head!=null){
            while (fastPointer!=null && fastPointer.next!=null){
                fastPointer = fastPointer.next.next;
                slowPointer = slowPointer.next;
            }
            System.out.println("Printing the middle node data : "+slowPointer.data);
        }
    }

    /**
     * Brute force approach
     */
    public void calMiddleNode(){
        Node node = head;
        int count = 1;
        while (node.next !=null){
            count++;
            node = node.next;
        }
        int mid = 0;
        if(count%2==0)
            mid = count/2 + 1;
        else
            mid = count/2;
        System.out.println(count);
        Node n = head;
        for(int i=1;i<=mid;i++) {
            n = n.next;
        }
        System.out.println("Printing the middle node data : "+n.data);
    }

    public static void main(String[] args) {

        FindMiddleNode list = new FindMiddleNode();
        System.out.println("Printing the Linked list data : ");
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        //list.insert(60);

        list.show();
        //list.calMiddleNode();
        list.calMiddleNode1();
    }
}
