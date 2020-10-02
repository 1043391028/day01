package guanweizheng.jz_64_maxNumberInArray;

import guanweizheng.jz_44_ReverseSentence.Solution;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] num  = {2,3,4,2,6,2,5,1};
        int[] num1  = {2,3,4,2,6,2,6,6,5,1};
        Solution1 solution1 = new Solution1();
        ArrayList<Integer> list = new ArrayList<>();
//        list = solution1.maxInWindows(num,3);     // 正确序列：4  4  6  6  6  5
        list = solution1.maxInWindows(num1,3);   //  正确序列：4,4,6,6,6,6,6,6

        for(int i = 0;i < list.size();++i) {
            int nums;
            nums = list.get(i);
            System.out.print("  "+nums);
        }
    }
}
