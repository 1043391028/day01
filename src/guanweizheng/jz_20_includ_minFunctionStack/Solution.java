package guanweizheng.jz_20_includ_minFunctionStack;

import java.util.Stack;

public class Solution {
    Stack<Integer> toltal = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void push(int node) {
        toltal.push(node);
        if(min.empty()){
            min.push(node);
        }else{
            if(node<=min.peek()){
                min.push(node);
            }else{min.push(min.peek());}
        }

    }

    public void pop() {
        min.pop();
        toltal.pop();
    }

    public int top() {
        return toltal.peek();
    }

    public int min() {

        return min.peek();
    }
}
