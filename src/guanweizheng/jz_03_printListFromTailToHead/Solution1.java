package guanweizheng.jz_03_printListFromTailToHead;
import java.util.ArrayList;

//          题目: 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
//        思路一: 新建一个ArrayList,直接遍历链表结点,每次都将遍历结点加氯到0位置,
//                也就是新结点添加到了首位,后面的则往后移,这样所有的遍历完,就得到原来链表逆序的链表
//                (这里也可以新建一个栈,用栈来保存,然后出栈加入list,占用额外内存)


public class Solution1 {
    public ArrayList<Integer> printListFromTailtoHead(ListNode head){
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(0,head.val);
            head = head.next;
        }
        return list;
    }

}
