package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode
 * @Author: qzk
 * @CreateTime: 2024/6/26 10:12
 * @Description: TODO
 * @Version: 1.0
 */
public class Lc167_TwoSumII_InputArrayIsSorted {
    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] ans = twoSum(numbers,target);
        for (int an : ans) {
            System.out.println(an);
        }

    }
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                if (map.get(target - numbers[i]) != i) {
                    return new int[]{i,map.get(target - numbers[i])};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

