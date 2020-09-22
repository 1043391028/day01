package guanweizheng.jz_43_LeftRotateString;

//       题目描述：对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
//                例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。

//       解题思路：
//           思路1：最简单的，字符串拼接
//           思路2：可变长字符串添加

public class Solution {
//     思路1：
    public String LeftRotateString1(String str,int n) {
        if (str == null || n > str.length()) {
            return str;
        }
        return str.substring(n,str.length()) + str.substring(0,n);
    }
//      思路2：
        public String LeftRotateString2(String str,int n){
            StringBuilder st = new StringBuilder();
            for(int i = n; i < str.length();i++){
                st.append(i);
            }
            for(int i = 0;i < n;i++){
                st.append(i);
            }
            return st.toString();
        }
}
