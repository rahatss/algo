package shuffle_the_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void shuffle() {
        int[] nums = new int[]{2,5,1,3,4,7};
        Assertions.assertArrayEquals(new int[]{2,3,5,4,1,7} , Solution.shuffle(nums , 3));
    }
}