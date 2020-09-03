package com.leetcode;

/**
 * @ClassName: FindduplicateNumbersForArray
 * @Description:数组中重复的数字
 *
 *
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 *
 * Input:
 * {2, 3, 1, 0, 2, 5}
 *
 * Output:
 * 2
 *
 * @Author Chenjun
 * @Date 2020/09/03 13:56
 * @Version V1.0
 */
public class FindduplicateNumbersForArray {


    public static boolean duplicate(int[] nums, int[] duplication) {
        if (nums == null || nums.length <= 0)
            return false;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                int t = nums[i];
                nums[i] = nums[t];
                nums[t] = t;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0,5,2};
        int[] duplication={0};
        duplicate(nums,duplication);
        System.out.println("======"+duplication[0]);
    }


}
