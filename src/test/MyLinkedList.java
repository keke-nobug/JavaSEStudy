package test;

import LeetCode.ListNode;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: test
 * @Author: qzk
 * @CreateTime: 2024/3/28 23:14
 * @Description: TODO
 * @Version: 1.0
 */
public class MyLinkedList {


    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);
        ListNode head = node2;
        head.next = node3;

        ListNode dummyHead = head;
        System.out.println(dummyHead.next.val);
        System.out.println(node1.val);
        System.out.println(node2.val);

    }

}
