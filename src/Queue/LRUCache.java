package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;

public class LRUCache {

    private Deque<Integer> deque;
    private HashSet<Integer> set;

    private int capacity ;

    private int pageFault = 0;

    public LRUCache(int capacity) {
        this.deque = new ArrayDeque<>();
        this.set = new HashSet<>();
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.find(1);
        cache.find(2);
        cache.find(3);
        cache.find(3);
        cache.find(1);
        cache.find(2);

        System.out.println("page fault = "+cache.pageFault);
        System.out.println("Displaying cache content");
        cache.displayCache();
    }

    public  void find(int page){

        // check if present in queue
        if (set.contains(page)){
            System.out.println("page found "+page);
            int recentPage = deque.getLast();
            deque.remove();
        }else{
            pageFault++;
            if (deque.size() == capacity){
                int last = deque.removeFirst();
                set.remove(last);
            }
        }

        deque.add(page);
        set.add(page);
    }

    public void displayCache(){
        Iterator<Integer> itr = deque.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    // 1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5
}
