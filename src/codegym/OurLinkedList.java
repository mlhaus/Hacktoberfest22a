package codegym;


import java.util.ArrayList;
import java.util.Arrays;

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

    public static class Node<T> {
        private Node prev;
        private T value;
        private Node next;
    }



}
