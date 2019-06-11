package com.halen.step1;

/**
 * @author Halen
 * @version 1.0
 * @date 2019/6/11 21:47
 * 删除链表中重复的节点
 */
public class P_019 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        // 创建一个虚拟头节点
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = pHead;
        ListNode cur = pHead;
        ListNode tmp = dummyNode;
        while (cur != null) {
            int size = 0;
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
                size++;
            }
            if (size == 0) {
                tmp.next = cur;
                tmp = tmp.next;
            }
            cur = cur.next;
        }
        tmp.next = null;
        return dummyNode.next;
    }
}
