package LeetCode;

import java.util.*;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode.HashTable
 * @Author: qzk
 * @CreateTime: 2024/6/24 21:15
 * @Description: TODO
 * @Version: 1.0
 */
public class Lc128_LongestConsecutiveSequence {
    public static void main(String[] args) {
         // int[] nums = new int[]{100,4,200,1,3,2};
        // int[] nums = new int[]{0,3,7,2,5,8,4,6,0,1};
        int[] nums = new int[]{1,2,0,1};
        int ans = longestConsecutive(nums);
        System.out.println(ans);

    }
    public static int longestConsecutive(int[] nums) {
        // HashSet 和 TreeSet 都可以。
        Set<Integer> set = new HashSet<>();

        // 用来存数字，不包含重复的
        for (int num : nums) {
            set.add(num);
        }
        int ans = 0;

        // 遍历set，找到每段num不连续的起点
        for (int num : set) {
            // 当num不存在num-1的时候就是需要判断后续连续的时候，如果有num-1那么需要跳过，防止重复计算
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                // 记录最大长度
                ans = Math.max(ans, currentStreak);
            }
        }
        return ans;

    }
}
