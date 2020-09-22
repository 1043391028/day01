package guanweizheng.jz_44_ReverseSentence;

//         题目： 字符串单词反转，例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
//                正确的句子应该是“I am a student.”。请对一一的翻转

//         思想：双指针，倒序遍历每一个单词，期间去掉空格，并用StringBuild变量缓存，最后转换为字符串返回；

public class Solution {
    public String ReverseSentense(String str){

        str = str.trim();  // 删除首位空字符
        int j = str.length() - 1;
        int i = j ;
        StringBuilder sb = new StringBuilder();

        while (i >=0 ){
            while(i >= 0 && str.charAt(i) != ' ')
                i--;

            sb.append(str.substring(i+1,j+1) + " ");
            while (i >= 0 && str.charAt(i) == ' ')
                i--;
            j = i;
        }

        return sb.toString().trim();

    }



}
