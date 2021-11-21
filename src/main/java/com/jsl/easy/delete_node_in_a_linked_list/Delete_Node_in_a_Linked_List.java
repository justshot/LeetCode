package com.jsl.easy.delete_node_in_a_linked_list;

import com.jsl.common.ListNode;

/**
 * Created by shaoliang.
 */
public class Delete_Node_in_a_Linked_List {
    public void deleteNode(ListNode node) {
        if(node != null && node.next != null){
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
