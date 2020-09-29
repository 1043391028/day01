package guanweizheng.jz_58_isSymmetrical;

//       思路二:  非递归解法,需要用队列或者两条链表,下面使用双端队列;

import java.util.Deque;
import java.util.LinkedList;

public class Solution2 {
    public boolean isSymmetric(TreeNode root){
        if(root ==null) return  true;
//        创建双端队列
        Deque<TreeNode> deque = new LinkedList<>();
//        先把根节点左右子树结点加入首尾
        deque.addFirst(root.left);
        deque.addLast(root.right);
        while(!deque.isEmpty()){
            TreeNode l = deque.pollFirst();
            TreeNode r = deque.pollLast();
            if(l ==null && r == null ){
//  这个循环是为了跳出某些不存在子节点的结点,但是有可能队列后面还有结点,即该结点没有子节点,但是兄弟结点有子节点,导致队列加入了空结点
                continue;
            }
            if(l ==null || r == null) return false;
            if (l.val != r.val) {
                return false;
            }

            deque.addFirst(l.right);
            deque.addFirst(l.left);
            deque.addLast(r.left);
            deque.addLast(r.right);
         }
        return true;//只要跳出循说明队列已经空了,则判断匹配完毕,也就是所有的结点都是对称的;

    }
}
