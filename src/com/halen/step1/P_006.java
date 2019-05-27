package com.halen.step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class ListNode{
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

/**
 * 从尾到头打印链表
 */
public class P_006 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }

        return res;
    }

    public ArrayList<Integer> printListFromTailToHead_2(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        traverse(listNode,res);
        return res;
    }

    private void traverse(ListNode node, List<Integer> list) {
        if(node != null)
            traverse(node.next,list);
        if(node != null)
            list.add(node.val);
    }
}
