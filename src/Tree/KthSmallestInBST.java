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
}
