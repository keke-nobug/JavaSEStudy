package test;

import LeetCode.DS.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: test
 * @Author: qzk
 * @CreateTime: 2024/9/12 15:57
 * @Description: TODO
 * @Version: 1.0
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        // int[] arr = list.toArray();
        ListNode listNode = new ListNode();

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
    }
}
