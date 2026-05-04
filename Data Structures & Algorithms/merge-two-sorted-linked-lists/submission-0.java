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
        ListNode head = null, list =null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                if(list!=null){
                    list.next = list1;
                    list=list.next;
                }
                else{
                    head = list1;
                    list = list1;
                }
                list1 = list1.next;
            }
            else{
                 if(list!=null){
                    list.next = list2;
                    list = list.next;
                }
                else{
                    head = list2;
                    list = list2;
                }
                list2 = list2.next;
            }
        }
        while(list1!=null){
            list.next = list1;
            list = list.next;
            list1 =  list1.next;
        }
        while(list2!=null){
            list.next = list2;
            list =  list.next;
            list2 =  list2.next;
        }
        return head;
        
    }
}