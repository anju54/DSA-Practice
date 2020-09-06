package Tree;

public class CheckBST {

    Node root;

    public static Boolean IsBst(Node root,int min,int max){

        if(root==null)
            return true;

        if(root.data > max || root.data < min) // checking if node violates the bst rule
            return false;

        boolean left = IsBst(root.left,min,root.data-1);  // root.data-1 to avoid duplicate values
        boolean right = IsBst(root.right,root.data+1,max);

        if(left && right)
            return true;

        return false;
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

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println( IsBst(bst.root, min,max) );
    }

}
