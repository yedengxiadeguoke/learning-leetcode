
//给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。 
//
// candidates 中的数字可以无限制重复被选取。 
//
// 说明： 
//
// 
// 所有数字（包括 target）都是正整数。 
// 解集不能包含重复的组合。 
// 
//
// 示例 1： 
//
// 输入：candidates = [2,3,6,7], target = 7,
//所求解集为：
//[
//  [7],
//  [2,2,3]
//]
// 
//
// 示例 2： 
//
// 输入：candidates = [2,3,5], target = 8,
//所求解集为：
//[
//  [2,2,2,2],
//  [2,3,3],
//  [3,5]
//] 
//
// 
//
// 提示： 
//
// 
// 1 <= candidates.length <= 30 
// 1 <= candidates[i] <= 200 
// candidate 中的每个元素都是独一无二的。 
// 1 <= target <= 500 
// 
// Related Topics 数组 回溯算法 
// 👍 858 👎 0


package com.leetcode.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        Solution solution = new CombinationSum().new Solution();
        int[] candidates = {2,3,4,5,6};
        System.out.println(solution.combinationSum(candidates,6));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            List<Integer> combine = new ArrayList<Integer>();
            dfs(candidates, target, ans, combine, 0);
            return ans;
        }

        public void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int idx) {
            if (idx == candidates.length) {
                return;
            }
            if (target == 0) {
                ans.add(new ArrayList<Integer>(combine));
                return;
            }
            // 选择当前数
            if (target - candidates[idx] >= 0) {
                combine.add(candidates[idx]);
                dfs(candidates, target - candidates[idx], ans, combine, idx);
                combine.remove(combine.size() - 1);
            }
            // 直接跳过
            dfs(candidates, target, ans, combine, idx + 1);

        }



    }
//leetcode submit region end(Prohibit modification and deletion)

}
