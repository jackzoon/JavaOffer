package com.halen.step1;

/**
 * @author Halen
 * @version 1.0
 * @date 2019/6/10 21:53
 * 删除链表的节点
 */
public class P_018 {

    class ListNode {
        private int value;
        private ListNode next;
    }

    void deleteNode(ListNode head, ListNode node) {
        if (head == null || node == null) {
            return;
        }
        // 要删除的节点不是尾节点
        if (node.next != null) {
            ListNode nextNode = node.next;
            node.value = nextNode.value;
            node.next = nextNode.next;
            nextNode = null;
        } else if (head == node) {
            // 链表中只有一个节点，删除头节点
            head = null;
        } else {
            // 链表中有多个节点，删除尾节点
            ListNode cur = head;
            while (cur.next != node) {
                cur = cur.next;
            }
            cur.next = null;
        }
    }

}
