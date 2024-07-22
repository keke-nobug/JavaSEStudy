package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

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
    public static int longestSubarray(int[] nums, int limit) {
        Deque<Integer> queMax = new ArrayDeque<>();
        Deque<Integer> queMin = new ArrayDeque<>();

        int l = 0, r = 0;
        int ans = 0;

        while (r < nums.length) {
            // 1. 入 同时 维护单调性
            while (!queMax.isEmpty() && queMax.getLast() < nums[r]) {
                queMax.removeLast();
            }
            queMax.addLast(nums[r]);

            while (!queMin.isEmpty() && queMin.getLast() > nums[r]) {
                queMin.removeLast();
            }
            queMin.addLast(nums[r]);

            // 2. 出
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
}
