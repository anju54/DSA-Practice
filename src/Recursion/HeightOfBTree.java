package Recursion;

public class HeightOfBTree {

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

    public static int height(Node root){
        if(root==null)
            return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        return 1 + Math.max(lh,rh);
    }

    public static void main(String[] args) {
        HeightOfBTree tree = new HeightOfBTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.right = new Node(5);

        int res = height(tree.root);
        System.out.println(res);
    }

}
