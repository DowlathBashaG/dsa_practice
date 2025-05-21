package dowlath.io.dsa;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertBegin(int data){
    ListNode newNode = new ListNode(data);
    newNode.next = head;
    head = newNode;
    }

    public void insertLast(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null != current.next){
           current = current.next;
        }
        current.next = newNode;
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+ " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int size(){
        ListNode current = head;
        int count = 0;
        while(current !=null){
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean search(int data){
        ListNode current = head;
        while(current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
         return false;
    }

    public ListNode reverseList(ListNode head){
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public ListNode getMidOfNode(){
        if(head == null){
            return null;
        }
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public ListNode getNthNode(int n){
        if(head == null){
            return  null;
        }
        if(n <= 0){
            throw new IllegalArgumentException("Invalid Value");
        }

        ListNode refPtr = head;
        ListNode mainPtr = head;

        int count = 0;

        while(count < n){
            if(refPtr == null){
                throw new IllegalArgumentException(n +" is greater than number of nodes");
            }
            refPtr = refPtr.next;
            count++;
        }

        while(refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;

    }

    public void removeDuplicates(){
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
    }

    public ListNode insertNewNodeInSortedList(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            return newNode;
        }
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    public void removeSpecificNode(int value){
        ListNode current = head;
        ListNode temp = null;

        if(current != null && current.data == value){
            head = current.next;
            return;
        }

        while(current != null && current.data != value){
            temp = current;
            current = current.next;
        }
        if(current==null) return;
        temp.next = current.next;
    }

    public boolean containsLoop(){
        if( head == null){
            return false;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if( slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }

    public void createALoopInLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        //sixth.next = third;
    }

    public ListNode deleteFirst(){
        if (head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast(){
        if( head == null && head.next == null){
            return null;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next !=null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public void deleteNthPosition(int position){
        if(position == 0){
            ListNode temp = head;
            head = head.next;
            temp.next = null;
        }else{
            ListNode previous = head;
            int count = 0;
            while( count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
            current.next = null;
        }
    }

    public static void main(String args[]){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
       /* singlyLinkedList.insertBegin(10);
        singlyLinkedList.insertBegin(20);
        singlyLinkedList.insertBegin(30);
        singlyLinkedList.insertBegin(40);
        System.out.println("Print insert at the begin list...");
        singlyLinkedList.display();*/

        singlyLinkedList.insertLast(1);
        singlyLinkedList.insertLast(2);
        singlyLinkedList.insertLast(3);
        singlyLinkedList.insertLast(4);
        singlyLinkedList.insertLast(5);
        singlyLinkedList.insertLast(6);


        // Contains Loop



        System.out.println("Print insert at the last list...");
        singlyLinkedList.display();

        /* System.out.println("Print size of the list..."+singlyLinkedList.size());


        System.out.println("Search Node from this given list...");
        System.out.println(singlyLinkedList.search(40));*/

      /*  System.out.println("Reverse List.... : ");
        ListNode reverseNode = singlyLinkedList.reverseList(singlyLinkedList.head);
        singlyLinkedList.display();*/

       // System.out.println("Mid of the Node ");

       // ListNode midNode = singlyLinkedList.getMidOfNode();
       // System.out.println(midNode.data);

        /*
        ListNode nthPosition = singlyLinkedList.getNthNode(1);
        System.out.println("Find Nth Position....Node : "+ nthPosition.data);
        */

        /*
        System.out.println("Removed Duplicates....");
        singlyLinkedList.removeDuplicates();
        singlyLinkedList.display();
        */

      /*  singlyLinkedList.insertNewNodeInSortedList(6);
        singlyLinkedList.display();

        singlyLinkedList.removeSpecificNode(6);
        singlyLinkedList.display();*/

      //  singlyLinkedList.createALoopInLinkedList();

       // System.out.println("Is it detected Loop .... : " + singlyLinkedList.containsLoop());

       // System.out.println(singlyLinkedList.deleteFirst().data);

        //System.out.println(singlyLinkedList.deleteLast().data);

        singlyLinkedList.deleteNthPosition(0);
        singlyLinkedList.display();
    }
}
