package find_resultant_array_after_removing_anagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeAnagrams() {
        String[] words = new String[]{"aavv" , "vvaa" , "cd" , "dc"};
        Assertions.assertArrayEquals(new String[]{"aavv" , "cd"} , Solution.removeAnagrams(words).toArray());
    }
}