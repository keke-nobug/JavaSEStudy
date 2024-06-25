package LeetCode.HashTable;

import java.util.HashSet;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode.HashTable
 * @Author: qzk
 * @CreateTime: 2024/6/25 23:09
 * @Description: TODO
 * @Version: 1.0
 */
public class Lc349_IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] ans = intersection(nums1, nums2);
        for (int x :
                ans) {
            System.out.println(x);
        }

    }


    // 给定两个数组 nums1 和 nums2 ，返回它们的交集
    // 输出结果中的每个元素一定是唯一的。我们可以不考虑输出结果的顺序
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        for (int x :
                nums1) {
            hashSet.add(x);
        }

        for (int x :
                nums2) {
            if (hashSet.contains(x)) {
                intersectionSet.add(x);
            }
        }

        int[] ans = new int[intersectionSet.size()];
        int index = 0;
        for (int x :
                intersectionSet) {
            ans[index++] = x;
        }
        return ans;
    }
}
