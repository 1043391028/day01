package guanweizheng.jz_05_twostack_queen_pop_and_push;

public class Test {
    public static void main(String[] args) {
    Solution solution = new Solution();
    // 队列入栈操作
    solution.push(1);
    solution.push(2);
    solution.push(3);
    solution.push(4);
    solution.push(5);

    //队列出栈操作
    System.out.println(solution.pop());
    System.out.println(solution.pop());
    System.out.println(solution.pop());
    System.out.println(solution.pop());
    System.out.println(solution.pop());

}
}
