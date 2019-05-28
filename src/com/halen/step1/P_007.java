package com.halen.step1;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }

}

/**
 * 重建二叉树
 */
public class P_007 {

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0 || in.length == 0)
            return null;
        return constructBinarryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    private TreeNode constructBinarryTree(int[] pre, int ps, int pe, int[] in, int is, int ie) {
        if(ps > pe )
            return null;
        // 取前序遍历的第一个数字就是根节点
        int value = pre[ps];
        // 在中序遍历中寻找根节点
        int index = is;
        while (index <= ie && value != in[index])
            index++;
        // 如果在整个中序遍历的数组中没有找到，说明输入参数是不合法
        if (index > ie)
            throw new RuntimeException("Invalid Input!");
        // 创建当前根节点，并为根节点赋值
        TreeNode node = new TreeNode(value);
        // 递归调用构建当前节点的左子树
        node.left = constructBinarryTree(pre, ps + 1, ps + index - is, in, is, index - 1);
        // 递归调用构建当前节点的右子树
        node.right = constructBinarryTree(pre, ps + index - is + 1, pe, in, index + 1, ie);

        return node;
    }
}
