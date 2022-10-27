package codegym;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    void alex_pollFirst(){
        ourLinkedList.add("Cat");
        ourLinkedList.add("Dog");
        ourLinkedList.add("Bird");
        ourLinkedList.add("Fish");
        ourLinkedList.add("Mouse");
        assertTrue(ourLinkedList.pollFirst()!=null);
        ourLinkedList.pollFirst();

    }
}