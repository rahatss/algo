package valid_anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isAnagram() {
        String s = "anagram" , t = "aangarm";
        assertTrue(Solution.isAnagram(s, t));
    }
}