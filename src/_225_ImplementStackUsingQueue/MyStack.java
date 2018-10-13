package _225_ImplementStackUsingQueue;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> queue = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (queue.isEmpty()) {
            queue.add(x);
            while (!queue2.isEmpty())
                queue.add(queue2.remove());
        } else {
            queue2.add(x);
            while (!queue.isEmpty())
                queue2.add(queue.remove());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.isEmpty() ? queue2.remove() : queue.remove();
    }

    /** Get the top element. */
    public int top() {
        return queue.isEmpty() ? queue2.peek() : queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty() && queue2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */