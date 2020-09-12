package guanweizheng.jz_04_rebuildbinarytree;

public class Test {
    public static void main(String[]args){
        int pre[]={1,2,4,7,3,5,6,8};
        int in[]={4,7,2,1,5,3,8,6};
        Treenode treenode =Solution.buildTree(pre,in);
        String st = treenode.toString();
        for(int i=0;i<pre.length;i++)
        System.out.println(st.charAt(i));
    }
}

