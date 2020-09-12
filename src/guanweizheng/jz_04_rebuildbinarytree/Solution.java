package guanweizheng.jz_04_rebuildbinarytree;

import java.util.Arrays;

public class Solution {
    public static Treenode buildTree(int[] pre, int[] in){
        if(pre.length==0||in.length==0){
            return null;
        }

        Treenode root = new Treenode(pre[0]);
        for(int i=0;i<pre.length;i++){
            if (in[i] == pre[0]){
            root.left = buildTree(Arrays.copyOfRange(pre,1,i+1) , Arrays.copyOfRange(in,0,i));
            root.right = buildTree(Arrays.copyOfRange(pre,i+1,pre.length) , Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;
    }
}

