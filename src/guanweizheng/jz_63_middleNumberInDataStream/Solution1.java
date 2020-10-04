package guanweizheng.jz_63_middleNumberInDataStream;

//        题目：如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
//             如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，
//             使用GetMedian()方法获取当前读取数据的中位数。

import javax.swing.plaf.basic.BasicSliderUI;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

//        方法一：使用无序数组存储，然后需要对数组进行排序，然后就可以顺利找到中位数。
//                使用库函数对无序数组排序，然后根据下标找到中位数；
public class Solution1 {

    ArrayList<Integer> list = new ArrayList<>();
    public void Insert(Integer num) {
        list.add(num);
    }

    public Double GetMedian() {
        Double result;
        int index = list.size()/2;
        Collections.sort(list);
//        个数为奇数
        if(index%2 != 0){
            return (double)list.get(index);
        }
//        个数为偶数
        return (double)(list.get(index)+list.get(index+1));
    }

}
