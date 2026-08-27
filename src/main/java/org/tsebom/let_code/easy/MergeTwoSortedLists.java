package org.tsebom.let_code.easy;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode buff = result;

        while (list1 != null || list2 != null) {
            if (list1.val < list2.val) {
                buff.next = list1;
                list1 = list1.next;
                buff = buff.next;
            } else {
                buff.next = list2;
                list2 = list2.next;
                buff = buff.next;
            }
        }

        if (list1 == null) {
            buff.next = list2;
        } else {
            buff.next = list1;
        }
        return result.next;
    }
}
