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
    public ListNode swapPairs(ListNode head) {
        // Base case: if list has fewer than 2 nodes, no swap needed
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode prevNode = dummyNode;
        ListNode currNode = head;

        while (currNode != null && currNode.next != null) {
            ListNode nextPair = currNode.next.next;
            ListNode second = currNode.next;

            // Reverse the current pair
            second.next = currNode;
            currNode.next = nextPair;
            prevNode.next = second;

            // Move pointers forward for the next iteration
            prevNode = currNode;
            currNode = nextPair;
        }

        return dummyNode.next;
    }
}