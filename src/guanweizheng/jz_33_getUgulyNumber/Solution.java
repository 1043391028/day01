package guanweizheng.jz_33_getUgulyNumber;

//           题目描述:  把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。
//                      习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
//               思路:   质因子只能为2,3,5,第一个丑数1,1*(2,3,5)得到丑数,然后2*(2,3,5)=(4,6,10)也为丑数,3*(2,3,5,)=(6,9,15)
//                        为下一轮丑数,但是,这三轮丑数并不是按大小拍好的,所以这样直接得到,需要判断每一轮最小的数,
//                        然后将每一轮最小的下标+1,进入下一轮判断;  具体如下:

public class Solution {
           public int getUglyNumber(int index){
               if(index <= 0) return 0;
               int[] result = new int[index];//创建数组,存储丑数;
               result[0] = 1;
               int p2 = 0,p3 = 0, p5 = 0;
//               遍历到下标,得到第index个丑数;
               for(int i= 1 ; i < index; i++){
                   result[i] = Math.min(2*result[p2], Math.min(3*result[p3], 5*result[p5]));
                   if(result[i] == 2*result[p2]) p2++;
                   if(result[i] == 3*result[p3]) p3++;
                   if(result[i] == 5*result[p5]) p5++;
               }
               return result[index-1];

           }

}
