package guanweizheng.jz_37_GetNumbetOfKFromIncreaseArray;

public class Test {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,3,4,5,6};
        Solution solution = new Solution();
        int num = solution.GetNumberOfK(array,3);
        System.out.println("升序数组中重复数字k出现的次数为："+num);
    }
}
