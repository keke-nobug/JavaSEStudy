package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.TreeMap;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode
 * @Author: qzk
 * @CreateTime: 2024/7/3 21:00
 * @Description: TODO
 * @Version: 1.0
 */
public class Lc1438_LongestContinuousSubarrayWithAbsoluteDiffLessThanorEqualtoLimit {
    public static void main(String[] args) {

        int[] nums = {10,1,2,4,7,2};
        int limit = 5;
        System.out.println(longestSubarray(nums, limit));
    }


    // 总体思想：我们可以枚举每一个位置作为右端点，找到其对应的最靠左的左端点，满足区间中最大值与最小值的差不超过 limit。
    // 进：就是 右窗口 右移           出：就是左窗口 右移
    public static int longestSubarray(int[] nums, int limit) {
        Deque<Integer> queMax = new ArrayDeque<>();
        Deque<Integer> queMin = new ArrayDeque<>();

        int l = 0, r = 0;
        int ans = 0;

        while (r < nums.length) {
            // 1. 入 同时 维护单调性 （右窗口右移）
            while (!queMax.isEmpty() && queMax.getLast() < nums[r]) {
                queMax.removeLast();
            }
            queMax.addLast(nums[r]);

            while (!queMin.isEmpty() && queMin.getLast() > nums[r]) {
                queMin.removeLast();
            }
            queMin.addLast(nums[r]);

            // 2. 出，直到符合条件 （左窗口右移）
            while (!queMax.isEmpty() && !queMin.isEmpty() && queMax.getFirst() - queMin.getFirst() > limit) {
                if (nums[l] == queMax.getFirst()) {
                    queMax.removeFirst();
                }
                if (nums[l] == queMin.getFirst()) {
                    queMin.removeFirst();
                }
                l++;
            }

            // 3. 更新答案
            ans = Math.max(ans, r - l + 1);

            // if 判断多余
            // if (queMax.getFirst() - queMin.getFirst() <= limit) {
            //     ans = Math.max(ans, r - l + 1);
            // }

            r++;

        }
        return ans;
    }

    public static int longestSubarray2(int[] nums, int limit) {
        int n = nums.length;
        int l = 0, r = 0;
        int ans = Integer.MIN_VALUE;
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        while (r < n) {
            // 进树 （有窗口右移）
            tree.put(nums[r], tree.getOrDefault(nums[r], 0) + 1);

            // 出树，不符合要求就出来 （窗口左移）
            while (tree.lastKey() - tree.firstKey() > limit) {
                tree.put(nums[l], tree.get(nums[l]) - 1);
                if (tree.get(nums[l]) == 0) tree.remove(nums[l]);
                l++;
            }

            // 更新结果
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
}
