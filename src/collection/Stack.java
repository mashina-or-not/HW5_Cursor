package collection;

import exception.LinkedListEmptyException;

public class Stack<T> {

    private Node head;
    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    private class Node {
        T value;
        Node next;
    }

    public void push(T value) {
        Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T pop() {
        if (isEmpty())
            throw new LinkedListEmptyException();
        T value = head.value;
        head = head.next;
        size--;
        return value;
    }

    public T top() {
        if (isEmpty())
            throw new LinkedListEmptyException();
        return head.value;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node nextNode = head;
        for (int i = 0; i < size; i++) {
            if (i == size - 1)
                stringBuilder.append(nextNode.value);
            else
                stringBuilder.append(nextNode.value).append(", ");
            nextNode = nextNode.next;
        }
        return "[" + stringBuilder + "]";
    }
}