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
// 👍 8953 👎 0

package leetcode.editor.cn.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * java:[1]两数之和
 */
public class P1TwoSum {

    public static void main(String[] args) {
        Solution solution = new P1TwoSum().new Solution();
        // TO TEST

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            // 1：暴力 - 枚举 O(n^2)
//            for (int i = 0; i < nums.length-1; i++) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[i] + nums[j] == target) {
//                        return new int[]{i, j};
//                    }
//                }
//            }
//            return null;

            // 2.hash解法：map
            // 因为返回的是下标值，所以不能排序打乱顺序
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[]{map.get(complement), i};
                }
                // 使用map<数值，下标>
                map.put(nums[i], i);
            }

            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}