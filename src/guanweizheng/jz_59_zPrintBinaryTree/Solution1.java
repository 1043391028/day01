package guanweizheng.jz_59_zPrintBinaryTree;


//          题目:请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
//               第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。

//           思路1:使用两个栈stack1,stack2
//                1:从树的根节点开始,加到第一个栈stack1
//                2:然后从第一个栈出栈时,依次按照 由左->右顺序把出栈结点的子结点添加到stack2
//                3:从stack2把元素出栈,出栈时把出栈元素子节点按照从 右->左顺序添加到stack1
//                4:继续循环,直到两个栈都为空

import java.util.ArrayList;

public class Solution1 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {


          return null;
    }

}
