package guanweizheng.jz_24_treeDoadFromRootToLeaf;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode r1 = new TreeNode(05);
        TreeNode r2 = new TreeNode(12);
        root.left = r1;
        root.right = r2;


        TreeNode r3 = new TreeNode(4);
        TreeNode r4 = new TreeNode(07);
//        TreeNode r5 = new TreeNode(9);
//        TreeNode r6 = new TreeNode(11);
        r1.left = r3;
        r1.right = r4;
//        r2.left = r5;
//        r2.right = r6;
         printResult(root);
    }
//         输出正确链表记录
    public static void printResult(TreeNode root) {
        ArrayList<ArrayList<Integer>> result;
        ArrayList<Integer> list;
        Solution solution = new Solution();
        result = solution.FindPath(root,22);

        int sum = 0;
        for(int i=0; i < result.size();i++) {
            list= result.get(i);
            System.out.print("第"+i+"条链表数字分别为：");
            for(int j= 0;j < list.size();j++ ){
                sum = list.get(j);
                System.out.print(" "+sum);
            }
            System.out.println();
        }
    }
}
