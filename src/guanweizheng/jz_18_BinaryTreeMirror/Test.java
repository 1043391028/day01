package guanweizheng.jz_18_BinaryTreeMirror;

import guanweizheng.jz_04_rebuildbinarytree.Treenode;

public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode r1 = new TreeNode(06);
        TreeNode r2 = new TreeNode(10);
        root.left = r1;
        root.right = r2;


        TreeNode r3 = new TreeNode(5);
        TreeNode r4 = new TreeNode(07);
        TreeNode r5 = new TreeNode(9);
        TreeNode r6 = new TreeNode(11);
        r1.left = r3;
        r1.right = r4;
        r2.left = r5;
        r2.right = r6;
        System.out.println("镜像前二叉树前序遍历结果为：");
        preOder(root);
        System.out.println("--------------------------");
        Solution solution = new Solution();
//        solution.Mirror1(root);//方法一;
        solution.Mirror1(root);//方法二;

        System.out.println("镜像后二叉树前序遍历结果为：");
        preOder(root);


    }
    public static void preOder(TreeNode root){
        if(root == null) return;
        System.out.println(root.val);
        if(root.left != null) preOder(root.left);
        if(root.right != null) preOder(root.right);
    }
}
