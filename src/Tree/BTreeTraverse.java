package Tree;

import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;

import java.util.*;

class Node {

    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}

public class BTreeTraverse {

    Node root;

    ArrayList<Integer> order = new ArrayList<>();

    public void levelOrderTraversal(Node root){
        if (root == null) {
            return;
        }else{

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()){

                Node temp = queue.remove();
                System.out.print(temp.data + " ");

                if(temp.left!=null)
                    queue.add(temp.left);

                if(temp.right!=null)
                    queue.add(temp.right);

            }
        }

    }

    public void preorder(Node root){

        if (root == null) {
            return;
        }
        System.out.println(root.data);
        order.add(root.data);
        //root = root.left;
        preorder(root.left);
        //root = root.right;
        preorder(root.right);
    }

    public void preorderUsingIterative(Node root){

        Stack<Node> stack = new Stack<>();

        if(root==null)
            return;

        stack.push(root);

        while (!stack.isEmpty()){

            Node popped = stack.pop();

            System.out.print(popped.data+ ", ");

            if(popped.right!=null)
                stack.push(popped.right);

            if(popped.left!=null)
                stack.push(popped.left);
        }
    }

    public List<List<Integer>>  verticalOrderTraversal(Node root){

        List<List<Integer>> result = new ArrayList<>();

        if (root==null)
            return result;

        if (root != null) {

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            HashMap<Integer, List<Integer>> map = new HashMap<>();

            Queue<Integer> hdQueue = new LinkedList<>();
            hdQueue.add(0);

            while (!queue.isEmpty()) {

                Node front = queue.remove();

                int hd = hdQueue.remove();

                if (!map.containsKey(hd)) {
//                    List<Integer> t1 = new ArrayList<>();
//                    t1.add(front.data);
                    map.put(hd, new ArrayList<>());
                }

                map.get(hd).add(front.data);

                if (front.left != null) {
                    queue.add(front.left);
                    hdQueue.add(hd-1);
                }

                if (front.right != null) {
                    queue.add(front.right);
                    hdQueue.add(hd+1);
                }
            }

            result.addAll(map.values());
        }
        return result;
    }

    public static void main(String[] args) {
        BTreeTraverse tree = new BTreeTraverse();

        tree.root = new Node(3);
        tree.root.left = new Node(9);
        tree.root.right = new Node(20);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(7);

        System.out.println("============Preorder============");
        tree.preorder(tree.root);

        tree.preorderUsingIterative(tree.root);

        System.out.println("\n\nLevel order traversal of binary tree is - ");
        tree.levelOrderTraversal(tree.root);

        System.out.println("\n\nVertical order traversal of binary tree is - ");
        List<List<Integer>> res = tree.verticalOrderTraversal(tree.root);

        for(int i = 0;i<res.size();i++){
            List<Integer> res1 = res.get(i);
            for(int j=0;j<res1.size();j++){
                System.out.print(res1.get(j)+" , ");
            }
            System.out.println();
        }
    }

}
