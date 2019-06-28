package week2;

/**
 * @ author: Suhb
 * @ date: 2019/6/27 16:44
 * @ description: DP：62. 不同路径
 */
public class LeetCode_62_035 {
    /*一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
    机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
    问总共有多少条不同的路径？
    例如，上图是一个7 x 3 的网格。有多少可能的路径？
    说明：m 和 n 的值均不超过 100。
    示例 1:
        输入: m = 3, n = 2
        输出: 3
        解释:
        从左上角开始，总共有 3 条路径可以到达右下角。
            1. 向右 -> 向右 -> 向下
            2. 向右 -> 向下 -> 向右
            3. 向下 -> 向右 -> 向右
    示例 2:
        输入: m = 7, n = 3
        输出: 28*/
    private int uniquePaths(int m, int n) {
        if (m < 1 && n < 1) {
            return 0;
        } else if ( m == 1 || n == 1) { // 提交leetcode报错，会有 1 X 1 的情况，所以得加上，之前过滤了
            return 1;
        }
        int[][] dp = new int[m][n];
        int length = m > n ? m : n;
        for (int i = 0; i < length; i++) {  // 因为只能向右或向下，不能回，所以左、上边界的每一个格子都是只有一种路径，先初始化
            if (i < n) {
                dp[0][i] = 1;
            }
            if (i < m) {
                dp[i][0] = 1;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j]; // 除开边界格子，到达其它每个格子的不同路径等于，相同行从左边一个格子的不同路径 + 相同列，从上面一个格子的不同路径之和
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        LeetCode_62_035 leetCode_62_035 = new LeetCode_62_035();
        int m = 7;
        int n = 3;
        int result = leetCode_62_035.uniquePaths(m, n);
        System.out.println(result);
    }
}
