package Trie;

class Trie {

    private Trie child[] ;
    private boolean isEnd ;

    /** Initialize your data structure here. */
    public Trie() {
        child = new Trie[26];
        isEnd = false;
    }

    /** Inserts a word into the trie. */
    public static void insert(String word,Trie root) {

        Trie curr = root;
        for(char c : word.toCharArray()){
            int index =  c - 'a';
            if( (curr.child[index]) == null )
                curr.child[index] = new Trie();

            curr = curr.child[index];
        }
        curr.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public static boolean search(String word,Trie root) {

        Trie curr = root;
        for(char c : word.toCharArray()){
            int index =  c - 'a';
            if( (curr.child[index]) == null )
                return false;
            curr = curr.child[index];
        }
        if(curr.isEnd==true)
            return true;
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie curr = this;
        for(char c : prefix.toCharArray()){
            int index =  c - 'a';
            if( (curr.child[index]) == null )
                return false;
            curr = curr.child[index];
        }
        return true;
    }

    public static void main(String[] args) {
        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};

        String output[] = {"Not present in trie", "Present in trie"};

        Trie root = new Trie();

        // Construct trie
        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i],root);

        if(search("the",root) == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);
    }
}