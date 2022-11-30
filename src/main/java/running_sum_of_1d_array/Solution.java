package running_sum_of_1d_array;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
        int[] nums = new int[sizeOfArray];
        for (int i=0;i<sizeOfArray;i++){
            nums[i] = in.nextInt();
        }

        int[] ans = runningSum(nums);

        for (int i : ans) System.out.print(i+" ");
    }

    public static int[] runningSum(int[] nums){
        if (nums.length==1) return new int[]{1};

        int[] runningSum = new int[nums.length];
        int prevValue = nums[0];
        runningSum[0] = prevValue;
        for (int i=1;i<runningSum.length;i++){
            runningSum[i] = nums[i]+prevValue;
            prevValue = runningSum[i];
        }
        return runningSum;
    }
}
