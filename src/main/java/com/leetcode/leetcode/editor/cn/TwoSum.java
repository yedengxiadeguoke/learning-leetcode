
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 9403 👎 0


package com.leetcode.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        int[] t = {2,5,5,15};
        int[] r = solution.twoSum(t,10);
        System.out.println(r);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /*public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            for (int i = 0; i < n; ++i) {
                for (int x = i+1; x < n; ++x) {
                    int y = nums[i]+nums[x];
                    if(y==target){
                        return new int[]{i,x} ;
                    }
                }
            }
            return new int[]{0};
        }*/


        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; ++i) {
                if (hashtable.containsKey(target - nums[i])) {
                    return new int[]{hashtable.get(target - nums[i]), i};
                }
                hashtable.put(nums[i], i);
            }
            return new int[0];
        }



    }
//leetcode submit region end(Prohibit modification and deletion)


}
