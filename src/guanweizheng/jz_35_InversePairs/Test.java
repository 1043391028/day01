package guanweizheng.jz_35_InversePairs;

public class Test {
    public static void main(String[] args) {
        int []array = {3,5,4,6,7,2,1,9} ;
        Solution solution = new Solution();
        int num = 0;
        num = solution.InversePairs(array);
        System.out.println("数组中逆序对数个数为："+num);
    }
}
