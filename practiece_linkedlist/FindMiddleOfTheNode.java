package dowlath.io.dsa.practiece_linkedlist;

public class FindMiddleOfTheNode {
    ListNode head;

    public static class ListNode{
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
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void print(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+ " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void middleOfTheNode(){
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next !=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        System.out.println("Middle of the Node ..... : "+ slowPtr.data);
    }
    public static void main(String[] args) {
        FindMiddleOfTheNode middleOfTheNode = new FindMiddleOfTheNode();
        middleOfTheNode.insertNode(10);
        middleOfTheNode.insertNode(20);
        middleOfTheNode.insertNode(30);
        middleOfTheNode.insertNode(40);
        middleOfTheNode.insertNode(50);
        System.out.println("The given node .... : ");
        middleOfTheNode.print();
        middleOfTheNode.middleOfTheNode();

    }
}
