package Tree;

public class MirrorOfTree {

    //Node root;

    public Boolean isMirror(Node root1,Node root2){

        if(root1==null && root2==null)
            return true;

        if( (root1!=null && root2==null) || (root1==null && root2!=null) )
            return false;

        if (root1.data!=root2.data)
                return false;

        return isMirror(root1.left,root2.right) && isMirror(root1.right,root2.left);
    }

    public static void main(String[] args) {

        MirrorOfTree tree = new MirrorOfTree();

        Node a = new Node(1);
        Node b = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(4);
        a.left.right = new Node(5);

        b.left = new Node(3);
        b.right = new Node(2);
        b.right.left = new Node(5);
        b.right.right = new Node(4);

        Boolean res = tree.isMirror(a,b);
        System.out.println(res);
    }
}
