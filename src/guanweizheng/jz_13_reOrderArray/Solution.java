package guanweizheng.jz_13_reOrderArray;

public class Solution {

//    思路：参考快速排序
//
//       i++往前走碰到偶数停下来，j = i+1
//       若 a[j]为偶数，j++前进，直到碰到奇数
//       a[j]对应的奇数插到a[i]位置，j经过的j-i个偶数依次后移
//       如果j==len-1时还没碰到奇数，证明i和j之间都为偶数了，完成整个移动

    public void reOrderArray(int array[]) {
            int len = array.length;
            if (len <= 1) return;

            int i = 0;
            // 循环开始：直到遍历到最后一个元素
            while (i < len) {
                int j = i + 1;
                // 此时i在j前面一位，先判断array[i]是为偶数,偶数则停下
                // 然后判断array[j],为偶数时，j++,为奇数时则停下
//                停下后记录j和i的差值，交换元素位置
                if (array[i] % 2 == 0) {
                    while (array[j] % 2 == 0) {
                        if (j == len - 1)
                            return;
                        j++;
                    }
                    int count = j - i;
                    int temp = array[i];
                    array[i] = array[j];
                    while (count > 1) {
                        array[i + count] = array[i + count - 1];
                        count--;
                    }
                    array[i + 1] = temp;
                }
                i++;
            }



    }

    public static void main(String[] args) {
        int array[] = {1,4,6,8,7,42,2,17,62};
        Solution solution = new Solution();

        System.out.println("排序前数组为:");
        for(int i = 0;i < array.length;i++) {
            System.out.print("  " + array[i]);
        }
        System.out.println();

        solution.reOrderArray(array);
        System.out.println("排序后数组为:");
        for(int i = 0;i < array.length;i++) {
            System.out.print("  "+array[i]);
        }

    }

}
