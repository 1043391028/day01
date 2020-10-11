package guanweizheng.jz_50_duplicateNum;

//        思路二: 先用数组排序库函数把数组排序 , 然后 遍历排序后数组,遍历过程比较前后元素是否相等,相等,则把元素加入到dupicate[0];
//                  并且返回True; 而且第一个遍历的就是第一个重复的元素;

import java.util.Arrays;

public class Solutions {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null || numbers.length == 0) return false;
        Arrays.sort(numbers);
        for(int i = 0 ; i < numbers.length -1 ; i++){
            if(numbers[i] == numbers[i+1] ){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
}
