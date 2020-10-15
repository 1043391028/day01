package guanweizheng.jz_22_printTree;

//       题目：从上往下打印出二叉树的每个节点，同层节点从左至右打印。

//       思路: 利用队列和链表，一层一层遍历，每出队一个，加入链表，并把该出队结点左右子节点依次加入对列；
//             直到队列为空；

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while( !queue.isEmpty() ){   // 这里需要注意，判空条件不能是 queue ！= null;
            TreeNode node = queue.poll();
//             if(node == null) continue;
            list.add(node.val);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        return list;
    }

}
