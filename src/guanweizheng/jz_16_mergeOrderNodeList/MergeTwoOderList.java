package guanweizheng.jz_16_mergeOrderNodeList;

//         题目： 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
//         思路： 新建一个链表，依次比较两个链表，把小的依次加入到新链表中；

public class MergeTwoOderList {
    public ListNode Merge(ListNode list1,ListNode list2) {

        if(list1 == null && list2 == null) return null;
        ListNode list3 = new ListNode(-1);
        ListNode cur = list3;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
                cur = cur.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
                cur = cur.next;
            }
        }
        if(list1 != null) cur.next = list1;
        if(list2 != null) cur.next = list2;
        return list3.next;
    }
}
