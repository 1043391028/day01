package guanweizheng.jz_46_lastRemainNumber;

//        方法二:  递归,或者数学方法;
//         思路:    s[0]表示一个人最后剩下的元素,  S[1]表述剩两个人时剩下的元素,则s[1] = (s[0]+m)/2;
//        依次类推:  .....s[n-1]表示n个人最后剩下的元素;

public class Soluton2 {
    public int lastNumber(int n,int m) {
        if(n <= 0 || m <= 0) return -1;
        int last = 0;
        for (int i = 2; i <= n; i++){
            last = (last + m) % n;
        }
        return last;
    }

}
