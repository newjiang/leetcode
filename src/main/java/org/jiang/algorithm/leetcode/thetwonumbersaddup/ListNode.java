package org.jiang.algorithm.leetcode.thetwonumbersaddup;

public class ListNode {
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

class Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l1_2 = new ListNode(4);
        ListNode l1_2_3 = new ListNode(3);
        l1_2.next = l1_2_3;
        l1.next = l1_2;

        ListNode l2 = new ListNode(5);
        ListNode l2_2 = new ListNode(6);
        ListNode l2_2_3 = new ListNode(4);
        l2_2.next = l2_2_3;
        l2.next = l2_2;
        new Solution().addTwoNumbers(l1, l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = null;
        ListNode curNode = null;
        boolean flag = false;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int curVal = flag ? val1 + val2 + 1 : val1 + val2;
            flag = curVal > 9;
            if (listNode == null) {
                listNode = new ListNode(curVal % 10);
                curNode = listNode;
            } else {
                ListNode nextNode = new ListNode(curVal % 10);
                curNode.next = nextNode;
                curNode = nextNode;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (flag) {
            curNode.next = new ListNode(1);
        }
        return curNode;
    }
}