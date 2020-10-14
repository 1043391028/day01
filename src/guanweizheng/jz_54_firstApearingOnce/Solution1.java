package guanweizheng.jz_54_firstApearingOnce;

//        题目: 请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，
//              第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。

//             如果当前字符流没有存在出现一次的字符，返回#字符。

//      思路一:  字符流, 新建一字符串缓冲流,保存新加入的字符;
//          寻找第一个只出现一次的字母:  新建一个大小为 128 的数组(用来保存字符流里面可能出现的字符),最多128位;
//           第一次遍历: 每遍历到一个字符, 就将对应的数组编号为 '该字符' +1;
//           第二次遍历: 找到数组中第一个大小为 1 的就是第一个只出现一次的字符;

public class Solution1 {

     StringBuilder sb = new StringBuilder();

    public void Insert(char ch)
    {
        sb.append(ch);

    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        if(sb == null || sb.length() == 0) return '#';
        int[] array = new int[128];
        for(int i = 0; i < sb.length(); i++)
        {
            array[sb.charAt(i)]++;
        }
        for(int i = 0;i < sb.length();i++){
            if(array[sb.charAt(i)] == 1)
                return sb.charAt(i);
        }
        return '#';

    }

}
