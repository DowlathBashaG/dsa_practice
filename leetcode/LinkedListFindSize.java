package dowlath.io.dsa.leetcode;

public class LinkedListFindSize{
    ListNode head;
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insertNode(int data){
        ListNode newNode = new ListNode(data);
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
            System.out.print(current.data+ " ---> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int size(){
        ListNode current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedListFindSize findSize = new LinkedListFindSize();
        findSize.insertNode(10);
        findSize.insertNode(20);
        findSize.insertNode(30);
        findSize.insertNode(40);
        findSize.insertNode(50);
        findSize.insertNode(60);
        findSize.insertNode(70);
        System.out.println("The given list of nodes .... :");
        findSize.print();
        System.out.println("Size of Nodes .... : "+findSize.size());
    }
}
