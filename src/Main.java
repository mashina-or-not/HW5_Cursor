import collection.DoublyLinkedList;
import collection.Queue;
import collection.Stack;

public class Main {
    public static void main(String[] args) {
        //Stack
        Stack<Integer> intStack = new Stack<>() {{
            push(5);
            push(3);
            push(1);
        }};
        Stack<String> strStack = new Stack<>() {{
            push("Who");
            push("i");
            push("am");
        }};

        System.out.println("Integer collection.Stack: " + intStack);
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Integer collection.Stack: " + intStack);
        System.out.println("Size: " + intStack.size());
        System.out.println("Top: " + intStack.top());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Integer collection.Stack: " + intStack);
        System.out.println("IsEmpty - " + intStack.isEmpty());
        System.out.println("===".repeat(20));

        System.out.println("String collection.Stack: " + strStack);
        System.out.println("Pop: " + strStack.pop());
        System.out.println("Integer collection.Stack: " + strStack);
        System.out.println("Size: " + strStack.size());
        System.out.println("Top: " + strStack.top());
        System.out.println("Pop: " + strStack.pop());
        System.out.println("Integer collection.Stack: " + strStack);
        System.out.println("Pop: " + strStack.pop());
        System.out.println("IsEmpty - " + strStack.isEmpty());
        System.out.println("===".repeat(20));

        //Queue
        Queue<Integer> intQueue = new Queue<>() {{
            enqueue(3);
            enqueue(4);
            enqueue(5);
        }};
        Queue<String> strQueue = new Queue<>() {{
            enqueue("i");
            enqueue("am");
            enqueue("batman");
        }};
        System.out.println("Integer Queue: " + intQueue);
        System.out.println("Dequeue: " + intQueue.dequeue());
        System.out.println("Integer Queue: " + intQueue);
        System.out.println("Size: " + intQueue.size());
        System.out.println("Dequeue: " + intQueue.dequeue());
        System.out.println("Integer Queue: " + intQueue);
        System.out.println("Dequeue: " + intQueue.dequeue());
        System.out.println("Integer Queue: " + intQueue);
        System.out.println("IsEmpty: " + intQueue.isEmpty());
        System.out.println("===".repeat(20));

        System.out.println("String Queue: " + strQueue);
        System.out.println("Dequeue: " + strQueue.dequeue());
        System.out.println("String Queue: " + strQueue);
        System.out.println("Dequeue: " + strQueue.dequeue());
        System.out.println("String Queue: " + strQueue);
        System.out.println("Size: " + strQueue.size());
        System.out.println("IsEmpty: " + strQueue.isEmpty());
        System.out.println("===".repeat(20));

        //DoublyLinkedList
        DoublyLinkedList<Integer> intList = new DoublyLinkedList<>() {{
            addFirst(4);
            addFirst(5);
            addLast(1);
            addLast(2);
            add(6, 3);
            add(3, 4);
        }};
        DoublyLinkedList<String> strList = new DoublyLinkedList<>() {{
            addFirst("am");
            addFirst("i");
            addLast("super");
            addLast("man");
            add("@", 3);
            add("@", 5);
        }};
        System.out.println("Integer LinkedList: " + intList);
        intList.removeFirst();
        System.out.println("Integer LinkedList: " + intList);
        intList.removeLast();
        System.out.println("Integer LinkedList: " + intList);
        System.out.println("Size: " + intList.size());
        intList.removeFirst();
        intList.removeFirst();
        intList.removeFirst();
        intList.removeFirst();
        System.out.println("Integer LinkedList: " + intList);
        System.out.println("IsEmpty - " + intList.isEmpty());
        System.out.println("===".repeat(20));

        System.out.println("String LinkedList: " + strList);
        strList.removeFirst();
        System.out.println("String LinkedList: " + strList);
        strList.removeLast();
        System.out.println("String LinkedList: " + strList);
        System.out.println("Size: " + strList.size());
        strList.removeLast();
        System.out.println("String LinkedList: " + strList);
        System.out.println("Size: " + strList.size());
        strList.removeFirst();
        System.out.println("String LinkedList: " + strList);
        System.out.println("===".repeat(20));
    }
}