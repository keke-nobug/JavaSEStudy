package LeetCode;

import LeetCode.DS.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode
 * @Author: qzk
 * @CreateTime: 2024/9/28 21:53
 * @Description: TODO
 * @Version: 1.0
 */
public class LC1382_BalanceaBinarySearchTree {
    public static List<Integer> inorderSeq = new ArrayList<Integer>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4, null, null), null), null), null);
        balanceBST(root);

    }

    public static TreeNode balanceBST(TreeNode root) {
        inorderTraverse(root);
        return build(0, inorderSeq.size() - 1);
    }

    public static void inorderTraverse(TreeNode root) {
        if (root == null) return;
        inorderTraverse(root.left);
        inorderSeq.add(root.val);
        inorderTraverse(root.right);
    }

    public static TreeNode build(int left, int right) {
        if (left > right) return null;
        int mid = (left + right) >> 1;
        TreeNode root = new TreeNode(inorderSeq.get(mid));
        root.left = build(left, mid - 1);
        root.right = build(mid + 1, right);
        return root;
    }

}
