package DSA.Queue;
import java.util.*;
public class usingCollectionQueue {
    public static void main(String[] args) {
        // queue q = new queue();
        // Queue<Integer> q = new LinkedList<>();    //it has Time Complexity to insert and remove element O(1)....
                                                    // it is slower than ArrayDequeu because when accessing the element from any position TC is O(n)...
                                                   // it is impliment doubly LinkedList...each element in the list contains both the reference of next and previous element in the list
                                                  //consume more memory than ArrayDeqeue

        Queue<Integer> q = new ArrayDeque<>();     //it has double ended queue
                                                  // it provide TC to insert and remove element O(1)
                                                 // it is faster for accessing element from any index because it uses array internally
                                                //consume less memory than LinkedList
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
