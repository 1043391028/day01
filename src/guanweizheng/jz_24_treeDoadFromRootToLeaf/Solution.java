package guanweizheng.jz_24_treeDoadFromRootToLeaf;

//          题目：输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。
//               路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
//
//           思路：递归方式解决
//                  大致思路就是：遍历每一条从根到叶子节点的路径，但是期间要判断是否到叶子，未到叶子节点就存储节点的值，
//                                并且更新target值，
//                               最后，到达叶子节点，则判断，满足所经过结果之和正确，就返回

import java.util.ArrayList;

public class Solution {
    // 新建一个链表，记录遍历节点后的过程
    ArrayList<Integer> list = new ArrayList<Integer>();
    // 新建一个链表，存储不同记录路径的链表结构
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root == null) return result;
        list.add(root.val);
        target -= root.val;

        if (target == 0 && root.left == null && root.right == null)
//            result.add(list);   注意，这是错误写法，下面为正确写法
            result.add(new ArrayList<Integer>(list));

        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size() - 1);
        return result;
    }
}
