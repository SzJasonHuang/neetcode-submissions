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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }

        int midCount = (count - 1) / 2;
        ListNode mid = head;

        while (midCount > 0) {
            mid = mid.next;
            midCount--;
        }

        ListNode second = mid.next;
        mid.next = null;
        // reverse
        ListNode middle = reverse(second);

        ListNode l1 = head;
        ListNode l2 = middle;
        while (l2 != null) {
            ListNode l1next = l1.next;
            ListNode l2next = l2.next;
            l1.next = l2;
            l2.next = l1next;
            l1 = l1next;
            l2 = l2next;
        }
    }
    // 1 2 3
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        return prev;
    }
}
