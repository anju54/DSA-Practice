package Tree;

import java.util.ArrayList;

public class Serialize {

    Node root;
    private static final String spliter = ",";

    public static String doSerialize(Node root,StringBuilder str){

        if(root==null)
            str.append(-1).append(spliter);
        else {
            str.append(root.data).append(spliter);

            doSerialize(root.left, str);
            doSerialize(root.right, str);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        BST bst = new BST();

        bst.root = bst.insert(bst.root, 50);
        bst.root = bst.insert(bst.root, 30);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 40);
        bst.root = bst.insert(bst.root, 70);
        bst.root = bst.insert(bst.root, 60);
        bst.root = bst.insert(bst.root, 80);
        bst.root = bst.insert(bst.root, 90);

        System.out.println("------------- Inorder traversal -------------------");
        bst.inorder(bst.root);

        StringBuilder str = new StringBuilder();

        String res = doSerialize(bst.root, str);

        System.out.println(res);
    }
}
