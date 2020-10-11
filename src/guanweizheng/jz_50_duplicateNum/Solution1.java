package guanweizheng.jz_50_duplicateNum;

//      题目: 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。
//            也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，
//            那么对应的输出是第一个重复的数字2。

//     思路一: 利用TreeSet 或者 HashSet , 遍历数组,并判断是否已经存在,存在,就直接保存,并返回True;

import java.util.TreeSet;

public class Solution1 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers.length == 0 || numbers == null) return false;

        TreeSet <Integer> set = new TreeSet<>();

        for(int i = 0 ; i < numbers.length ; i++){
            if(set.contains(numbers[i])) {
                duplication[0] = numbers[i]; // 存在就是重复,而且第一个先遍历;
                return true;
            } else set.add(numbers[i]); // 添加进Set;
        }
        return false;
    }
}
