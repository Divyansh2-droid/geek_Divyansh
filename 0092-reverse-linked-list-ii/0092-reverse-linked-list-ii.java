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
    public ListNode reverseBetween(ListNode head, int left, int right) {
          if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Step 1: Move prev to the node before left
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Step 2: Start head insertion for right-left times
        ListNode curr = prev.next;
        for (int i = 0; i < right - left; i++) {
            ListNode next = curr.next;   // take out next node
            curr.next = next.next;       // remove it
            next.next = prev.next;       // insert it at the front
            prev.next = next;            // update prev to new node
        }

        return dummy.next;
    }
}