package guanweizheng.jz_41_SumContinuousSequence;

import java.util.ArrayList;
import java.util.Collections;

//      题目：你能不能也很快的找出所有和为S的连续正数序列?
//      要求：输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序

//      思路1：滑动窗口
//      思路2：很经典，效率和内存100%
//      大致思路:  譬如说如果有两个连续的数之和等于target，那么相差为1， (target - 1) % 2 == 0，
//                且数组一定是从 (target - 1) / 2开始的，数组的元素就是2个；如果是3个连续的数组，
//                那么三个数之间相差为1、2，(target - 1 - 2) % 3 == 0，且数组一定是从 (target - 1 - 2) / 3开始的，
//                数组元素是3个，依次类推，但是注意target必须是大于0的数，且res需要倒序。

public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer> > result = new ArrayList<>();
        int i = 1;
        while(sum >0){
            sum -= i++;
            //解释一下：假如i=1,下面if语句的判断条件满足，说明有（i+1）个连续数的和一定等于sum,sum = n + (n+1);

            if(sum > 0 && sum%i == 0){
                ArrayList<Integer> newArray = new ArrayList<>();
                for(int k = sum/i ; k < sum/i + i; k++){
                    newArray.add(k);
                }
                result.add(newArray);
            }
//            if循环结束，sum不为0的话继续 sum-i;因为有可能还有其他连续个数整数满足；
        }
//        此时result中存储的链表顺序是从个数最少的开始的，也就是最大的数开始的，需要反转才符合题目；
        Collections.reverse(result);
        return result;
    }

//         滑动窗口解法：(采用左闭右闭的方法)
    public ArrayList<ArrayList<Integer> > FindSequence(int sum){
        ArrayList<ArrayList<Integer> >  result = new ArrayList<>();
        int l = 1 , r = 2;
        int m = l + r;
        while(l <= sum/2 ){
            if(m > sum){
                m -= l;
                ++l;
            }else if(m < sum){
                ++r;
                m +=r;
            }else{
                ArrayList<Integer> seq = new ArrayList<>();
                for(int i = l;i <= r;i++){
                    seq.add(i);
                }
                result.add(seq);
                m -=l;
                ++l;
            }
        }
        return result;

    }
}
