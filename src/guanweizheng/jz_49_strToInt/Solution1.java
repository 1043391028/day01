package guanweizheng.jz_49_strToInt;

//          题目: 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0

public class Solution1 {
    public int StrToInt(String str) {
        if(str == null || str.length() == 0) return 0;
            int sigh = 1 , // 符号标志位
                i = 0 ,
                baundry = Integer.MAX_VALUE/10 , // 边界值,判断是否越界
                value = 0 ,   // 保存每一轮遍历后结果值
                digital = 0 ,   // 保存遍历每一位数值
                overValue = 0;   // 判断是否越界的值;

        if(str.charAt(i) == '-') {sigh = -1; i++;}
        else if(str.charAt(i) == '+')  i++;

        for(; i < str.length() ; i++){
            digital = str.charAt(i) - '0';
            // 下面的越界值判断,很巧妙,判断了正负值越界情况,因为 Integer 负最小值比 正最大值 的绝对值大 1
            //     分别是 2147483647 和 -2147483648
            overValue = sigh * value - baundry + (((sigh+1)/2 + digital) > 8 ? 1 : 0);
            if(digital>9 || digital < 0 ) return 0;
            else if(overValue > 0) return 0;
            value = value * 10 + sigh *digital;
        }
        return value;
    }

}
