package guanweizheng.jz_63_middleNumberInDataStream;


//       方法三： 使用树结构，二叉搜索树或者平衡二叉树，都是在插入的时候完成排序。
//                让树给我们排序，然后我们再取中位数，但是值得注意的是，在Set集合中，没有get方法，
//                所以无法直接获取某个角标所对应的元素，通过查资料，发现需要将Set转换成List即可，因此需要再处理一次。

import java.util.ArrayList;
import java.util.TreeSet;

public class Solution3 {
    public TreeSet<Integer> set = new TreeSet<>();
    public void Insert(Integer num) {
           set.add(num);
    }

    public Double GetMedian() {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(set);
        int index = list.size();
        if(index%2==1){
            return (double)list.get(index/2);
        }
        return ((double)(list.get(index/2-1))+(double)list.get(index/2))/2;
    }
}
