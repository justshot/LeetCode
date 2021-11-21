package com.jsl.easy.merge_two_sorted_lists;

import com.jsl.common.ListNode;
import com.jsl.common.ListNodeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mergeTwoLists() {
        int[] array1 = {1,2,3,7,8};
        int[] array2 = {4,5,6};

        commonTest(array1, array2);
    }

    @Test
    void mergeTwoLists2() {
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};

        commonTest(array1, array2);
    }

    @Test
    void mergeTwoLists3() {
        int[] array1 = {2};
        int[] array2 = {1};

        commonTest(array1, array2);
    }

    @Test
    void mergeTwoLists4() {
        int[] array1 = {};
        int[] array2 = {};

        commonTest(array1, array2);
    }

    @Test
    void mergeTwoLists5() {
        int[] array1 = {10};
        int[] array2 = {};

        commonTest(array1, array2);
    }

    @Test
    void mergeTwoLists6() {
        int[] array1 = {1,2,4};
        int[] array2 = {1,3,4};

        commonTest(array1, array2);
    }

    private void commonTest(int[] array1, int[] array2) {
        ListNode l1 = ListNodeUtils.fromArray(array1).orElse(null);
        ListNode l2 = ListNodeUtils.fromArray(array2).orElse(null);
        ListNode result = new Solution().mergeTwoLists(l1, l2);
        ListNodeUtils.printListNode(result);

        l1 = ListNodeUtils.fromArray(array1).orElse(null);
        l2 = ListNodeUtils.fromArray(array2).orElse(null);
        result = new Solution2().mergeTwoLists(l1, l2);
        ListNodeUtils.printListNode(result);
    }
}