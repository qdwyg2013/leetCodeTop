//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。 
//
// 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-4,-1,0,3,10]
//输出：[0,1,9,16,100]
//解释：平方后，数组变为 [16,1,0,9,100]
//排序后，数组变为 [0,1,9,16,100] 
//
// 示例 2： 
//
// 
//输入：nums = [-7,-3,2,3,11]
//输出：[4,9,9,49,121]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums 已按 非递减顺序 排序 
// 
//
// 
//
// 进阶： 
//
// 
// 请你设计时间复杂度为 O(n) 的算法解决本问题 
// 
// Related Topics 数组 双指针 排序 👍 578 👎 0


package leetcode.editor.cn.array;

/**
 * java:[977]有序数组的平方
 *
 * @author wyg
 * @date 2022-07-18 10:48:23
 */
public class P977_SquaresOfASortedArray {

    public static void main(String[] args) {
        Solution solution = new P977_SquaresOfASortedArray().new Solution();
        // TO TEST
        System.out.println(solution.sortedSquares(new int[]{-4, -1, 0, 3, 10}));

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int[] sortedSquares(int[] nums) {

            // 方法一：暴力法——每个数平方之后，排个序
            // 时间复杂度：O(n + nlogn)
//            for (int i = 0; i < nums.length; i++) {
//                nums[i] *= nums[i];
//            }
//            Arrays.sort(nums);
//            return nums;

            // 方法二：双指针法
            // 数组其实是有序的， 只不过负数平方之后可能成为最大数了。
            // 那么数组平方的最大值就在数组的两端，不是最左边就是最右边，不可能是中间。
            int[] result = new int[nums.length];
            int start = 0;
            int end = nums.length - 1;
            for (int i = result.length - 1; i >= 0; i--) {
                int startSqrt = nums[start] * nums[start];
                int endSqrt = nums[end] * nums[end];
                if (startSqrt <= endSqrt) {
                    result[i] = endSqrt;
                    end--;
                } else {
                    result[i] = startSqrt;
                    start++;
                }
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}
