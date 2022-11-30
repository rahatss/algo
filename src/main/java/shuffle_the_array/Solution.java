package shuffle_the_array;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
        int[] nums = new int[sizeOfArray];

        for (int i = 0;i<nums.length;i++){
            nums[i] = in.nextInt();
        }

        int[] ans = shuffle(nums , 3);
        for (int i : ans) System.out.print(i+" ");
    }

    public static int[] shuffle(int[] nums , int n){
        int[] ans = new int[nums.length];
        int k = 0;
        for (int i=0;i<n;i++){
            ans[k++] = nums[i];
            ans[k++] = nums[i+n];
        }
        return ans;
    }
}

/* 2 4 1 5 3 6 */