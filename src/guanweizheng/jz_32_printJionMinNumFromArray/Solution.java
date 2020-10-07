package guanweizheng.jz_32_printJionMinNumFromArray;

//      题目描述: 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
//               例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。

//         思路:  依次把数组中数,先拼接成字符串,然后转化成数字比较大小, 然后,.冒泡排序,把小的排到上面
//                最后.从前往后遍历数组,拼接数字,转化成字符串;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        if(numbers == null || numbers.length == 0) return "";
        for(int i = 0 ; i < numbers.length ; i++){
            for(int j = i+1 ; j < numbers.length ; j++){
                int s1 = Integer.valueOf(numbers[i] + "" + numbers[j]);
                int s2 = Integer.valueOf(numbers[j] + "" + numbers[i]);
                if(s1 > s2){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        String s = new String("");
        for(int i = 0; i < numbers.length; i++){
            s += numbers[i];
        }
        return s;
    }

}
