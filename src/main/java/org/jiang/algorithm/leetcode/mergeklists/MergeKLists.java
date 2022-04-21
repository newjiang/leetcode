package org.jiang.algorithm.leetcode.mergeklists;

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

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> vals = new ArrayList<>();
        for (ListNode list : lists) {
            ListNode tmpNode = list;
            while (tmpNode != null) {
                vals.add(tmpNode.val);
                tmpNode = tmpNode.next;
            }
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
