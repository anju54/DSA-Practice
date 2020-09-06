package Tree;

public class BST {

    Node root;

    public  Node insert(Node root,int element){

        //base cond
        if(root==null){
            Node newNode = new Node(element);
            return newNode;
        }
        if(element <= root.data)
           root.left = insert(root.left,element);

        if(element > root.data)
           root.right = insert(root.right,element);

        return root;
    }

    public  void inorder(Node root){
        //base cond
        if(root==null){
            return ;
        }

        inorder(root.left);
        System.out.println("   " +root.data);
        inorder(root.right);
    }

    public  Node search(Node root,int key){
        //base cond

        if(root==null || root.data==key){
           return root;
        }

        if(key> root.data){
           return search(root.right,key);
        }else
           return search(root.left,key);
    }

    public Node delete(Node root,int key){

        // base case if the tree is empty
        if(root==null)
            return root;

        else if(key > root.data)  // 80 > 50 go right 
            root.right = delete(root.right,key);

        else if(key < root.data) // 30 < 50 then go left
           root.left = delete(root.left,key);

        else{  // cursor will reach here when key is neither less then root nor bigger .. it is equal to key
            if(root.left==null && root.right==null){  // both child are null

                root = null;
            }else if(root.left == null){  // if left child is null

                root = root.right;
            }else if(root.right == null){ // if right child is null 

                root = root.left;
            }else{
                Node temp = findMin(root.right); // if both left and right child is present
                root.data = temp.data;
                root.right = delete(root.right,root.data); // temp.data == root.data
            }
        }
        return root;

    }

    public static Node findMin(Node root){

        if(root==null)
            return null;

        if(root.left==null){
            System.out.println("Min value "+root.data);
            return root;
        }

        return findMin(root.left);
    }

    public static void main(String[] args) {
        BST bst = new BST();

        bst.root = bst.insert(bst.root,50);
        bst.root = bst.insert(bst.root,30);
        bst.root = bst.insert(bst.root,20);
        bst.root = bst.insert(bst.root,40);
        bst.root = bst.insert(bst.root,70);
        bst.root = bst.insert(bst.root,60);
        bst.root = bst.insert(bst.root,80);
        bst.root = bst.insert(bst.root,90);

        System.out.println("------------- Inorder traversal -------------------");
        bst.inorder(bst.root);
        //System.out.println("---------------------------------------------------");

//        Node res = bst.search(bst.root,70);
//        System.out.println("Key found "+res.data);
//
//        Node min = findMin(bst.root);
//        System.out.println("Min = "+min.data);

        Node res = bst.delete(bst.root,70);
        System.out.println("------------- Inorder traversal after Delete -------------------");
        bst.inorder(res);
        System.out.println("---------------------------------------------------");
    }
}
