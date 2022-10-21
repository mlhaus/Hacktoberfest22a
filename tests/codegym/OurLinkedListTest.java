package codegym;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OurLinkedListTest {
    private OurLinkedList<String> ourLinkedList;
    @BeforeEach
    void setUp() {
        ourLinkedList = new OurLinkedList<>();
    }

    @Test
    void marc_addTest1() {
        ourLinkedList.add("Cat");
        assertEquals("Cat", ourLinkedList.get(0));
    }

    @Test
    void marc_addTest2() {
        ourLinkedList.add("Cat");
        ourLinkedList.add(0, "Turtle");
        assertEquals("Turtle", ourLinkedList.get(0));
        assertEquals("Cat", ourLinkedList.get(1));
    }

    @Test
    void brendan_removeFirst(){
        ourLinkedList.add("cat");
        ourLinkedList.add("dog");
        ourLinkedList.removeFirst();
        assertEquals("dog",ourLinkedList.get(0));
    }

    @Test
    void brendan_removeFirst2(){
        ourLinkedList.add("tiger");
        ourLinkedList.add("alligator");
        ourLinkedList.add("cheetah");
        ourLinkedList.removeFirst();
        assertEquals("alligator",ourLinkedList.get(0));
    }

    @Test
    void brendan_removeFirst3(){
        ourLinkedList.add("tiger");
        ourLinkedList.add("alligator");
        ourLinkedList.add("cheetah");
        ourLinkedList.removeFirst();
        ourLinkedList.removeFirst();
        assertEquals("cheetah",ourLinkedList.get(0));
    }
}