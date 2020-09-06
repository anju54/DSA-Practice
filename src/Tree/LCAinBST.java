package Tree;

public class LCAinBST {

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

        Node res = lca(bst.root,2,4);

        System.out.println(res.data);
    }

    public static Node lca(Node node, int n1, int n2)
    {
        if (node == null)
            return null;

        // If both n1 and n2 are smaller than root, then LCA lies in left
        if (node.data > n1 && node.data > n2)
            return lca(node.left, n1, n2);

        // If both n1 and n2 are greater than root, then LCA lies in right
        if (node.data < n1 && node.data < n2)
            return lca(node.right, n1, n2);

        return node;
    }

}
