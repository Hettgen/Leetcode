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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        



        return merge(list1, list2);
    }

    public ListNode merge(ListNode list1, ListNode list2){

        ListNode newNode = new ListNode();

        if(list1 == null && list2 == null){
            return null;
        }

        if(list1 == null){
            newNode.val = list2.val;
            newNode.next = merge(null, list2.next);
            return newNode;
        }
        if(list2 == null){
            newNode.val = list1.val;
            newNode.next = merge(list1.next, null);
            return newNode;
        }

        if(list1.val <= list2.val){
            newNode.val = list1.val;
            newNode.next = merge(list1.next, list2);
            return newNode;
        }
        if(list1.val > list2.val){
            newNode.val = list2.val;
            newNode.next = merge(list1, list2.next);
            return newNode;
        }
        
        return null;
    }
}