package Graph;

import java.util.ArrayDeque;
import java.util.Queue;

import Graph.Node;

public class LevelOrder {

    // 1
    // 2 3
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left= new Node(20);
        root.right= new Node(30);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.right= new Node(35);
        root.right.right.right= new Node(40);

        levelOrderBFS(root);
    }

    public static void levelOrderBFS(Node root){

        Queue<Node> queue = new ArrayDeque<>();
        Node temp = root;
        queue.add(temp);

        while (!queue.isEmpty()){

            Node removedNode = queue.peek();
            System.out.println(removedNode.data);

            if (removedNode.left != null)
                queue.add(removedNode.left);
            if (removedNode.right != null)
                queue.add(removedNode.right);

            queue.poll();
        }
    }
}
