/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        if(head == null || head.next == null)
            return null;
        while(head != null) {
            if(list.contains(head))
                return head;
            list.add(head);
            head = head.next;
        }
        return null;
    }
}