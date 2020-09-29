package guanweizheng.jz_57_getNextTreeNode;


//         思路二：可以把中序下一结点归为几种类型：（画出二叉树理解）
//                1、有右子树，下一结点是右子树中的最左结点，例如 B，下一结点是 H
//                2、无右子树，且结点是该结点父结点的左子树，则下一结点是该结点的父结点，例如 H，下一结点是 E
//                3. 无右子树，且结点是该结点父结点的右子树，则我们一直沿着父结点追朔，直到找到某个结点是其父结点的左子树，
//                   如果存在这样的结点，那么这个结点的父结点就是我们要找的下一结点。例如 I，下一结点是 A；例如 G，
//                   并没有符合情况的结点，所以 G 没有下一结点
//               时间复杂度:O(n)
//               空间复杂度:O(1)

public class Solution2 {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        // 1.
        if (pNode.right != null) {
            TreeLinkNode pRight = pNode.right;
            while (pRight.left != null) {
                pRight = pRight.left;
            }
            return pRight;
        }
        // 2.
        if (pNode.next != null && pNode.next.left == pNode) {
            return pNode.next;
        }
        // 3.
        if (pNode.next != null) {
            TreeLinkNode pNext = pNode.next;
            while (pNext.next != null && pNext.next.right == pNext) {
                pNext = pNext.next;
            }
            return pNext.next;
        }
        return null;
    }

}