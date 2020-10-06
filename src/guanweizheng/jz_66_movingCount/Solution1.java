package guanweizheng.jz_66_movingCount;

//        题目描述：地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
//                 但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），
//                 因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？

//          思路1：DFS 深度优先遍历方格
//               递归参数： 当前元素在矩阵中的行列索引 i 和 j ，两者的数位和 si, sj 。
//               终止条件： 当 ① 行列索引越界 或 ② 数位和超出目标值 k 或 ③ 当前元素已访问过 时，返回 00 ，代表不计入可达解。
//        递推工作：
//                标记当前单元格 ：将索引 (i, j) 存入 Set visited 中，代表此单元格已被访问过。
//                搜索下一单元格： 计算当前元素的 下、右 两个方向元素的数位和，并开启下层递归 。
//                回溯返回值： 返回 1 + 右方搜索的可达解总数 + 下方搜索的可达解总数，代表从本单元格递归搜索的可达解总数。

public class Solution1 {
    int m , n ,k ;  // 用来记录行 rows, 列 cos ,以及和sum ;
    boolean [][] visit ;

    public int moviongCount(int sum,int rows,int cos){
        m = rows ;
        n = cos ;
        k = sum ;
        visit = new boolean[m][n] ; // 新建一个二维数组，保存表格 i， j 位置是否被访问过；
        if(sum <= 0) return 0;
        int count = dfs(0,0,0,0);
        return count;
    }
    public int dfs(int i, int j ,int si ,int sj) // i,j 分别表示遍历到结点，si,sj 表示i 所在结点位数和，j 表示j所在结点位数和；
    {
        if( i >= m || j >= n || k < si + sj || visit[i][j] == true) return 0 ;
        visit[i][j] = true ;

        return dfs(i+1, j, (si+1)%10 == 0? si -8 : si+1, sj) +dfs(i, j, si, (sj+1)%10 == 0? sj - 8 : sj+1);
    }

}
