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
// 👍 9665 👎 0

package leetcode.editor.cn;

import java.util.Arrays;

//Java：两数之和
public class TwoSum{
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        // TO TEST
        int[] nums = new int[]{2, 6, 11, 15};
        int[] ints = solution.twoSum(nums, 8);
        System.out.println(Arrays.toString(ints));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (target - nums[i] == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}