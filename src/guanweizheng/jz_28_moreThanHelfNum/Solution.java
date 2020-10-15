package guanweizheng.jz_28_moreThanHelfNum;

//    题目： 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
//           由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。



public class Solution {

    public int MoreThanHalfNum_Solution(int [] array) {
            if (array == null) return 0;
            int count = 1;
            int temp = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] == temp) count++;
                else {
                    count--;
                    if (count == 0) {
                        temp = array[i];
                        count = 1;
                    }
                }
            }
            count = 0;
//     最后一定要判断，上面的过程只是保证如果存在超过一半的数就是 temp 但是也可能不存在超过一半的数；
        for (int i = 0; i < array.length; i++) {
                if (temp == array[i])
                    count++;
            }

            return count > array.length / 2 ? temp : 0;
        }
    }

