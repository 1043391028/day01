package guanweizheng.jz_37_GetNumbetOfKFromIncreaseArray;

import java.util.Arrays;

//         题目：寻找升序数组中重复数字K的次数
//         思路：二叉寻找到该数的位置下标，然后向前前后分别查找相同的，计数依次加

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int index = Arrays.binarySearch(array,k);
        int count = 1;
        for(int i = index+1;(i < array.length)&&(array[i] == k) ;i++){
            count++;
        }
        for(int i= index-1 ; i >= 0 && array[i] == k ;i--){
            count++;
        }
        return count;
    }
}
