package guanweizheng.jz_62_returnKThTreeNode;

//       题目描述:给定一棵二叉搜索树，请找出其中的第k小的结点。(二叉搜索树,已经按照中序大小顺序排好)
//               例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。

//         思路1:先中序遍历排好序,需要加入ArrayList中,然后直接返回第k小的节点值

import java.util.ArrayList;

public class Solution1 {
//    新建一个链表保存中序遍历结果
    ArrayList< TreeNode > list = new ArrayList<>();

    TreeNode KthNode(TreeNode pRoot, int k)
    {
        inOrder(pRoot);
        if(k >= 1 && k <= list.size()){
            return list.get(k-1);
        }
        return null;
    }
//         中序遍历树
    void inOrder(TreeNode root){
        if( root != null){
            inOrder(root.left);
            list.add(root);
            inOrder(root.right);
        }
    }
}
