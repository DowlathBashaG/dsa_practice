package dowlath.io.dsa.linkedlist;

public class DeleteNodeLinkedList {
    ListNode head;
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insertNode(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void print(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void deleteNode(int value){

        if(head == null){
            return;
        }

        if(head.data == value){
            head = head.next;
            return;
        }

        ListNode current = head;
        while(current != null && current.next.data != value){
            current = current.next;
        }
        if(current.next != null){
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {
        DeleteNodeLinkedList deleteNodeLinkedList = new DeleteNodeLinkedList();
        deleteNodeLinkedList.insertNode(10);
        deleteNodeLinkedList.insertNode(20);
        deleteNodeLinkedList.insertNode(30);
        deleteNodeLinkedList.insertNode(40);
        deleteNodeLinkedList.insertNode(50);
        deleteNodeLinkedList.print();
        deleteNodeLinkedList.deleteNode(30);
        deleteNodeLinkedList.print();
    }
}
