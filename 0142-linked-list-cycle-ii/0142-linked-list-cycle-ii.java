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
        ListNode fn = head;
        ListNode sn = head;
        
        while(fn != null && fn.next != null) {
            fn = fn.next.next;
            sn = sn.next;
            
            if(fn == sn) {
                ListNode arrow = head;
                System.out.print(sn + " " + sn.next);
                while(arrow != sn) {
                    arrow = arrow.next;
                    sn = sn.next;
                }
                return arrow;
            }
        }
        return null;
    }
}