package dowlath.io.dsa.misc;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    private Queue queue = new LinkedList();

    public void push(int value){
        int queueSize = queue.size();
        queue.add(value);
        for(int i = 0;i<queueSize;i++){
            queue.add(queue.remove());
        }
    }

    public void pop(){
        System.out.println("An element removed from stack... : "+ queue.remove());
    }

    public static void main(String[] args) {
        ImplementStackUsingQueue isq = new ImplementStackUsingQueue();
        isq.push(11);
        isq.push(22);
        isq.push(33);
        isq.push(44);
        isq.push(55);
        System.out.println(isq.queue);
        isq.push(66);
        isq.pop();
        System.out.println(isq.queue);
    }

}
