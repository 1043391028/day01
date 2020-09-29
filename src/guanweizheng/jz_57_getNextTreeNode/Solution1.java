package guanweizheng.jz_57_getNextTreeNode;

import java.util.ArrayList;

//        题目描述：给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
//                  注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
//         思路一：先中序遍历，把节点按照顺序加入链表；
//                然后从头遍历，对比节点，相同则链表下一个结点就是要找结点；
//          时间复杂度:O(n)
//          空间复杂度:O(n)

public class Solution1 {
    ArrayList<TreeLinkNode> TreeList = new ArrayList<>();
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        TreeLinkNode pre = pNode;
        while(pre != null){
            pre = pre.next;
        }
        inOrder(pre);
        for(int i = 0; i < TreeList.size();i++){
            if(pNode == TreeList.get(i)){
                return i == TreeList.size()-1?null:TreeList.get(i+1);
            }

        }
        return null;
    }
    //中序遍历树
    public void inOrder(TreeLinkNode pNode){
        if(pNode!= null){
            inOrder(pNode.left);
            TreeList.add(pNode);
            inOrder(pNode.right);
        }
    }

}

