package com.jsl.easy.merge_two_sorted_lists;

import com.jsl.common.ListNode;

import java.util.List;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode small = l1.val <= l2.val ? l1 : l2;
        ListNode large = l1.val > l2.val ? l1 : l2;

        ListNode result = small;
        while(small.next != null && large !=null) {
            if(small.next.val < large.val) {
                small = small.next;
            } else {
                ListNode temp = small.next;
                small.next = large;
                small = large;
                large = temp;
            }
        }
        small.next = large;
        return result;
    }
}
