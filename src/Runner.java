public class Runner {

    public static void main(String args[]){

        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(16);
        list.insert(50);
        list.insertAtStart(90);

        //boolean result = list.search(80);
        //list.deleteNodeAtLast();
        list.deleteFirstNode();
        list.show();
        //System.out.println(result);
    }
}
