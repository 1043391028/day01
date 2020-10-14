package guanweizheng.jz_55_deleteDupicateNode;

//     题目：   在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
//              例如，链表1->2->3->3->4->4->5 处理后为 1->2->5

//    思路一：  建立新的头结点， 从头开始遍历链表 ，重复的直接删除；（需要注意空指针问题）
//            （新建头结点为所给头结点的 “父结点”， 主要是为了删除重复的头结点）

public class Solution {

    public ListNode deleteDuplication(ListNode pHead)
    {
//       首先判空头结点
        if(pHead == null || pHead.next == null ) return pHead;
//        新建头结点，并且使新结点 head  另其子结点为 头结点 pHead; 另外建两个新结点 pre 和 cur 用于遍历；
        ListNode head = new ListNode(Integer.MIN_VALUE);
        head.next = pHead;
        ListNode pre = head;
        ListNode cur = pre.next;
//      遍历过程
        while(cur != null){
//            下面if（）语句必须有，否则会出现空指针异常；
            if(cur.next != null && cur.val == cur.next.val) {
//             下面的 While()  语句是为了删除多个连续重复的结点 ，如果最多只有两个连续的则不需要；
//             如果当前指针和下一指针相等，让cur下移，直到不相等
                while(cur.next != null && cur.val == cur.next.val)
                    cur = cur.next;
//              出while循环，最后cur指向的当前结点依然是重复的需要再后移一位；
                cur = cur.next;
                pre.next = cur;
            }else {
//                不相等直接下移即可
                pre = cur;
                cur = cur.next;
            }
        }
        return head.next;
    }

}
