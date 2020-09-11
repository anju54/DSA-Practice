package Tree;

// Java Program to print Top View of Binary Tree
// using hashmap and recursion
import java.util.*;

class TopViewBTree
{

    // Node structure
    static class Node
    {
        // Data of the node
        int data;

        // Reference to left node
        Node left;

        // Reference to right node
        Node right;
    };
    static class pair
    {
        int data, height;
        public pair(int data, int height)
        {
            this.data = data;
            this.height = height;
        }
    }

    // Initialising node
    static Node newNode(int data)
    {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }

    static void printTopViewUtil(Node root, int height,
                                 int hd, Map<Integer, pair > m)
    {
        // Base Case
        if (root == null)
            return;

        // If the node for particular horizontal distance
        // is not present in the map, add it.
        // For top view, we consider the first element
        // at horizontal distance in level order traversal
        if (!m.containsKey(hd))
        {
            m.put(hd, new pair(root.data, height));
        }
        else
        {
            pair p = m.get(hd);

            if (p.height > height)
            {
                m.remove(hd);
                m.put(hd, new pair(root.data, height));
            }
        }

        // Recur for left and right subtree
        printTopViewUtil(root.left, height + 1, hd - 1, m);
        printTopViewUtil(root.right, height + 1, hd + 1, m);
    }

    static void printTopView(Node root)
    {
        // Map to store horizontal distance,
        // height and node's data
        Map<Integer, pair > m = new HashMap<>();
        printTopViewUtil(root, 0, 0, m);

        // Print the node's value stored by printTopViewUtil()
        for (Map.Entry<Integer,pair> it : m.entrySet())
        {
            pair p = it.getValue();
            System.out.print(p.data+ " ");
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.right = newNode(4);
        root.left.right.right = newNode(5);
        root.left.right.right.right = newNode(6);

        System.out.print("Top View : ");
        printTopView(root);
    }
}