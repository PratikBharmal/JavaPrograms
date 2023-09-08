package DSA.Queue;

public class queueUsingArray {

    static class queue{
        static int arr[];
         int size;
        static int rear = -1;
        //here we don't need to declare front = -1 because in array front always 0
        queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        //enqueue   Time Complexity O(1)
        public  void add(int data){
            if(rear == size - 1){
                System.out.println("Queue is full");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        //dequeue  + Peek Time Complexity O(n)
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];
            for(int i = 0; i < rear; i++){
                arr[i] = arr[i+1];
            }

            rear--;
            return front;
        }

        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }
    }
    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
