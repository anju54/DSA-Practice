package Tree;

import java.util.HashSet;

public class DuplicateInBTree {

    Node root;

    public static void findDup(Node root,HashSet<Integer> set){

        if(root==null)
            return;

        findDup(root.left,set);

        Boolean res = set.add(root.data);
        if(!res){
            System.out.println("Duplicate values is:"+root.data);
        }

        findDup(root.right,set);
    }

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        Node a = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(2);
        a.left.right = new Node(5);
        a.right.right = new Node(5);

        findDup(a,set);
    }
}
