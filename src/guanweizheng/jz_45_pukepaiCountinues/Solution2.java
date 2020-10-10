package guanweizheng.jz_45_pukepaiCountinues;

//        方法2: 先排序,然后判断;
//               Arrays.sort()先把数组排序;  然后遍历数组,统计count0(大小王数量),
//               并且在此过程判断Array[i] 和Array[i+1]是否相等,相等,直接返回false;
//                最后,判断最大最小元素差,Array[4] - Array[count0] <= 4;(大小王排在最后,除去)

import java.util.Arrays;

public class Solution2 {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length != 5) return false;

        Arrays.sort(numbers);
        int count = 0;

        for(int i = 0; i < 4;i++ ){
            if(numbers[i] == 0) count++;
            else if(numbers[i] == numbers[i+1]) return false;
        }

        return numbers[4] - numbers[count] <= 4;
    }
}
