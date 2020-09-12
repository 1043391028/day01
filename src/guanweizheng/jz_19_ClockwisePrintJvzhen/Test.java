package guanweizheng.jz_19_ClockwisePrintJvzhen;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int array[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Solution solution = new Solution();
        System.out.println("二维数组正常输出数组顺序为：");
        for(int i=0;i<=array.length-1;i++)
           for(int j=0;j<=array[0].length-1;j++)
        {
            System.out.print("  "+array[i][j]);
        }
        System.out.println();

        System.out.println("二位数组顺时针输出顺序为：");
        solution.printMatrix(array);
        ArrayList<Integer> list =new ArrayList<>();
        list = solution.printMatrix(array);

        for(int i = 0;i < list.size();i++)
        {
            System.out.print("  "+list.get(i));
        }
    }

}
