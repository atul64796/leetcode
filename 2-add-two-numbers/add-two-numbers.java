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

        ListNode dummy = new  ListNode(0);
        ListNode temp = dummy;

        int carry = 0;

        while(l1 != null || l2 != null)
        {
            int sum = carry; // 0 -- > 1

            if(l1 != null)
            {
                sum = sum + l1.val;  // 0 + 2 = 2; 0 + 4 = 4; 1 + 3 = 4
                l1 = l1.next;
            }
            if(l2 != null)
            {
                sum = sum + l2.val; // 2 + 5 = 7; 4 + 6 = 10; 4 + 4 = 8
                l2 = l2.next;
            }

            temp.next = new ListNode(sum % 10); // 7 --> 0 --> 8
            carry = sum / 10; // 10 / 10 = 1;
            temp = temp.next; // move pointer
            
        }

            if(carry > 0)
            {
                temp.next = new ListNode(carry); // 
            }


        return dummy.next;
    }
}