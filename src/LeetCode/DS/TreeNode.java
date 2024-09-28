package LeetCode.DS;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode.DS
 * @Author: qzk
 * @CreateTime: 2024/9/28 22:03
 * @Description: TODO
 * @Version: 1.0
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
