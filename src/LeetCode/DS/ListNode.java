package LeetCode.DS;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode
 * @Author: qzk
 * @CreateTime: 2024/9/14 15:56
 * @Description: TODO
 * @Version: 1.0
 */

// * Definition for singly-linked list.
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * @BelongsProject: JavaSEStudy
     * @BelongsPackage: LeetCode
     * @Author: qzk
     * @CreateTime: 2024/9/24 15:35
     * @Description: TODO
     * @Version: 1.0
     */
    public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
    }
}
