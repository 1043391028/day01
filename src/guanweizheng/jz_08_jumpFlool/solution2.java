package guanweizheng.jz_08_jumpFlool;

//        思路二：非递归；
//                相当于自底向上依次求解；

public class solution2 {

    public int JumpFloor(int target) {
        int a = 1, b = 0;
        for(int i = 0 ; i < target;i++ ){
            a = a + b;
            b = a - b;
        }
        return a;
    }
}
