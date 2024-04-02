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
    int size;
    ListNode node = new ListNode(0);

    public static void main(String[] args) {

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
