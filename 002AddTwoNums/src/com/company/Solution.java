package com.company;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        boolean checker = false;
        while (l1 != null || l2 != null){
            int sum = 0;
            if (l1 == null){
                sum = l2.val;
                l2 = l2.next;
            }
            else if (l2 == null) {
                sum = l1.val;
                l1 = l1.next;
            }
            else {
                sum = l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            if (checker) sum++;
            if (sum >= 10) {
                sum -= 10;
                checker = true;
            } else {
                checker = false;
            }
            cur.next = new ListNode(sum);
            cur = cur.next;
        }
        if (checker) cur.next = new ListNode(1);
        return head.next;
    }
}