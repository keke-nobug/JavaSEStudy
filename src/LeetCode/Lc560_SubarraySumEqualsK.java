package LeetCode;

import java.util.HashMap;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode
 * @Author: qzk
 * @CreateTime: 2024/7/1 20:58
 * @Description: TODO
 * @Version: 1.0
 */
public class Lc560_SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println(subarraySum(nums, k));
    }
    // 前缀和
    // public static int subarraySum(int[] nums, int k) {
    //     int n = nums.length;
    //     int[] preSum = new int[n + 1];
    //     for (int i = 1; i < n + 1; i++) {
    //         preSum[i] = preSum[i - 1] + nums[i - 1];
    //     }
    //
    //     int ans = 0;
    //     for (int i = 0; i < n + 1; i++) {
    //         for (int j = i + 1; j < n + 1; j++) {
    //             if (preSum[j] - preSum[i] == k) {
    //                 ans++;
    //             }
    //         }
    //     }
    //     return ans;
    // }

    // 前缀和 + 哈希表
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int preSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            preSum += nums[i];
            if (map.containsKey(preSum - k)) {
                ans += map.get(preSum - k);
            }
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return ans;
    }

}
