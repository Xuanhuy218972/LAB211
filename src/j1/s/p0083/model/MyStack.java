package j1.s.p0083.model;

/**
 * Simple integer stack implemented using a fixed-size array.
 * No use of library stack classes.
 */
public class MyStack {
    private final int[] stack;
    private int top;

    /**
     * Create a stack with a given capacity.
     * @param capacity maximum number of elements the stack can hold
     */
    public MyStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.stack = new int[capacity];
        this.top = -1;
    }

    /**
     * Push a value onto the stack.
     * @param value value to push
     * @return true if push succeeded; false if the stack is full
     */
    public boolean push(int value) {
        if (isFull()) {
            return false;
        }
        top++;
        stack[top] = value;
        return true;
    }

    /**
     * Pop a value from the stack.
     * @return the popped value, or null if the stack is empty
     */
    public Integer pop() {
        if (isEmpty()) {
            return null;
        }
        int value = stack[top];
        top--;
        return value;
    }

    /**
     * Get the top value without removing it.
     * @return the top value, or null if the stack is empty
     */
    public Integer get() {
        if (isEmpty()) {
            return null;
        }
        return stack[top];
    }

    /**
     * @return true if stack has no elements
     */
    public boolean isEmpty() {
        return top < 0;
    }

    /**
     * @return true if stack cannot accept more elements
     */
    public boolean isFull() {
        return top + 1 == stack.length;
    }

    /**
     * @return current number of elements
     */
    public int size() {
        return top + 1;
    }

    /**
     * @return capacity of the stack
     */
    public int capacity() {
        return stack.length;
    }
}


