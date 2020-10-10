package guanweizheng.jz_46_lastRemainNumber;

//        题目: 有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
//              每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,
//              继续0...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”
//              典藏版(名额有限哦!!^_^)。请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
//
//              如果没有小朋友，请返回-1

//        思路:利用链表ArrayList;
//             先把数组元素,按顺序添加进链表;  然后,定义一个指针cur(报数指向链表);
//              遍历链表,直到链表剩一个元素(while()语句),内循环if(),让指针cur 每次遍历0 - m-1步,若cur == list.size(),
//             说明cur指针指向最后一个小朋友下一个, 需要重新指向头结点(cur = 0);

import java.util.ArrayList;

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n <= 0 || m <= 0) return -1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++ ){
            list.add(i);
        }
        int cur = -1;
        while(list.size() > 1) // 这里while(list.size() > 1),最后一次循环剩两个元素,出循环list就剩一个;
        {
            for(int j = 0;j < m;j++){
                cur++;
                if(cur == list.size()) cur = 0;
            }
            list.remove(cur);
            cur--;
        }
        return list.get(0);
    }
}
