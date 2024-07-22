package LeetCode;

import java.util.ArrayList;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode
 * @Author: qzk
 * @CreateTime: 2024/7/4 20:14
 * @Description: TODO
 * @Version: 1.0
 */
public class Lc56_MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        System.out.println(merge(intervals)[0][1]);
    }
    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            if (intervals[i][1] >= intervals[i + 1][0]) {
                list.add(intervals[i][0]);
                list.add(intervals[i+1][1]);
            }

            list.add(intervals[i][0]);
            list.add(intervals[i][1]);
        }

        int[][] ans = new int[list.size()/2][2];
        for (int i = 0; i < list.size() / 2; i++) {
            intervals[i][0] = list.get(i);
            intervals[i][1] = list.get(i+1);
        }
        return ans;
    }
}
