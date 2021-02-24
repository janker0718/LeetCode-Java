//给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -231 <= x <= 231 - 1 
// 
// Related Topics 数学 
// 👍 2546 👎 0

package leetcode.editor.cn;
public class ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new ReverseInteger().new Solution();
        int reverse = solution.reverse(114);
        System.out.println(reverse);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        // n 代表回文数
        // x 代表当前数

        // 设x = 213 n = 0
        // n= n*10 +x %10; n = 3
        // x = x/ 10 x = 21

        //x = 21 n = 3
        // n = n*10 + x %10; n = 31
        // x = x/ 10 x = 2

        //x = 2 n = 31
        // n= n*10 +x %10; n = 312
        // x = x/ 10 x = 0
        int n = 0;
        while(x != 0){
            if ((n * 10) / 10 != n) {
                n = 0;
                break;
            }
            n = n * 10 + x % 10;
            x = x/10;
        }
        return n;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}