package org.jiang.algorithm.leetcode.mergetwolists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> vals = new ArrayList<>();
        while (list1 != null) {
            vals.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            vals.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(vals);
        ListNode node = new ListNode();
        ListNode curNode = node;
        for (Integer val : vals) {
            curNode.next = new ListNode(val);
            curNode = curNode.next;
        }
        return node.next;
    }
}
