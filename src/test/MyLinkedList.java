package test;

import LeetCode.DS.ListNode;

import java.util.ArrayDeque;
import java.util.LinkedList;

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

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.size());
        linkedList.poll();
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.size());
        System.out.println("=============================");
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

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
