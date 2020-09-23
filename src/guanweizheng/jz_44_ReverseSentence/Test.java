package guanweizheng.jz_44_ReverseSentence;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        String str = new String("student. a  am  i  ");
        Solution solution = new Solution();
        String strnew = solution.ReverseSentense(str);

        System.out.println(strnew);
    }

}
