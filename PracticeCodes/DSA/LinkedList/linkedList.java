package DSA.LinkedList;


public class linkedList {
    
    Node head;
    private int size;

    linkedList(){
        this.size = 0;
    }

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        } 

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // printList
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }

        System.out.print(" NULL ");
        System.out.println();
    }

    //deleteFirst

    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        size--;
        head = head.next;
    }

    //deleteLast

    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        size--;

        if(head.next == null){      //this condition arrise when only one node have 
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    //reverse LinkedList

    public void reverseList(){

        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

           prevNode = currNode;
           currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
    }

    //reverse LinkedList Recursive Method

    public Node reverseRecursive(Node head){

        if(head == null || head.next == null){
            return head;
        }
      Node newNode = reverseRecursive(head.next);  
      head.next.next = head;
      head.next = null;

      return newNode;

    }
    //1,2,2,4,5

    public Node removeDuplicate(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node currNode = head;
        while(currNode.next != null){
            if(currNode.data == currNode.next.data){
                currNode.next = currNode.next.next;
            }else{
                currNode = currNode.next;
            }
            
        }

        return head;

        
    }
    public static void main(String[] args) {

        linkedList list = new linkedList();
        
        list.addLast(10);
        list.addLast(10);
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(40);
        list.addLast(40);
        list.addLast(50);

        list.printList();

        // list.head = list.reverseRecursive(list.head);
        // list.printList();
        // list.addFirst(22);
        // list.printList();

        // list.addLast(444);
        // list.printList();

        // list.deleteLast();
        // list.printList();

        // list.deleteFirst();
        // list.printList();

    //    System.out.println(list.getSize()); 
    //     list.addFirst(23);
    //     System.out.println(list.getSize()); 

        list.head = list.removeDuplicate(list.head);
        list.printList();
    }
}
