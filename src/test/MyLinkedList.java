package test;

import LeetCode.DS.ListNode;

import java.util.LinkedList;
import java.util.Queue;

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

        Queue<Integer> linkedList = new LinkedList<>();

        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);
        ListNode head = node2;
        head.next = node3;

        ListNode dummyHead = head;
        System.out.println(dummyHead.next.val);
        System.out.println(node1.val);
        System.out.println(node2.val);

        System.out.println("=============================");


        ListNode head2 = new ListNode(1,new ListNode(2,new ListNode(3)));
        ListNode cur2 = head2;
        int n = 0;
        ListNode dummyHead2 = new ListNode(0,head2);
        ListNode cur3 = dummyHead2;
        while (dummyHead2 != null) {
            n++;
            dummyHead2 = dummyHead2.next;
        }
        System.out.println(cur3.val);
        System.out.println(cur3.next.val);
    }

}
