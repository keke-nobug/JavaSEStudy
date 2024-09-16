package LeetCode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode
 * @Author: qzk
 * @CreateTime: 2024/9/16 22:13
 * @Description: TODO
 * @Version: 1.0
 */
public class Lc23_MergekSortedLists {
    public static void main(String[] args) {

        // 小顶堆，自然顺序,写不写比较器都是从小到大，小顶堆
        PriorityQueue<Integer> pq1 = new PriorityQueue<>((o1, o2) -> o1 - o2);
        // PriorityQueue<Integer> pq1 = new PriorityQueue<>(new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer o1, Integer o2) {
        //         return o1 - o2;
        //     }
        // });
        pq1.add(3);
        pq1.add(1);
        pq1.add(5);
        pq1.add(6);
        for (Integer i :
                pq1) {
            System.out.println(i);
        }

        System.out.println("--------------------------------------");

        // 大顶堆， 比较器要 o2 - o1
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((o1, o2) -> o2 - o1);
        // PriorityQueue<Integer> pq2 = new PriorityQueue<>(new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer o1, Integer o2) {
        //         return o2 - o1;
        //     }
        // });
        pq2.add(3);
        pq2.add(1);
        pq2.add(5);
        pq2.add(6);
        for (Integer i :
                pq2) {
            System.out.println(i);
        }
        // [[1,4,5],[1,3,4],[2,6]]
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(5);

        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);

        ListNode node3 = new ListNode(2, new ListNode(6));

        ListNode[] lists = {node1, node2, node3};

        ListNode ans = mergeKLists(lists);
        System.out.println(ans.val);
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode dummyHead = new ListNode();
        ListNode cur = dummyHead;

        // 小顶堆，不写比较器默认自然排序，从小到大!
        Queue<ListNode> pq = new PriorityQueue<>(((o1, o2) -> o1.val - o2.val));

        // PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
        //     @Override
        //     public int compare(ListNode o1, ListNode o2) {
        //         return o1.val - o2.val;
        //     }
        // });

        for (ListNode head : lists) {
            if (head != null) pq.add(head);
        }

        while (!pq.isEmpty()) {
            ListNode minNode = pq.remove();
            if(minNode.next != null) pq.add(minNode.next);
            cur.next = minNode;
            cur = cur.next;
        }

        return dummyHead.next;
    }
}
