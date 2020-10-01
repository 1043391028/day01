package guanweizheng.jz_59_zPrintBinaryTree;


//          题目:请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
//               第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。

//           思路1:使用两个栈stack1,stack2
//                1:从树的根节点开始,加到第一个栈stack1
//                2:然后从第一个栈出栈时,依次按照 由左->右顺序把出栈结点的子结点添加到stack2
//                3:从stack2把元素出栈,出栈时把出栈元素子节点按照从 右->左顺序添加到stack1
//                4:继续循环,直到两个栈都为空

import java.util.ArrayList;
import java.util.Stack;

public class Solution1 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList< ArrayList<Integer> > result = new ArrayList<>();
            if(pRoot == null) return result;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(pRoot);
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            ArrayList< Integer > list = new ArrayList<>();
//            遍历第一个栈
           if(stack1.size() != 0){
               int size = stack1.size();
               for(int i = 0 ; i< size ; i++){
                   TreeNode node = stack1.pop();
                   list.add(node.val);
//            遍历每一个结点时,按照从 左子结点->右子结点 依次添加结点到栈2;
//            下次循环遍历stack2出栈自然就是按照 右子结点 -> 左子结点出栈遍历
                   if(node.left != null) stack2.push(node.left);
                   if(node.right != null) stack2.push(node.right);
               }
               result.add(list);
               continue;
           }
//           遍历第二个栈
           if(stack2.size() != 0){
               int size = stack2.size();
               for(int i = 0; i< size ; i++){
                   TreeNode node  = stack2.pop();
                   list.add(node.val);
//                遍历每一个结点时,按照从 右子结点->左子结点 依次添加结点到栈1;
//                同理,下次循环遍历stack1出栈时按照 左子结点 -> 右子结点 出栈遍历
                   if(node.right != null) stack1.push(node.right);
                   if(node.left != null) stack1.push(node.left);
               }
               result.add(list);
               continue;
           }
        }
        return result;
    }

}
