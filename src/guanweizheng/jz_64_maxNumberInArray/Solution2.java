package guanweizheng.jz_64_maxNumberInArray;

//         思路二：大顶堆；
//         用一个大顶堆，保存当前滑动窗口中的数据。滑动窗口每次移动一格，就将前面一个数出堆，后面一个数入堆。

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution2 {
    PriorityQueue<Integer> maxQueue = new PriorityQueue<>((o1,o2)->o2-o1);   //大顶堆
    ArrayList<Integer> result = new ArrayList<>();               //  保存结果
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        if(num==null || num.length<=0 || size<=0 || size>num.length){
            return result;
        }
        int count = 0;
        for(;count < size; count++){
            maxQueue.add(num[count]);
        }
        while(count < num.length){
            result.add(maxQueue.peek());
            maxQueue.remove(num[count-size]);
            maxQueue.add(num[count]);
            count++;
        }
        result.add(maxQueue.peek());
        return result;
    }

}
