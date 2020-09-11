package guanweizheng.jz_14_findKNodeList;

//       题目：输入一个链表，输出该链表中倒数第k个结点。
//       方法：双指针法；；双指针黑心思想为：快指针fast,慢指针slow,之间的间隔为k,
//        然后通过同时平行移动二者，直到快指针到达链表末尾，此时满指针指向的节点就是所要找的节点
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode fast = head,slow = head;
        if(k <= 0||head==null){
            return null;
        }
        for(int i=0;i<k;i++)
        {
            if(fast==null)
                return null;
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
