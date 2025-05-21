package dowlath.io.dsa.practiece_linkedlist;

public class LinkedListDemo {
    ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertNode(int data){
        ListNode node = new ListNode(data);
        if(head == null){
            head = node;
            return;
        }
        ListNode temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public ListNode reverseList(){
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public void print(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+ " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
       LinkedListDemo linkedListDemo = new LinkedListDemo();
       linkedListDemo.insertNode(10);
       linkedListDemo.insertNode(20);
       linkedListDemo.insertNode(30);
       linkedListDemo.insertNode(40);
       linkedListDemo.insertNode(50);
       System.out.println("The given linked list .... : ");
       linkedListDemo.print();
       System.out.println("The reverse linked list .... : ");
       ListNode reverseList = linkedListDemo.reverseList();
        linkedListDemo.head = reverseList;
        linkedListDemo.print();


    }

}
