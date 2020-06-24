public class LinkedList {

    Node head;

    public void insert(int element){

        Node node = new Node();
        node.data = element;
        node.next = null;
        if(head == null)
            head = node;
        else {
            Node n = head;
            while (n.next !=null ){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int element){

        Node node = new Node();
        node.data = element;
        node.next = null;

        node.next = head;
        head = node;
    }

    public void deleteNodeAtLast(){

        Node node = head;
        if(node==null || node.next==null){
            return;
        }
        Node temp = node;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteFirstNode(){
        Node node = head;
        if(node==null || node.next==null){
            return;
        }
        head = head.next;
        //head = null;
    }

    public void deleteByIndex(int index){
        if(index==0){
            head = head.next;
        }

        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        Node n = temp.next;
        temp.next = n.next;
    }

    public boolean search(int element){

        Node n = head;
        while(n.next!=null){
            if(n.data == element)
                return  true;
            n = n.next;
        }
        if(n.data == element)
            return  true;

        return false;
    }

    public void show(){
        Node node = head;
        while (node.next !=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
