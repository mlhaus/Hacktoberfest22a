package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestHowManyPagesInABook {

    @Test
    public void testSample() {
        assertEquals(  5, HowManyPagesInABook.amountOfPages(5));
        assertEquals( 17, HowManyPagesInABook.amountOfPages(25));
        assertEquals(401, HowManyPagesInABook.amountOfPages(1095));
        assertEquals( 97, HowManyPagesInABook.amountOfPages(185));
        assertEquals(256, HowManyPagesInABook.amountOfPages(660));
        assertEquals(22222, HowManyPagesInABook.amountOfPages(100000));
        // This last test times out with my original code
        assertEquals(13888888, HowManyPagesInABook.amountOfPages(100000000));
    }

}
