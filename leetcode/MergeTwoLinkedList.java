package dowlath.io.dsa.leetcode;

public class MergeTwoLinkedList {
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
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode mergeList(ListNode first, ListNode second){
        ListNode merge = new ListNode(0);
        ListNode temp = merge;
        while(true){
            if(first == null){
                temp.next = second;
                break;
            }else if(second == null){
                temp.next = first;
            }
            if(first.data <= second.data){
                temp.next = first;
                first = first.next;
            } else{
                temp.next = second;
                second = second.next;
            }
            temp = temp.next;
        }
        return merge.next;
    }

    public static void main(String[] args) {
        MergeTwoLinkedList mtFirstList = new MergeTwoLinkedList();
        mtFirstList.insertNode(5);
        mtFirstList.insertNode(15);
        mtFirstList.insertNode(25);
        mtFirstList.insertNode(35);
        mtFirstList.insertNode(45);

        System.out.println("First List..... :");
        mtFirstList.print();

        MergeTwoLinkedList mtSecondList = new MergeTwoLinkedList();
        mtSecondList.insertNode(10);
        mtSecondList.insertNode(20);
        mtSecondList.insertNode(30);
        mtSecondList.insertNode(40);
        mtSecondList.insertNode(50);

        System.out.println("Second List..... :");
        mtSecondList.print();

        System.out.println("Merge List..... :");
        mtFirstList.head =  new MergeTwoLinkedList().mergeList(mtFirstList.head,mtSecondList.head);
        mtFirstList.print();

    }
}
