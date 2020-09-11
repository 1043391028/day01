package guanweizheng.jz_17_judgeSubtree;

public class Test {

    public static void main(String[] args) {
        //构建大树
        TreeNode root =new TreeNode(8);//大树根节点
        TreeNode r1=new TreeNode(8);
        TreeNode r2=new TreeNode(2);
        root.right=r2;
        root.left=r1;
        TreeNode r3=new TreeNode(9);
        TreeNode r4=new TreeNode(7);
        r1.right=r4;
        r1.left=r3;
//       构建小树
        TreeNode target=new TreeNode(8);//小树根节点
        target.left=new TreeNode(9);
        target.right=new TreeNode(2);
//       判断
        System.out.println(new FalseSolution().judgeSubTree(root,target));//false
        System.out.println(new TrueSolution().HasSubtree(root,target));//true
    }
}
