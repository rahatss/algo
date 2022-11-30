package running_sum_of_1d_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void runningSum() {
        int[] nums = new int[]{1 , 2 ,3 ,4};
        Assertions.assertArrayEquals(new int[]{1 ,3 ,6 , 10} , Solution.runningSum(nums));
    }
}