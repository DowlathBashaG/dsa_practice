package dowlath.io.dsa.leetcode;

public class RemoveSpecificNode {
    ListNode head;
    public static class ListNode{
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

    public void removeSpecificNode(int value){
        ListNode current = head;
        ListNode temp = null;

        while(current != null && current.data < value ){
            temp = current;
            current = current.next;
        }

        if(current==null) return;
        temp.next = current.next;
    }

    public static void main(String[] args) {
        RemoveSpecificNode removeSpecificNode  = new RemoveSpecificNode();
        removeSpecificNode.insertNode(10);
        removeSpecificNode.insertNode(20);
        removeSpecificNode.insertNode(30);
        removeSpecificNode.insertNode(40);
        removeSpecificNode.insertNode(50);
        removeSpecificNode.insertNode(60);
        removeSpecificNode.insertNode(70);

        System.out.println("The given list of nodes.... ");
        removeSpecificNode.print();

        System.out.println("After removed specific node , the list... ");
        removeSpecificNode.removeSpecificNode(60);
        removeSpecificNode.print();


    }
}
