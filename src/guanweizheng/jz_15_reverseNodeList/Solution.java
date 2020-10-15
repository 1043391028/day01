package guanweizheng.jz_15_reverseNodeList;

//          题目： 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。

//          思路：新建结点：pre（保存上一结点）cur（保存当前结点） temp（保存下一个结点）

public class Solution {

    public ListNode ReverseList(ListNode head) {
        ListNode temp = null, cur = head, pre = null;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
