package guanweizheng.jz_06_minNumberInRotateArrary;

public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int low =0 ;
        int hight =array.length-1;
        while(low<hight){
            if(array[low] < array[hight]){
                return array[low];
            }
            int mid = (low + hight)>>1;
            if ( array[mid] >array[low] ){
                low = mid +1;
            }else if(array[mid] < array[hight]){
                hight = mid;
            }else low++;
        }
        return array[low];
    }

    public static void main(String[] args) {
        int numbs1[] = {1,0,1,1,1,1};
        int numbs2[] = {1,2,3,0,1,1,1,1};
        int numbs3[] = {2,2,2,2,2,1,1,2,2,2,2,2};
        Solution solution = new Solution();
        int minnum = solution.minNumberInRotateArray (numbs3);
        System.out.println("旋转数组numbs中最小的值是:"+minnum);
    }
}
