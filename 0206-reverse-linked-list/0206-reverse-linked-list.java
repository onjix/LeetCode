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
    public ListNode reverseList(ListNode head) {
        ListNode newList = head;
        ListNode arrow = head;
        int size = 0;
        while(arrow != null) {
            size++;
            arrow = arrow.next;
        }
        
        int [] ar = new int[size+1];
        int i=0;
        while(head != null) {
            ar[i] = head.val;
            head = head.next;
            i++;
        }
        ListNode n = newList;
        for(int j=size-1; j>=0; j--) {
            newList.val = ar[j];
            System.out.println(ar[j] +" " + newList.val);
            newList = newList.next;
        }
        
        return n;
    }
}