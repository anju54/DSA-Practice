package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

// https://www.geeksforgeeks.org/queue-based-approach-for-first-non-repeating-character-in-a-stream/
public class FirstNonRepeatingInStreamUsingQueue {

    public static void main(String[] args) {

        String str = "aabc";
        firstNonRepeating(str);
    }

    private static void firstNonRepeating(String str) {

        int arr[] = new int[26];
        Deque<Character> queue = new ArrayDeque<>();

        for (int i=0;i<str.length();i++){

            char ch = str.charAt(i);
            int index = ch - 'a';

            arr[index]++;

            queue.addLast(ch);  // or queue.add(ch);

            while (!queue.isEmpty()){

                char front2 = queue.peek();
                int freq2 = arr[front2 - 'a'];
                if (freq2==1)
                    break;
                else
                    queue.remove();
            }
            if (queue.isEmpty())
                System.out.println("-1");
            else
                System.out.println(queue.peek());
        }
    }
}
