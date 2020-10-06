package guanweizheng.jz_65_hasPath;

//      题目描述：请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一个格子开始，
//                每一步可以在矩阵中向左，向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，
//                则该路径不能再进入该格子。矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
//                因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。

public class Solution {

    public boolean hasPath(char[][] matrix,int rows,int cols,char[] str){
           for(int i = 0; i < matrix.length;i++) {
               for (int j = 0; j < matrix[0].length; j++) {
                   return dfs(matrix,str,i,j,0);
               }
           }
           return false;
    }
    public boolean dfs(char[][] table,char[] str,int i,int j, int k){
        if(i >= table.length || i < 0 || j >= table[0].length || j < 0 || table[i][j] != str[k]) return false;
        if(k == str.length - 1) return true;
        char temp = table[i][j];
        table[i][j] = '/';
        boolean result = dfs(table,str,i+1,j,k++) || dfs(table,str,i-1,j,k++) || dfs(table,str,i,j+!,k++)||
                dfs(table,str,j -1,j,k++);
        return result;
    }

}
