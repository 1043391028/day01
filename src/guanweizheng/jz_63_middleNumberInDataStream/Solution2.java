package guanweizheng.jz_63_middleNumberInDataStream;

//         方法二：在插入数组时，就进行排序，形成有序的数组，排完序后就可以直接找到中位数
//                 插入的时候排序，所以很容易想到利用堆排序，每次加入一个元素就调整堆。因为第4种使用到了堆，
//                 所以这里选择（在网上扒了）另一种插入排序的方法，二分法。
import java.util.LinkedList;

public class Solution2 {
    LinkedList<Integer> list = new LinkedList<>();
    public void Insert(Integer num) {
//        如果链表为空，直接插入；
        if(list.size()==0){
            list.add(num);
            return;
        }
        int start = 0,end  = list.size()-1,mid = 0;
//        二分法查找插入结点下标
        while(start <= end){
            mid = (start + end)/2;
            if(num < list.get(mid)){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        list.add(mid,num);
        return;
    }

    public Double GetMedian() {
        int index = list.size();
        if(index%2 != 0)
            return (double)list.get(index/2);
        return (double)(list.get(index/2)+list.get(index/2+1));
    }
}
