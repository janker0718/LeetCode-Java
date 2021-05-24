//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 注意：给定 n 是一个正整数。 
//
// 示例 1： 
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶 
//
// 示例 2： 
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
// 
// Related Topics 动态规划 
// 👍 1666 👎 0

package leetcode.editor.cn;
public class ClimbingStairs {
    public static void main(String[] args) {
        Solution solution = new ClimbingStairs().new Solution();
        int i = solution.climbStairs(4);
        System.out.println(i);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs2(int n) {
        int[] total = new int[n];
        total[0] = 1;
        for (int i = 1; i < n; i++) {
            if (i > 1){
                total[i] = total[i-1] + total[i-2];
            }else {
                total[i] = total[i-1] + 1;
            }
        }
        return total[n-1];
    }

        public int climbStairs(int n) {
            int prepre = 1;
            int pre = 1;
            int current = 1;
            for (int i = 1; i < n; i++) {
                current = prepre + pre;
                prepre = pre;
                pre = current;
            }
            return current;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}