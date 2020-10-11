package Tree;

import java.util.HashMap;

public class BuildBtreeFromInOrderPreOrder {

    Node root;

        //     3
        //   /    \  
        // 9       20
        //        /   \ 
        //     15        7

    static class Pre{
        static int pIndex = 0;
    }

    public static void main(String[] args) {       

        int in[] = { 9,3,15,20,7 };
        int pre[] = { 3,9,20,15,7 };
        int len = in.length;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<len;i++){
            hm.put(in[i],i);
        }

        System.out.println(hm);

        Node r1 = construct(pre,0,in.length-1,hm);

        printInorder(r1);
    }

    /* This function is here just to test buildTree() */
    public static void printInorder( Node node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.println(node.data);
        printInorder(node.right);
    }

    public static Node construct(int[] pre,int start,int end,HashMap<Integer,Integer> map){

        
        // base case :
        if(start>end)
            return null;

        int root = pre[Pre.pIndex]; // get root node data from preorder
        Pre.pIndex++;

        Node newNode = new Node(root);

        int index = map.get(root); // index of root element in inorder traverse

        newNode.left = construct(pre,start,index-1,map);
        newNode.right = construct(pre,index+1,end,map);

        return newNode;
    }

}
