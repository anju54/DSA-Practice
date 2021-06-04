package Trie;

import java.util.HashMap;
import java.util.Map;

public class TrieUsingMap {

    public static void main(String[] args) {

        String[] s = new String[]{"anju","man"};
        TrieMap trie = new TrieMap(s);

        boolean found = trie.contains("man");
        System.out.println(found);
    }

}

class TrieMap {

    private Map<Character, HashMap> child;
    private boolean isEnd;

    TrieMap(){
        child = new HashMap<Character, HashMap>();
        isEnd = false;
    }

    public TrieMap(String[] arr) {
        child = new HashMap<Character, HashMap>();
        for (String s: arr)
            addWord(s);
    }

    public void addWord(String word){

        Map<Character, HashMap> tempNode = child;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
            if ( tempNode.containsKey(ch) )
                tempNode = tempNode.get(ch);
            else {
                tempNode.put(ch, new HashMap<>());
                tempNode = tempNode.get(ch);
            }
        }

        tempNode.put('\0',new HashMap<>(0));  // to mark end of the word .. append \0
    }

    public boolean contains(String str)
    {
        Map<Character, HashMap> currentNode = child;
        for (int i = 0; i < str.length(); i++)
        {
            if (currentNode.containsKey(str.charAt(i)))
                currentNode = currentNode.get(str.charAt(i));
            else
                return false;
        }
        return currentNode.containsKey('\0') ? true : false;
    }

}

