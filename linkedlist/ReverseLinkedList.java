package dowlath.io.dsa.linkedlist;

class Node{
    int data;
    Node next;

    Node(){

    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
public class ReverseLinkedList {

     private static void print(Node head){
         Node current = head;
         while(current != null){
             System.out.print(current.data + " -> ");
             current = current.next;
         }
         System.out.println("null");
     }

     private static Node reverseOrder(Node head){
         Node current = head;
         Node previous = null;
         while(current != null){
             Node next = current.next;
             current.next = previous;
             previous = current;
             current = next;
         }
         return previous;
     }

    public static void main(String[] args) {
        int[] keys = {1, 2, 3, 4, 5, 6};
        Node head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }

        System.out.println("Before reverse order.... ");
        print(head);

        head = reverseOrder(head);

        System.out.println("After reverse order.... ");
        print(head);
    }
}
