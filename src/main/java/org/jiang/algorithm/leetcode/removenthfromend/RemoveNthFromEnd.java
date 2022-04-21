package org.jiang.algorithm.leetcode.removenthfromend;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = getSize(head);
        int target = size - n - 1;
        ListNode tmpNode = new ListNode(head.val, head);
        ListNode curNode = tmpNode;
        for (int i = 0; i < target; i++) {
            curNode = curNode.next;
        }
        curNode.next = curNode.next.next;
        ListNode ans = tmpNode.next;
        return ans;
    }

    private int getSize(ListNode tmpNode) {
        int size = 0;
        while (tmpNode != null) {
            size++;
            tmpNode = tmpNode.next;
        }
        return size;
    }
}
