package com.jsl.common;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListNodeUtils {
    public static Optional<ListNode> fromArray(int[] array) {
        if(array.length == 0) {
            return Optional.empty();
        }
        ListNode previous = new ListNode(array[0]);
        ListNode root = previous;
        for(int i = 1; i < array.length; i++) {
            ListNode current = new ListNode(array[i]);
            previous.next = current;
            previous = current;
        }
        return Optional.of(root);
    }

    public static void printListNode(ListNode root) {
        while(root != null) {
            System.out.print(root.val);
            if(root.next != null) {
                System.out.print("->");
            } else {
                System.out.print("\n");
            }
            root = root.next;
        }
    }
}
