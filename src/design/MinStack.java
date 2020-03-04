package design;

import java.util.*;

public class MinStack {

    private Deque<Integer> s = new ArrayDeque<>();
    private Deque<Integer> min = new ArrayDeque<>();
    public void push(int x) {
        if (min.isEmpty() || x <= min.peek()) {
            min.push(x);
        }
        s.push(x);
    }

    public void pop() {
        if (s.peek().equals(min.peek())) {
            min.pop();
        }
        s.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min.peek();
    }

}
