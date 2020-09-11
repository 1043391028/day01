package guanweizheng.jz_17_judgeSubtree;

public class FalseSolution {
//        牛客网错误答案示例
    public boolean judgeSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return judgeSubTree(root1.left, root2) ||
                    judgeSubTree(root1.right, root2);
        }
        return judgeSubTree(root1.left, root2.left) &&
                judgeSubTree(root1.right, root2.right);
    }



}
