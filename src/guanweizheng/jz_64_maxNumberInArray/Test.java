package guanweizheng.jz_64_maxNumberInArray;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {

        int[] num  = {2,3,4,2,6,2,5,1};
        Vector<Integer> ret;
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        System.out.println("首位字符数字是："+dq.getFirst());
        System.out.println("首位字符数字是："+dq.getLast());
    }

}
