package guanweizheng.jz_66_movingCount;

//         思路2：广度优先遍历（BFS）(广度优先算法，一般会用到队列)
//      算法解析： 初始化： 将机器人初始点 (0, 0)(0,0) 加入队列 queue ；
//                迭代终止条件： queue 为空。代表已遍历完所有可达解。
//      迭代工作：
//              单元格出队： 将队首单元格的 索引、数位和 弹出，作为当前搜索单元格。
//              判断是否跳过： 若 ① 行列索引越界 或 ② 数位和超出目标值 k 或 ③ 当前元素已访问过 时，执行 continue 。
//              标记当前单元格 ：将单元格索引 (i, j) 存入 Set visited 中，代表此单元格 已被访问过 。
//              单元格入队： 将当前元素的 下方、右方 单元格的 索引、数位和 加入 queue 。
//              返回值： Set visited 的长度 len(visited) ，即可达解的数量。


import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

    public int movingCount(int sum , int rows, int cols)
    {
        if(sum <= 0) return 0;
        boolean[][] visit = new boolean[rows][cols];
        int count =0;
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int[] {0,0,0,0});

        while(queue.size() !=0)
        {
            int[] array = queue.poll();
            int i = array[0], j = array[1], si = array[2], sj = array[3];
            if(i >= rows || j >= cols || sum < si + sj || visit[i][j]) continue;
            visit[i][j] = true;
            count++;
            queue.offer(new int[] {i+1, j, (si+1)%10 == 0 ? si-8 : si+1, sj});
            queue.offer(new int[] {i, j+1, si, (sj+1)%10 == 0 ? sj -8 :sj+1});
        }

        return count;
    }

}
