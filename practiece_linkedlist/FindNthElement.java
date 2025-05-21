package dowlath.io.dsa.practiece_linkedlist;

public class FindNthElement {
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
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void findNthNode(int key){
        if(head == null){
            return;
        }
        ListNode refKey = head;
        ListNode mainKey = head;
        int count = 0;

        while(count < key){
            refKey = refKey.next;
            count++;
        }

        while(refKey != null){
            mainKey = mainKey.next;
            refKey = refKey.next;
        }
        System.out.println(key+ "  find Nth Node ... "+ mainKey.data);
    }

    public static void main(String[] args) {
        FindNthElement findNthElement = new FindNthElement();
        findNthElement.insertNode(10);
        findNthElement.insertNode(20);
        findNthElement.insertNode(30);
        findNthElement.insertNode(40);
        findNthElement.insertNode(50);
        System.out.println("The given list of nodes... : ");
        findNthElement.print();
        findNthElement.findNthNode(2);

    }
}
