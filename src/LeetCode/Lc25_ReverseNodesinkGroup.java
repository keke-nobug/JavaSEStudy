package LeetCode;

import LeetCode.DS.ListNode;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode
 * @Author: qzk
 * @CreateTime: 2024/9/17 23:04
 * @Description: TODO
 * @Version: 1.0
 */
public class Lc25_ReverseNodesinkGroup {
    public static void main(String[] args) {
        // [1,2,3,4,5] k=2
        ListNode head = new ListNode(1, new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode node = reverseKGroup(head, 2);
        System.out.println(node.val);
        System.out.println(node.next.val);
        System.out.println(node.next.next.val);

    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode node = dummyHead;
        int n = 0;
        while(node.next != null) {
            node = node.next;
            n++;
        }
        // for (ListNode cur = head; cur != null; cur = cur.next)
        //     ++n; // 统计节点个数

        ListNode p0 = dummyHead; // 反转链表的前一个节点
        ListNode pre = null;
        ListNode cur = dummyHead.next; // 反转链表的当前节点
        while (n - k >= 0) {
            n -= k;

            for (int i = 0; i < k; i++) {
                ListNode temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
            }
            ListNode temp = p0.next;
            p0.next.next = cur;
            p0.next = pre;
            p0 = temp;

        }
        return dummyHead.next;
    }
}
