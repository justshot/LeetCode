package com.jsl.common;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeUtilsTest {

    @Test
    void fromEmptyArray() {
        int[] array = {};
        Optional<ListNode> root = ListNodeUtils.fromArray(array);
        root.ifPresent(x -> System.out.println(x.val));
    }

    @Test
    void from1NodeArray() {
        int[] array = {1};
        Optional<ListNode> root = ListNodeUtils.fromArray(array);
        root.ifPresent(x -> System.out.println(x.val));
    }

    @Test
    void from2NodeArray() {
        int[] array = {1, 2};
        Optional<ListNode> root = ListNodeUtils.fromArray(array);
        root.ifPresent(x -> ListNodeUtils.printListNode(x));
    }
}