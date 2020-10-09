package guanweizheng.jz_03_printListFromTailToHead;

//            思路二:递归

import java.util.ArrayList;

public class Solution2 {
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailtoHead(ListNode head){

        if (head != null){
          printListFromTailtoHead(head.next);
          list.add(head.val);
        }

        return list;
    }
}
