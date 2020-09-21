package guanweizheng.jz_38_TreeDeepth;

//         题目：输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，
//               最长路径的长度为树的深度。
//         思路1：递归解法；
//         思路2：非递归解法；
//               分层遍历，每层依次加入队列，用size记录每一层节点的数目，遍历完一层以后树深度count++记录；

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int TreeDeepth1(TreeNode root){
           if(root == null) return 0;
           int left = TreeDeepth1(root.left);
           int right = TreeDeepth1(root.right);
           return Math.max(left,right)+1;
//        递归求树深度的另一种写法
//        if(root==null){
//            return 0;
//        }
//        if(root.left==null && root.right==null){
//            return 1;
//        }
//        return 1+Math.max(TreeDepth(root.left),TreeDepth(root.right));
    }

    public int TreeDeepth2(TreeNode root) {
        if(root == null) return 0;
      Queue<TreeNode> queue =  new LinkedList<>();
      queue.offer(root);
      int count = 0;
      while(queue.size()!=0){
          int size = queue.size();//记录队列长度，用于结束该层遍历；

          //依次遍历每一层，弹出，并把下一层的节点加入队列；
          while( size!= 0){
              TreeNode node = queue.poll();
              if(node.left != null) queue.offer(node.left);
              if(node.right != null) queue.offer(node.right);
              size--;
          }
          //循环跳出的时候，上一层的节点全部弹出队列，队列中剩下的为下一层刚加入的节点；
          count++;//跳出该层，层数+1；
      }
      return  count;
    }

}
