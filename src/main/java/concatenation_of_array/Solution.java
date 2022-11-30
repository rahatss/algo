package concatenation_of_array;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
        int[] nums = new int[sizeOfArray];
        for (int i=0;i<sizeOfArray;i++){
            nums[i] = in.nextInt();
        }
        int[] ans = getConcatenation(nums);
        for (int i : ans) System.out.print(i+" ");
    }

    public static int[] getConcatenation(int[] nums){
        int[] ans = new int[nums.length*2];
        for (int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
