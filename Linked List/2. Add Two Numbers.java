https://leetcode.com/problems/add-two-numbers/description/
2. Add Two Numbers
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
        ListNode dummy = new ListNode(0); // Dummy node to handle edge cases
        ListNode current = dummy;
        int carry = 0;
        
        // Continue while there are digits in either list or carry exists
        while (l1 != null || l2 != null || carry > 0) {
            // Get values from lists or 0 if list ended
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            // Calculate sum and new carry
            int sum = x + y + carry;
            carry = sum / 10;
            
            // Create new node with sum's digit
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            // Move to next nodes if available
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        return dummy.next;
    }
}
