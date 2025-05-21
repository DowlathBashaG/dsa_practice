package dowlath.io.dsa.leetcode;

public class LinkedListRemoveDuplicates {
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
        temp.next= newNode;
    }

    public void print(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void removeDuplicate(){
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListRemoveDuplicates removeDuplicates = new LinkedListRemoveDuplicates();
        removeDuplicates.insertNode(1);
        removeDuplicates.insertNode(2);
        removeDuplicates.insertNode(3);
        removeDuplicates.insertNode(3);
        removeDuplicates.insertNode(4);
        removeDuplicates.insertNode(5);

        System.out.println("The given list ... : ");
        removeDuplicates.print();

        System.out.println("After removing duplicates ... : ");
        removeDuplicates.removeDuplicate();
        removeDuplicates.print();

    }
}
