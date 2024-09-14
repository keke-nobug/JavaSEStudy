package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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

        System.out.println(merge(intervals)[2][1]);
    }
    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0]; // 左端点从小到大排序，左减右 小到大正序
            }
        });

        // Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]); // 简写这样

        // 存放合并后的结果
        List<int[]> ans = new ArrayList<>();

        for (int[] p : intervals) {
            int m = ans.size(); // 初始是0
            if (m > 0 && ans.get(m - 1)[1] >= p[0]) { // 比较ans右端点和p的左端点，如果左>=右
                ans.get(m - 1)[1] =  Math.max(ans.get(m - 1)[1], p[1]); // 更新右端点最大值
            }else { // 否则直接加入结果集
                ans.add(p);
            }
        }
        // 转成二维数组
        return ans.toArray(new int[ans.size()][]);

    }
}
