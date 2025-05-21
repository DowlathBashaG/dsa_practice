package dowlath.io.dsa.linkedlist;

public class InsertNodeBegining {
    ListNode head;
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insertNodeBegining(int value){
        ListNode newNode = new ListNode(value);
            newNode.next = head;
            head = newNode;
    }

    public void print(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertNodeBegining insertNodeBegining = new InsertNodeBegining();
        insertNodeBegining.insertNodeBegining(10);
        insertNodeBegining.insertNodeBegining(20);
        insertNodeBegining.insertNodeBegining(30);
        insertNodeBegining.insertNodeBegining(40);
        insertNodeBegining.insertNodeBegining(50);
        insertNodeBegining.print();
    }
}
