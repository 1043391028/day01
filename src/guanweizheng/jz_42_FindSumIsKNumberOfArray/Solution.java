package guanweizheng.jz_42_FindSumIsKNumberOfArray;

import java.util.ArrayList;

//       题目描述：输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
//                如果有多对数字的和等于S，输出两个数的乘积最小的。

//       解题思路：双指针法，就是从数组的两端开始向中间压缩遍历，
//                每次相加两指针的和与sum对比，如果相同就返回，因为两数和相同的相乘，两端最大

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {

        ArrayList<Integer> result = new ArrayList<>();
        if(array == null || array.length <= 1) return result;

        int l = 0 , r = array.length - 1 ;
//        循环结束条件，两者相同时
        while(l < r){
            int m = array[l] + array[r];
            if(m == sum){
                result.add(array[l]);
                result.add(array[r]);
                break;
            }else if(m < sum){
                l++;
            }else {
                r--;
            }
        }
        return result;
    }
}
