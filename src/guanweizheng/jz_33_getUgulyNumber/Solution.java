package guanweizheng.jz_33_getUgulyNumber;

//           题目描述:  把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。
//                      习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
//               思路:   质因子只能为2,3,5,那么,所有的丑数*(2,3,5)得到的数也为丑数,所以可以维护三个数组p2[],p3[],p5[]
//                       p2[] = {2*1,2*2,2*3,2*4,2*5,2*6,2*8.....},p3[] = {3*1,3*2,3*3,3*4,3*5,3*6,3*8...}
//                       p5[] = {5*1,5*2,5*3,5*4,5*5,5*6,5*7.....}
//                       但是,这三个数组的结果顺序需要重新排列,因为小的需要先进数组

public class Solution {
           public int getUglyNumber(int index){
               if(index <= 0) return 0;
               int[] result = new int[index];//创建数组,存储丑数;
               result[0] = 1;
               int p2 = 0,p3 = 0, p5 = 0;
//               遍历到下标,得到第index个丑数;
               for(int i= 1 ; i < index; i++){
                   result[i] = Math.min(2*result[p2], Math.min(3*result[p3], 5*result[p5]));//比较三个数组大小
                   if(result[i] == 2*result[p2]) p2++;  // 相当于p2[] 数组在不停的更新,p2++,result[p2]下一个最小的丑数
                   if(result[i] == 3*result[p3]) p3++;  // 相当于p3[] 数组在不停的更新
                   if(result[i] == 5*result[p5]) p5++;  // 相当于p5[] 数组在不停的更新
               }
               return result[index-1];

           }

}
