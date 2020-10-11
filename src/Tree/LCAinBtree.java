package Tree;

public class LCAinBtree {

    public Node lowestCommonAncestor(Node root, Node p, Node q) {

        if(p==null || q==null || root==null)
            return null;

        if(root==p || root==q)
            return root;

        Node left = lowestCommonAncestor(root.left,p,q);
        Node right = lowestCommonAncestor(root.right,p,q);

        if(left!=null && right!=null)
            return root;
        if(left==null && right==null)
            return null;

        return ( left!=null ? left : right );
    }
}
