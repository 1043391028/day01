package guanweizheng.jz_53_isNumberic;

//           题目：    请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
//                     例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
//                     但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。

//           思路：     设置 数字，小数点， ‘e’或‘E’ , 标志位分别为 boolean 型：Numflag , Dotflag , Eflag ；
//                     遍历数组， 判断不能出现下面几种情况：
//                 1. ‘e’ ‘E’ 前面不能没有数字，不能有 ‘e’ ‘E’;
//                 2.  '.' 前面不能有 'e' 'E', 不能有 ‘.’ ;
//                 3. '+' '-' 只能出现在首位 或者 前面是 ‘e’ ‘E’ ；符合就顺利往下遍历；
//                 从前往后遍历，每遍历一个字符 ，符合情况，就置相关标志位为true; 不符合以上几种情况直接返回false;
//                 如果能顺利遍历完，就说明可以变成数字；

public class Solution {

       public Boolean IsNumric(char[] str){
           if(str.length == 0 || str == null ) return false;
           int length = str.length;
           boolean Num = false , dot = false , eflag = false ;
           for(int i = 0; i< length ; i++){
               if(str[i] >= '0' && str[i] <= '9') Num = true;
               else if((str[i] == 'e' || str[i] == 'E') && !eflag && Num ) {
                   eflag = true;
                   Num = false;  // 防止‘e’ ‘E’ 为最后一位，所以遍历完就置数字标志位为false;
               }
               else if(str[i] == '.' && !eflag && !dot ) dot = true;
               else if((str[i] == '+' || str[i] == '-') && (i == 0 || str[i-1] == 'e' || str[i-1] == 'E')){

               }
               else return false;
           }
           return Num;
       }

}
