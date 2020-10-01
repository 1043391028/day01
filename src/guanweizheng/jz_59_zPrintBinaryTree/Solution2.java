package guanweizheng.jz_59_zPrintBinaryTree;

//         思路2:主要的方法与BFS写法没什么区别,BFS里是每次只取一个，而我们这里先得到队列长度size，
//               这个size就是这一层的节点个数，然后通过for循环去poll出这size个节点，
//               这里和按行取值二叉树返回ArrayList<ArrayList<Integer>>这种题型的解法一样，之字形取值的核心思路就是通过两个方法：
//             list.add(T): 按照索引顺序从小到大依次添加
//             list.add(index, T): 将元素插入index位置，index索引后的元素依次后移,这就完成了每一行元素的倒序，或者使用Collection.reverse()方法倒序也可以

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution2 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList< ArrayList<Integer> > result = new ArrayList<>();
        LinkedList< TreeNode > seq = new LinkedList<>();
        boolean symbol = true;
        seq.offer(pRoot);
        while( !seq.isEmpty() ){
            int size = seq.size(); // 标记某一层结点个数,遍历以后修改标志位,为了下一次循环添加到链表头部;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < size ; i++){
                TreeNode node = seq.poll();
                if(node == null) {continue;}
                if(symbol){
                    list.add(node.val);
                }else {list.add(0,node.val);}
                seq.offer(node.left);
                seq.offer(node.right);
            }
            if(!list.isEmpty()){
                result.add(list);
            }
            symbol = !symbol;
        }
        return result;

    }

}
