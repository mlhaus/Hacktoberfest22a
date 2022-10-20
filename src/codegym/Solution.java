package codegym;

public class Solution {
    public static void main(String[] args) {
        OurLinkedList<String> ourLinkedList = new OurLinkedList<>();
        ourLinkedList.add("Cat");
        ourLinkedList.add("Dog");
        ourLinkedList.add("Rabbit");
        ourLinkedList.add(1, "Turtle");
        ourLinkedList.printAll();
        System.out.println(ourLinkedList.get(2));
    }
}
