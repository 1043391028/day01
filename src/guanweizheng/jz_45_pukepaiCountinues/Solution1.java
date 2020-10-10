package guanweizheng.jz_45_pukepaiCountinues;

//          题目：LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
//                他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！
//                “红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,他想了想,决定大\小 王可以看成任何数字,
//                 并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。
//                 LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何，
//                  如果牌能组成顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。

//          思路一：  利用TreeSet集合(排序且不重复)，
//                  遍历数组，记录大小王数量为count； 不为0（大小王）则加入到set集合；
//                   最后，判断set.size() + count 是否等于5（实际上是判断是否有重复），不等于5，直接返回false;
//                  等于5，（也不一定能成顺子，可能 最大的数 - 最小的数 > 5）则判断size.last()-set.fist() <= 4,才能返回true;
//          思路二:    也可以利用HashSet;(未排序,所以需要记录最大值和最小值,同样最后判定即可)

import java.util.HashSet;
import java.util.TreeSet;

public class Solution1 {
//    思路一:TreeSet
    public boolean isContinuous1(int [] numbers) {
        //先判断是否符合个数要求；
        if(numbers.length != 5) return false;
        TreeSet<Integer> set = new TreeSet<>();
        int count0 = 0;
//        循环遍历
        for(int i = 0; i< numbers.length ;i++){
            if(numbers[i] == 0) {
                count0++;
            } else set.add(numbers[i]);
        }
//        最后判定,是否重复,或者最大最小相差超过4;
        if(set.size()+count0 != 5) return false;
        return set.last() - set.first()<=4;
    }
//      思路二: HashSet
    public boolean isContinuous2(int [] numbers){
        if(numbers.length != 5) return false;
        HashSet<Integer> set = new HashSet<>();
        int count0 = 0 , max = -1, min = 15;

        for(int i = 0; i< numbers.length ;i++){
            if(numbers[i] == 0) continue;
            if(set.contains(numbers[i])) return false;
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);
            set.add(numbers[i]);
        }
        return max - min <= 4;
    }

}
