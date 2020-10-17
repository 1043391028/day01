package guanweizheng.jz_20_includ_minFunctionStack;

public class Test {
    public static void main(String[] args) {
        Solution sl =new Solution();
        sl.push(4);
        sl.push(2);
        sl.push(3);
        sl.push(1);
//        System.out.println("栈里面最小元素为："+sl.min);
        int min = sl.min(),top = sl.top();
        System.out.println("栈顶元素为："+top+"\n栈里面最小元素为："+min);
        sl.pop();
        min = sl.min();top = sl.top();
        System.out.println("栈顶元素为："+top+"\n栈里面最小元素为："+min);
        sl.pop();
        min = sl.min();top = sl.top();
        System.out.println("栈顶元素为："+top+"\n栈里面最小元素为："+min);
        sl.pop();
        min = sl.min();top = sl.top();
        System.out.println("栈顶元素为："+top+"\n栈里面最小元素为："+min);



    }




}
