package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class ViewOfBTree {

    Node root;

    public void rightView(Node root){

        if (root == null) {
            return;
        }
        else {

            int count = 0;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {

                count = queue.size();

                for(int i=1; i<=count; i++){
                    Node temp = queue.remove();
                    if(i==count){
                        System.out.println(temp.data);
                    }

                    if(temp.left!=null)
                        queue.add(temp.left);
                    if(temp.right!=null)
                        queue.add(temp.right);
                }

            }
        }
    }

    public int leftView(Node root){

        int sum = 0;
        if (root == null) {
            return sum;
        }
        else {

            int count = 0;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {

                count = queue.size();

                for(int i=1; i<=count; i++){
                    Node temp = queue.remove();
                    if(i==1){
                        System.out.println(temp.data);
                        sum = sum + temp.data;
                    }

                    if(temp.left!=null)
                        queue.add(temp.left);
                    if(temp.right!=null)
                        queue.add(temp.right);
                }

            }
            sum = sum - root.data;
        }
        return sum;
    }

    public static void main(String[] args) {
        ViewOfBTree tree = new ViewOfBTree();

        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);

        System.out.println("--------------- right view of binary tree is ------------- ");
        tree.rightView(tree.root);
        System.out.println("--------------left view of binary tree is -------------- ");
        int sum = tree.leftView(tree.root);
        System.out.println("Sum of left view leaves = "+sum);

    }
}
