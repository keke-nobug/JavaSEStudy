package test;

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
        System.out.println(node1.val);
        System.out.println(node2.val);

    }

}
class ListNode {
    int val;
    ListNode next;
// 构造函数
    public ListNode() {};
    public ListNode(int val) {
        this.val = val;
    }
}
