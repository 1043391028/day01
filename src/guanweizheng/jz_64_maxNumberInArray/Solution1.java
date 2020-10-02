package guanweizheng.jz_64_maxNumberInArray;

//         思路一：单调队列，即用一个队列来存储遍历到结点以前的序列，此队列是一个递减的序列，并且在不断更新
//            1 遍历数组的每一个元素，
//            2 如果容器为空，则直接将当前元素加入到容器中。
//            3 如果容器不为空，则让当前元素和容器的最后一个元素比较，如果大于，则将容器的最后一个元素删除，
//             然后继续讲当前元素和容器的最后一个元素比较，（其实相当于删除此时队列中小的元素，把大的还进去）
//            4 如果当前元素不大于容器的最后一个元素，则直接将当前元素加入到容器的末尾
//            5 如果容器头部的元素已经不属于当前窗口的边界，则应该将头部元素删除（很重要）


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Solution1 {

    public ArrayList maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> ret = new ArrayList<>();
        if (num.length == 0 || size < 1 || num.length < size) return ret;
        int n = num.length;
        Deque<Integer> dq = new LinkedList<>();
        int j = 0;
        for (int i = 0; i < n; ++i) {
            while (!dq.isEmpty() && dq.getLast() < num[i]) {
                dq.removeLast();
            }
            dq.addLast(num[i]);
            // 判断队列的头部的下标是否过期
            while(num[j] != dq.getFirst()) j++;
            if (j + size <= i) dq.removeFirst();
            // 判断是否形成了窗口
            if (i + 1 >= size) {
                ret.add(dq.getFirst());
            }
        }
        return ret;
    }

}
