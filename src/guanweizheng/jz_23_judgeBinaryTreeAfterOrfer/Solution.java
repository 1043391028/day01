package guanweizheng.jz_23_judgeBinaryTreeAfterOrfer;

//     题目描述：
//            输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
//            如果是则返回true,否则返回false。
//            假设输入的数组的任意两个数字都互不相同。
//         思路：利用递归思路，给出数组，起始元素下标，当前判定树的根节点，（根据后序遍历特点，可知第一个根节点的序号，就是
//                素组最后一个元素的下标），以下递归找根节点方式：即依次从最开始元素遍历，直到找到第一个大于根节点的元素，
//                下标就是下一个左子树的根节点，右子树根节点为上一个根节点下标-1；
//
public class Solution {

    // 递归辅助函数求结果
    public boolean helpJudege(int []sequence,int start,int root){
        if(start >= root) return true;
        int i;
        for(i = start; i < root;i ++){
            if (sequence[i] > sequence[root])
                break;
        }
        for(int j = i;j < root;j++){
            if(sequence[j] < sequence[root])  //找到第一个大于根节点的值以后，判断此节点下标以后的节点大小和根节点对比，
                                                  // 如果<根节点，则返回 false;
                return false;

        }                                         // 找到左后依然满足，则递归检查左子树和右子树
        return helpJudege(sequence,start,i-1) && helpJudege(sequence,i,root-1);

    }

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0)return false;
        return helpJudege(sequence,0,sequence.length-1);
    }
}
