package guanweizheng.jz_58_isSymmetrical;

//         思路：  双链表依次添加左右结点，遍历对比，最后如果能遍历结束，并且两个链表都为空，则是对称二叉树；
//                此方法思路清晰；但写法比较复杂；

import java.util.LinkedList;

public class Solution3 {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null)
            return true;
        LinkedList<TreeNode> leftList = new LinkedList<>();
        LinkedList<TreeNode> rightList = new LinkedList<>();
        leftList.add(pRoot.left);
        rightList.add(pRoot.right);
        while (!leftList.isEmpty() && !rightList.isEmpty()) {
            TreeNode leftNode = leftList.poll();
            TreeNode rightNode = rightList.poll();
            if (leftNode == null && rightNode == null)
                continue;
            if (leftNode == null || rightNode == null)
                return false;
            if (leftNode.val != rightNode.val)
                return false;
            // 左子树从左往右添加节点
            leftList.add(leftNode.left);
            leftList.add(leftNode.right);
            // 右子树从右往左添加节点
            rightList.add(rightNode.right);
            rightList.add(rightNode.left);
        }
        return leftList.isEmpty() && rightList.isEmpty();
    }

}
