package test;
import LeetCode.DS.TreeNode;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode.DS
 * @Author: qzk
 * @CreateTime: 2024/9/25 18:54
 * @Description: TODO
 * @Version: 1.0
 */
public class TreeNodeDemo {
    public static void main(String[] args) {
        // 1,2,3,4,5,6,7
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        traverse(root);

    }

    public static void traverse(TreeNode root) {
        if (root == null) return;
        // 进之前
        System.out.println(root);
        System.out.println(root.left);

        // 前序
        traverse(root.left);


        // 进之后，出
        System.out.println(root.left);
        System.out.println(root);

        System.out.println(root);
        System.out.println(root.right);


        traverse(root.right);


        System.out.println(root.right);
        System.out.println(root);
    }
}
