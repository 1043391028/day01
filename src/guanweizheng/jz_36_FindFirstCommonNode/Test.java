package guanweizheng.jz_36_FindFirstCommonNode;

public class Test {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        list1.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode list2 = new ListNode(7);
        ListNode node6 = new ListNode(8);
        list2.next = node6;
        node6.next = node4;

        Solution solution = new Solution();
        ListNode target = solution.FindFirstCommonNode(list1,list2);
//        int num = target.val;
        System.out.println("第一个公共节点的值为："+target.val);
    }
}
