package Tree;

import java.util.ArrayList;

public class KthSmallestInBST {

    public int kthSmallest(Node root, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        list = inorder(root,list);

        return list.get(k-1);

    }

    public static ArrayList<Integer> inorder(Node root, ArrayList<Integer> list){

        if(root==null)
            return null;

        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);

        return list;
    }

    static int result = Integer.MIN_VALUE;
    static int count = 0;
    public static int kthSmallestOptimized(Node root, int k) {
        traverse(root, k);
        return result;
    }

    public static void traverse(Node root, int k) {
        if(root == null) return;
        traverse(root.left, k);
        count ++;
        if(count == k) result = root.data;
        traverse(root.right, k);
    }
//    static int ans = Integer.MIN_VALUE;
//    public static int kthSmallestOptimized(Node root, int k) {
//
//        find(root,k);
//        return ans;
//    }
//
//    public static void find(Node root,int k){
//        if(root==null)
//            return ;
//
//        //int t = root.data;
//        find(root.left,k);
//        k = k -1;
//        if(k==0)
//            ans = root.data;
//        if(k>0)
//            find(root.right,k);
//    }

    public static void main(String[] args) {
        BST bst = new BST();

        bst.root = bst.insert(bst.root, 3);
        bst.root = bst.insert(bst.root, 1);
        bst.root = bst.insert(bst.root, 4);
        bst.root = bst.insert(bst.root, 2);

        int small = kthSmallestOptimized(bst.root, 1);

        System.out.println(small);
    }
}
