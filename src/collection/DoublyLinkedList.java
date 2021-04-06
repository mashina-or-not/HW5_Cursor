package collection;

import exception.LinkedListEmptyException;

public class DoublyLinkedList<T> {
    private Node head, tail;
    private int size;

    private class Node {
        Node next;
        Node prev;
        T value;
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void addFirst(T value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = head;
        newNode.prev = null;
        if (head != null)
            head.prev = newNode;
        head = newNode;
        if (tail == null)
            tail = newNode;
        size++;
    }

    public void addLast(T value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        newNode.prev = tail;
        if (head == null)
            head = newNode;
        if (tail != null)
            tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void add(T value, int index) {
        if (size == 0)
            addFirst(value);
        else if (size == index)
            addLast(value);
        else {
            Node node = getNode(index);
            Node newNode = new Node();
            newNode.value = value;
            newNode.prev = node.prev;
            newNode.next = node;
            node.prev.next = newNode;
            node.prev = newNode;
            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty())
            throw new LinkedListEmptyException();
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty())
            throw new LinkedListEmptyException();
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
        } else {
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    private Node getNode(int index) {
        if (index >= size || index < 0)
            throw new LinkedListEmptyException();
        Node newNode = head;
        for (int i = 0; i < index; i++)
            newNode = newNode.next;
        return newNode;
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