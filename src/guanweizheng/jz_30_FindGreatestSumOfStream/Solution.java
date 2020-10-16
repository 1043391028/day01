package guanweizheng.jz_30_FindGreatestSumOfStream;

//             题目：例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。给一个数组，
//                   返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)

//             思路： 动态规划： array[i] 表示 i 之前 数和的最大值

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {

        if(array == null || array.length == 0 ) return 0;
        int max = array[0];
        for(int i = 1 ; i< array.length; i++){
            array[i] += array[i-1] > 0 ? array[i-1] : 0;
            max = Math.max(array[i] , max);
        }
        return max;

    }

}
