package guanweizheng.jz_02_replaceSpace;

//         思路二:  直接用字符串库函数replace()替换;

public class Solution1 {
    public String replaceSpace(StringBuffer str) {
        return str.toString().replace(" ", "%20");
    }
}
