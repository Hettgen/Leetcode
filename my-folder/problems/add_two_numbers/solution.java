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
        
        ListNode newNode = new ListNode();


        return parseList(l1, l2, 0);
    }

    public ListNode parseList(ListNode list1, ListNode list2, int carry){
        
        
        ListNode newNode = new ListNode();
        if(list1 == null && list2 == null){
            if(carry != 0){
                
                newNode.val = carry;
                return newNode; 
            }
            return null;
        }
        
        if(list1 == null){
            if(list2.val + carry >= 10){
                newNode.val = list2.val + carry - 10;
                newNode.next = parseList(null, list2.next, 1);
            }
            else{
                newNode.val = list2.val + carry;
                newNode.next = parseList(null, list2.next, 0);
            }
            return newNode;
        }

        if(list2 == null){
            if(list1.val + carry >= 10){
                newNode.val = list1.val + carry - 10;
                newNode.next = parseList(list1.next, null, 1);
            }
            else{
                newNode.val = list1.val + carry;
                newNode.next = parseList(list1.next, null, 0);
            }
            
            return newNode;
        }

        if(list1.val + list2.val + carry >= 10){
            newNode.val = (list1.val + list2.val + carry) - 10;
            newNode.next = parseList(list1.next, list2.next, 1);
        }
        else{
            newNode.val = list1.val + list2.val + carry;
            newNode.next = parseList(list1.next, list2.next, 0);
        }
        
        return newNode;
    }

    // public ListNode addition(ListNode l1, ListNode l2){

    // }
}

// if(list1.val + list2.val + carry >= 10){
//                 newNode.val = (list1.val + list2.val + carry) - 10;
//                 ListNode lastNode = new ListNode(1); 
//                 newNode.next = lastNode;
//             }