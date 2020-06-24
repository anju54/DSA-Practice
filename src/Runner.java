public class Runner {

    public static void main(String args[]){

        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(16);
        list.insert(50);
        list.insert(90);

        //boolean result = list.search(80);
        //list.deleteNodeAtLast();
        //list.deleteFirstNode();
        list.deleteByIndex(2);
        list.show();
        //System.out.println(result);
    }
}
