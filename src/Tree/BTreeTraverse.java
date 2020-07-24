package Tree;

import java.util.ArrayList;
import java.util.Arrays;

class Node {

    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right;
    }
}

public class BTreeTraverse {

    Node root;

    ArrayList<Integer> order = new ArrayList<>();

    public void preorder(Node root){

        if (root == null) {
            return;
        }
        System.out.println(root.data);
        order.add(root.data);
        //root = root.left;
        preorder(root.left);
        //root = root.right;
        preorder(root.right);
    }

    public static void main(String[] args) {
        BTreeTraverse tree = new BTreeTraverse();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("============Preorder============");
        tree.preorder(tree.root);
    }

}
