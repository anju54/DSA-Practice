package Trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Node{
    boolean isEnd ;
    HashMap<Character,Node> child ;

    Node(){
        isEnd = false;
        child = new HashMap<>();
    }
}

public class Trie1 {

    public static Node root;

    public static void insert(String word){

        if(word.length()==0)
            return;

        Node curr = root;

        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            Node node = curr.child.get(c);
            if(node==null){
                curr.child.put(c,new Node()); //  create a new node

            }else{
                curr = curr.child.get(c);// if present then increment to next
            }
        }
        curr.isEnd = true;
    }

    public static List<String> autocomplete(String word){

        List<String> res = new ArrayList<>();

        Node curr = root;

        for(int i=0;i<word.length();i++) {
            char c = word.charAt(i);
            if(curr.child.containsKey(c)){
                curr = curr.child.get(c);
            }else
                return res;
        }

        search(curr,word,res);
        return res;
    }

    public static void search(Node curr,String prefix,List<String> res){

        if(curr==null)
            return;

        if (curr.isEnd==true)
            res.add(prefix);

        HashMap<Character,Node> childAfterPrefixNode = curr.child;

        for(Character c : childAfterPrefixNode.keySet())
            search(childAfterPrefixNode.get(c),prefix+String.valueOf(c),res);

    }

    public static void main(String[] args) {
        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};

        String output[] = {"Not present in trie", "Present in trie"};

        Trie root = new Trie();

        // Construct trie
        int i;
        for (i = 0; i < keys.length; i++)
            insert(keys[i]);

        List<String> res = autocomplete("the");
        System.out.println(res.toArray());
    }
}
