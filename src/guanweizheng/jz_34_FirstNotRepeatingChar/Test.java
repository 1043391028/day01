package guanweizheng.jz_34_FirstNotRepeatingChar;

public class Test {
    public static void main(String[] args) {
        String str = "woainiwoai";
//        int[] count = new int[256];
        //用一个类似hash的东西来存储字符出现的次数，很方便
//        for(int i=0; i < str.length();i++)
//          count[str.charAt(i)]++;
//        for(int i=0; i < str.length();i++)
//        System.out.println(count[str.charAt(i)]++);
//        System.out.println(count['i']);
        Solution solution = new Solution();
        solution.FirstNotRepeatingChar(str);
        int num = 0;
        num = solution.FirstNotRepeatingChar(str);
        System.out.println("字符串中第一个不重复的字母下标是："+num);
    }
}
