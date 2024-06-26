package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode
 * @Author: qzk
 * @CreateTime: 2024/6/26 11:01
 * @Description: TODO
 * @Version: 1.0
 */
public class Lc15_ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        threeSum(nums);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) break;
            // 遍历k 当与上一个值相同时需要跳过，避免有重复的三元组
            if (k > 0 && nums[k] == nums[k - 1]) continue;

            int l = k + 1;
            int r = nums.length - 1;

            while (l < r) {
                List<Integer> list = new ArrayList<>();

                int sum = nums[l] + nums[r] + nums[k];
                if (sum > 0) {
                    // 要先--r 因为此时的r已经使用过了，所以要先跳过在判断
                    while (l < r && nums[r] == nums[--r]) ;
                } else if (sum < 0) {
                    // 同理 先++l
                    while (l < r && nums[l] == nums[++l]) ;
                } else {
                    list.add(nums[k]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    ans.add(list);

                    // 要先--r 或 ++l 因为此时的r、l已经使用过了，所以要先跳过在判断
                    while (l < r && nums[l] == nums[++l]) ;
                    while (l < r && nums[r] == nums[--r]) ;
                }
            }
        }
        return ans;
    }
}
