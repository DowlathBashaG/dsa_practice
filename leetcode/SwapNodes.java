package dowlath.io.dsa.leetcode;

public class SwapNodes {
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

    public void swapNodes(){
        ListNode temp = head;
        while(temp != null && temp.next != null){
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }

    public static void main(String[] args) {
        SwapNodes swapNodes = new SwapNodes();
        swapNodes.insertNode(10);
        swapNodes.insertNode(20);
        swapNodes.insertNode(30);
        swapNodes.insertNode(40);
        swapNodes.insertNode(50);

        System.out.println("The given list of nodes .... :");
        swapNodes.print();

        System.out.println("The swap nodes .... :");
        swapNodes.swapNodes();
        swapNodes.print();

    }
}
