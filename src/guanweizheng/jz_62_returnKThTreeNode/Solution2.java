package guanweizheng.jz_62_returnKThTreeNode;

//         思路二:（借助栈来实现）
//               1.顺着根节点往左子节点找,如果一直不为空,就加入栈,
//               2.如果左结点为空，则出栈，并判断此时 k-1 之后的值，如果为0，则说明已经出栈3个元素，则返回此时的结点即可；

import java.util.Stack;
import java.util.TreeSet;

public class Solution2 {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot == null || k <= 0){
            return null;
        }

        Stack<TreeNode> treeStack = new Stack<>();
        TreeNode cur = pRoot;
        if(cur != null){
            treeStack.push(cur);
            cur = cur.left;
        }else {
            cur = treeStack.pop();
            if( --k == 0)
            {
                return cur;
            }
            cur = cur.right;
        }
        return null;
    }

}
