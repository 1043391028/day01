package guanweizheng.jz_60_print_Binary_Tree;

//          题目: 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
//      思路分析:  相当于二叉树遍历输出, 但是多了层次, 因为要按照每一层输出;
//                 可以使用队列,然后在遍历时多加一层层次输出条件;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null) return result;
        LinkedList<TreeNode> seq = new LinkedList<TreeNode>();
        seq.offer(pRoot);
//      ArrayList< Integer > list = new ArrayList<>();
        while (!seq.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = seq.size();//设定每一层遍历的结束条件

            for (int i = 0; i < size; i++) {
                TreeNode node = seq.poll();
                list.add(node.val);
                if (node.left != null) seq.offer(node.left);
                if (node.right != null) seq.offer(node.right);
            }

            result.add(list);
        }
        return result;
    }
}
