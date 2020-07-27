package Tree;

import Recursion.HeightOfBTree;

// https://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-sumtree/
public class SumTreeInBinaryTree {

    Node root;

    static class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    public static int isSumTree(Node node){
        int ls,rs;

        if ((node == null) || (node.left == null && node.right == null))
            return 1;

        ls = sumTree(node.left);
        rs = sumTree(node.right);

        if ((node.data == ls + rs) && (isSumTree(node.left) != 0)
                && (isSumTree(node.right)) != 0)

            return 1;
        return 0;
    }

    public static int sumTree(Node root){

        if(root==null){
            return 0;
        }

        int lsum = sumTree(root.left);
        int rsum = sumTree(root.right);

        return lsum + rsum + root.data;
    }

    public static void main(String[] args) {
        SumTreeInBinaryTree tree = new SumTreeInBinaryTree();

        tree.root = new Node(26);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(3);

        if (tree.isSumTree(tree.root) != 0)
            System.out.println("The given tree is a sum tree");
        else
            System.out.println("The given tree is not a sum tree");

    }
}
