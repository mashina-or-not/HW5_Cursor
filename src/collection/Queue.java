package collection;

import exception.LinkedListEmptyException;

public class Queue<T> {
    private Node front, rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    private class Node {
        Node next;
        T value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(T value) {
        Node oldRear = rear;
        rear = new Node();
        rear.value = value;
        rear.next = null;
        if (isEmpty())
            front = rear;
        else
            oldRear.next = rear;
        size++;
    }

    public T dequeue() {
        if (isEmpty())
            throw new LinkedListEmptyException();
        T value = front.value;
        front = front.next;
        size--;
        return value;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node nextNode = front;
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