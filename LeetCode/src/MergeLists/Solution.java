package MergeLists;
//singly linked list
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
public class Solution {

   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode head;
      ListNode last;
      if(l1==null){
         return l2;
      }
      else if(l2==null){
         return l1;
      }

      if(l1.val<=l2.val){
         head = new ListNode(l1.val);
         l1 =l1.next;
      }
      else {
         head = new ListNode(l2.val);
         l2 = l2.next;
      }
      last = head;
      while(l1!=null||l2!=null){
         ListNode nextNode;
         if(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
               nextNode = new ListNode(l1.val);
               last.next = nextNode;
               last = nextNode;
               l1 = l1.next;
            }
            else if(l1.val>l2.val){
               nextNode =new ListNode(l2.val);
               last.next = nextNode;
               last = nextNode;
               l2 = l2.next;
            }
         }
         else if (l1==null){
            nextNode =new ListNode(l2.val);
            last.next = nextNode;
            last = nextNode;
            l2 = l2.next;
         }
         else{
            nextNode = new ListNode(l1.val);
            last.next = nextNode;
            last = nextNode;
            l1 = l1.next;
         }
      }

      return head;
   }

}
