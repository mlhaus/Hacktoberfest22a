package codegym;

import java.util.ArrayList;
import java.util.Arrays;
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

    public T pollFirst(){
        if(first.next== last && last.prev == first) {
            return null;
        }else{
            Node temp = first.next;
            first.next = temp.next;
            first.next.prev = first;
            return (T) temp;
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
        if (first.next == last){
            throw new NoSuchElementException();
        }
        return (T)firstOne.value;
    }

    public T getLast(){
        // Nick

        while (first.next != null)
        {
            last = first.next;
            first = first.next;
        }

        return (T)last.value;
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

    public int indexOf(T input) {
        // Eli
        Node currentElement = first.next;
        int count = 0;
        while ((currentElement) != null) {

            if (currentElement.value == input) {
                return count;
            }
            count++;
            currentElement = currentElement.next;
        }
        //System.out.println(count);
        return -1;

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
