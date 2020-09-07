package Tree;

public class InorderPredecessorSuccesseor {

    public static void main(String[] args) {
        BST bst = new BST();

        bst.root = bst.insert(bst.root, 6);
        bst.root = bst.insert(bst.root, 2);
        bst.root = bst.insert(bst.root, 8);
        bst.root = bst.insert(bst.root, 4);
        bst.root = bst.insert(bst.root, 7);
        bst.root = bst.insert(bst.root, 9);
        bst.root = bst.insert(bst.root, 3);
        bst.root = bst.insert(bst.root, 5);

        Node res = bst.search(bst.root,6);
        solve(res);
    }

    public static void solve(Node root){

        // predecessor
        if(root.left!=null){
            Node temp = root.left;
            while (temp.right!=null){  // go to the extreme right node
                temp = temp.right;
            }
            System.out.println("Inorder precessor is "+temp.data);
        }

        if(root.right!=null){
            Node temp = root.right;
            while(temp.left!=null){
                temp = temp.left;
            }
            System.out.println("Inorder successor is "+temp.data);
        }
    }
}
