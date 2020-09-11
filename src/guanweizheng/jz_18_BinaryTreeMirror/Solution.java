package guanweizheng.jz_18_BinaryTreeMirror;


import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    Queue<TreeNode> nodes = new LinkedList<>();
//     简单递归方法实现
        public void Mirror1(TreeNode root) {
            if(root==null||(root.left==null&&root.right==null)){
                return;
            }
            TreeNode temp=null;
            temp = root.left;
            root.left=root.right;
            root.right = temp;
            Mirror1(root.left);
            Mirror1(root.right);
        }
//        非递归方式：队列Queue实现
//  java中虽然有Queue接口，单java并没有给出具体的队列实现类，而Java中让LinkedList类实现了Queue接口，所以使用队列的时候，
//         一般采用LinkedList。因为LinkedList是双向链表，可以很方便的实现队列的所有功能。
//
//  Queue使用时要尽量避免Collection的add()和remove()方法，而是要使用offer()来加入元素，使用poll()来获取并移出元素。
//       它们的优点是通过返回值可以判断成功与否，add()和remove()方法在失败的时候会抛出异常。 如果要使用前端而不移出该元素，
//        使用element()或者peek()方法。
//
//  java中定义队列 一般这样定义： Queue<E> queue = new LinkedList<E>();
//
//        　　当采用LinkedList来实现时，api的使用和对用关系如下：
//
//        　　队列方法       等效方法
//        　　offer(e)         offer(e)/offerLast(e)    //进队列，将元素加入队列末尾
//        　　poll()            poll()/pollFirst()           //获取队列头的元素并移除
//        　　peek()          peek()/peekFirst()     //获取队列头的元素
//
//　　　　　　　  isEmpty()                 //判断是否为空　


      public void Mirror2(TreeNode root){
        if(root==null||(root.left==null&&root.right==null)){
            return;
        }
        Queue<TreeNode> nodes = new LinkedList<>();
        TreeNode curr, temp;
        nodes.offer(root);
        while (!nodes.isEmpty()){
            curr = nodes.poll();
            temp = curr.left;
            curr.left= curr.right;
            curr.right = temp;
            if(curr.left!=null) {nodes.offer(curr.left);}
            if(curr.right!=null) {nodes.offer(curr.right);}
        }
    }
}
