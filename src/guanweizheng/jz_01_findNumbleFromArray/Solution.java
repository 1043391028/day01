package guanweizheng.jz_01_findNumbleFromArray;
//            题目: 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下
//                  递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

//           思路一: 遍历整个数组查找  (时间复杂度高)
//           思路二: 由题意知,数组右上角数字肯定大于左边数字,也肯定小于下面数字,
//                   所以可以从右上角遍历,小于则向下移动一行,大于则向左移动一行,可以提高效率;
//                   (下面方法为第二种,从右上角遍历数组,也可以从左下角遍历)


public class Solution {
    public boolean findNumber(int target,int[][] array){

        if(array == null || array.length == 0)  return false;

        int col = array[0].length ,row = 0;

        while (col >= 0 && row < array.length){

            if(array[row][col] < target) row++;
            else if(array[row][col] > target) col--;
            else return true;
        }
        return false;
    }

}
