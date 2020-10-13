package guanweizheng.jz_53_firstApearingOnce;

//     思路二: 队列实现，
//     大致过程:  新建一队列（保存加入的字符）和数组（保存加入字符次数）
//    添加字符流:  在添加的过程中,利用数组(此数组大小为128,可以保存所有字符)来判断是否已经加入过,
//               并将该字符所代表的下标 的数组大小 +1,用来判断下次该字符加入时是否加入过(大小 >0 说明加入过),
//                没加入过就直接添加到队列；
//          判断： 从队列头部开始遍历，直至为空，利用数组中保存的字符次数来判断，具体如下：

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
//       新建字符串数组
        int[] charCount = new int[128];
        Queue<Character> queue = new LinkedList<>();
        public void Insert(char ch)
        {
            if(charCount[ch]++ == 0)  //判断是否已经加入过ch;加入过则charCoutn[ch] ！= 0 ， 没加入过就直接添加到队列；
                queue.offer(ch);
        }

        public char FirstAppearingOnce()
        {
            Character character = null;
            char ch;
//          这里解释一下：  为什么要判断，虽然现在队列里面都是不重复的字符，但是，实际上有可能队列里面的元素已经出现过多次，
//          但是，由于加入条件限制，并没有加入，所以队列里面的元素并不是不重复的，只有判断charCount == 1 才能保证字符只出现过一次；
            while((character = queue.peek()) != null){
                ch = character.charValue();
                if(charCount[ch] == 1 ){
                    return ch;
                }else queue.poll();
            }
            return '#';
        }

}
