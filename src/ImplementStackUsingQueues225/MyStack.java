package ImplementStackUsingQueues225;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new ArrayDeque<Integer>();
        q2 = new ArrayDeque<Integer>();
    }

    public void push(int x) {
        while(!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        q1.offer(x);

        while(!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        if(q1.isEmpty()) {
            return true;
        }
        return false;
    }
}
