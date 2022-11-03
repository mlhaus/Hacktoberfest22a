package codewars;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WhoLikesItTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", Solution.whoLikesIt());
        assertEquals("Peter likes this", Solution.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", Solution.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", Solution.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", Solution.whoLikesIt("Alex", "Jacob", "Mark",
                "Max"));
        // added tests below
        assertEquals("Marc and Henry like this", Solution.whoLikesIt("Marc", "Henry"));
        assertEquals("Marc, Sarah and Geno like this", Solution.whoLikesIt("Marc", "Sarah", "Geno"));
        assertEquals("Marc, Sarah and 5 others like this", Solution.whoLikesIt("Marc", "Sarah", "Geno",
                "Fritz", "Leah", "Stephanie", "Todd"));
    }
}
