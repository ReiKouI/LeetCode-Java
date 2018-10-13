package _232_ImplementQueueUsingStacks;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> data = new Stack<>();

    private Stack<Integer> data2 = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        data.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (data2.empty())
            while (!data.empty())
                data2.push(data.pop());
        return data2.empty() ? 0 : data2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (data2.empty())
            while (!data.empty())
                data2.push(data.pop());
        return data2.empty() ? 0 : data2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return data.empty() && data2.empty();
    }

}
