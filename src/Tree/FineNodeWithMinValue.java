package Tree;

public class FineNodeWithMinValue {

    public static Node findMinNode(Node root){

        if(root==null)
            return root;

        if(root.left!=null)
           return findMinNode(root.left);

        if(root.left==null)
            return root;

        return null;
    }

    public static void main(String[] args) {

        BST bst = new BST();

        bst.root = bst.insert(bst.root, 50);
        bst.root = bst.insert(bst.root, 30);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 40);
        bst.root = bst.insert(bst.root, 70);
        bst.root = bst.insert(bst.root, 60);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 90);

        Node res = findMinNode(bst.root);
        System.out.println(res.data);
    }
}
