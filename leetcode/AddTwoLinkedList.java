package dowlath.io.dsa.leetcode;

public class AddTwoLinkedList {
    ListNode head;
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private void insertNode(int value){
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

    private void print(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+ " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static ListNode addTwoList(ListNode firstList, ListNode secondList){
        ListNode result = null;
        ListNode first = null;
        int carry = 0;

        while(firstList != null || secondList != null){
            int sum =0;
            if(firstList != null){
                sum+=firstList.data;
                firstList = firstList.next;
            }
            if(secondList != null){
                sum+=secondList.data;
                secondList = secondList.next;
            }
            sum = sum + carry;
            int value = sum % 10;
            carry = sum / 10;

            ListNode node = new ListNode(value);
            if(result != null){
                result.next = node;
                result = result.next;
            } else {
                result = first = node;
            }
        }
        if( carry > 0) {
            result.next = new ListNode(carry);
        }
        return first;
    }

    public static void main(String[] args) {
        AddTwoLinkedList firstList = new AddTwoLinkedList();
        firstList.insertNode(1);
        firstList.insertNode(2);
        firstList.insertNode(3);
        System.out.println("First List.... :");
        firstList.print();

        AddTwoLinkedList secondList = new AddTwoLinkedList();
        secondList.insertNode(3);
        secondList.insertNode(2);
        secondList.insertNode(1);
        System.out.println("Second List.... :");
        secondList.print();

        ListNode newNode = addTwoList(firstList.head,secondList.head);
        System.out.println("Result Node after adding two nodes.... : ");
        while(newNode !=null){
            System.out.print(newNode.data+ " --> ");
            newNode = newNode.next;
        }
        System.out.println("null");
    }
}
