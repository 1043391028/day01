package guanweizheng.jz_54_circleStartNode;

//        题目： 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。

//        思路： 利用数学式；（快慢指针）
//            画图分析，假设有环，分别让快慢指针遍历链表， 第一次相遇以后，再设置一个新的慢指针，让再让两个个指针一起走，
//                     一指针从相遇点走，另一指针从开头结点，都一步一步走，再次相遇的点就是环的入口结点；

public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null || pHead.next ==null) return null;
        ListNode fast = pHead;
        ListNode slow = pHead;
//         开始遍历链表，当快结点为空就 出循环，并还回 null ,不存在环；
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                ListNode slow2 = pHead;
                while(slow2 != fast){
                    slow2 = slow2.next;
                    fast =fast.next;
                }
                return slow2;
            }
        }
        return null;
    }

}
