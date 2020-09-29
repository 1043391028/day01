package guanweizheng.jz_58_isSymmetrical;


//          题目描述:请实现一个函数，用来判断一棵二叉树是不是对称的。
//                   注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
//          思路: 递归解法


public class Solution1 {
    public boolean isSymmetrical(TreeNode pRoot){
          return pRoot == null ? true : isDuichen(pRoot.left,pRoot.right);
    }

    public boolean isDuichen(TreeNode left,TreeNode right){
        if(left == null && right == null)  return true;
        if(left == null || right ==null)  return false;
        if(left.val != right.val) return false;
        return isDuichen(left.left,right.right) && isDuichen(left.right,right.left);
    }

}
