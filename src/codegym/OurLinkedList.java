package codegym;


import java.util.NoSuchElementException;

public class OurLinkedList<T> {
    private Node first = new Node();
    private Node last = new Node();

    public OurLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(T value) {
        Node node = new Node();
        node.value = value;
        Node temp = last.prev;
        temp.next = node;
        last.prev = node;
        node.prev = temp;
        node.next = last;
    }

    public void add(int index, T value) {
        Node node = new Node();
        node.value = value;
        Node currentElement = first.next;
        for(int i = 0; i < index; i++) {
            currentElement = currentElement.next;
        }
        Node temp = currentElement.prev;
        temp.next = node;
        currentElement.prev = node;
        node.prev = temp;
        node.next = currentElement;
    }

    public T get(int index) {
        Node currentElement = first.next;
        for(int i = 0; i < index; i++) {
            currentElement = currentElement.next;
        }
        return (T) currentElement.value;
    }

    public T removeFirst(){
        // Brendan
//        T removed = (T)first.next.value;
//        first = first.next;
//        return removed;
        // Marc
        Node removed = first.next;
        first.next = removed.next;
        return (T)removed.value;
    }
    public T getFirst(){
        // Jacci
        Node firstOne = first.next;
//        first.next = firstOne.next;
        return (T)firstOne.value;
    }
    
    public static class Node<T> {
        private Node prev;
        private T value;
        private Node next;
    }

    public void addLast(T value) {
        //parker
        add(value);
    }

    public T remove() {
        if(first.next == last && last.prev == first) {
            throw new NoSuchElementException("No object to remove");
        }
        Node nodeToRemove = first.next;
        first.next = nodeToRemove.next;
        nodeToRemove.next = nodeToRemove.prev;
        return (T)nodeToRemove.value;
    }

}
