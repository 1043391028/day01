package guanweizheng.jz_29_FindMinKnumberOfArray;

//       题目： 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。

//     思路一：用数组排序库函数排序，然后输出 0 - k 个数字；

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input == null || k <= 0 || k > input.length) return list;
        Arrays.sort(input);
        for(int i = 0 ; i < k && i < input.length ; i++){
            list.add(input[i]);
        }
        return list;
    }

}
