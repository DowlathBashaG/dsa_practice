package dowlath.io.dsa.misc;

import java.util.Stack;

public class ImplementQueueUsingStack {

    private Stack stack1 = new Stack<>();
    private Stack stack2 = new Stack<>();

    public void enqueue(int element){
        stack1.push(element);
        System.out.println(element + " Inserted.");
    }

    public void dequeue(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        System.out.println(stack2.pop() + " Removed. ");
    }

    public static void main(String[] args) {
        ImplementQueueUsingStack iqs = new ImplementQueueUsingStack();
        iqs.enqueue(10);
        iqs.enqueue(20);
        iqs.enqueue(30);
        iqs.dequeue();
    }
}
