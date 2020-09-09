package guanweizheng.jz_10_jvxingCalculation;

public class Solution {
/*
    我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？

    比如n=3时，2*3的矩形块有3种覆盖方法：
*/
    public int RectCover(int target) {
        if(target<=2){
            return target;
        }
        int n=1;
        int m =2;
        int sum = 0;
        for (int i=3;i<=target;i++){
            sum =n + m;
            n = m ;
            m=sum;
        }
        return sum;

    }
    // 测试：
    public static void main(String[] args) {
        int target = 5;
        Solution solution = new Solution();
        int result= solution.RectCover(target);
        System.out.println("n = 5时，共有 "+result+"种摆法");
    }

}
