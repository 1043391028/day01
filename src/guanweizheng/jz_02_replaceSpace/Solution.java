package guanweizheng.jz_02_replaceSpace;

//             题目: 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，
//                   当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

//            思路一: 新建一个缓冲流字符串,然后遍历给出的数组,遇到空格变换成'%20'添加,否则直接添加;

public class Solution {
    public String replaceSpace(StringBuffer str){

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == ' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
