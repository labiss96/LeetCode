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
        ListNode cur = new ListNode();
        ListNode node = cur;
        boolean addFlag = false;
        while(true) {
            int added;
            if (l1 != null && l2 == null)
                added = l1.val;
            else if (l1 == null && l2 != null)
                added = l2.val;
            else if (l1 != null && l2 != null)
                added = l1.val + l2.val;
            else {
                if(addFlag) {
                    cur.next = new ListNode(1);
                    cur = cur.next;
                }
                break;
            }

            if(addFlag) {
                added++;
                addFlag = false;
            }

            if(added > 9) {
                addFlag = true;
                added = added % 10;
            }
            cur.next = new ListNode(added);
            cur = cur.next;

            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        return node.next;
    }
}