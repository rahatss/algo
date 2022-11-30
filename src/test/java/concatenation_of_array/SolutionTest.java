package concatenation_of_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void getConcatenation() {
        int[] nums = new int[]{1 , 2 , 3};
        Assertions.assertArrayEquals(new int[]{1 ,2 , 3 ,1 ,2 ,3} , Solution.getConcatenation(nums));
    }
}