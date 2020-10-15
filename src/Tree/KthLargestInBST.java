package Tree;

public class KthLargestInBST {

    public  class count{
        int c = 0;
    }

    void helper(int k){
        BST bst = new BST();

        bst.root = bst.insert(bst.root, 50);
        bst.root = bst.insert(bst.root, 30);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 40);
        bst.root = bst.insert(bst.root, 70);
        bst.root = bst.insert(bst.root, 60);
        bst.root = bst.insert(bst.root, 80);

        count cObject = new count(); // object of class count
        kthLargest(bst.root, 2,cObject);
    }

    public static void main(String[] args) {

        KthLargestInBST obj = new KthLargestInBST();
        obj.helper(4);
    }

    public  static void kthLargest(Node root, int k, count C){

        if(root==null || C.c>k)
            return ;

        kthLargest(root.right,k,C);

        C.c++;

        if(C.c==k) {
            System.out.println(k + "th largest element is " + root.data);
            return;
        }

        kthLargest(root.left,k,C);
    }
}
