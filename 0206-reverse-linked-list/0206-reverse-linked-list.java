class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head ;
        ListNode prevNode = null ;
        ListNode nextNode = null;

        while(current != null){
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        head = prevNode ;
        return  prevNode;
        
    }
}