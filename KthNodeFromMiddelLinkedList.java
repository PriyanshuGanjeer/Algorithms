
 class Solution {
    public int solve(ListNode head, int B) {
        ListNode slow=head;
        ListNode fast=head;
        int mid=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            mid++;
        }
        if(B>mid){
            return -1;

        }
        int HeadToPostion=mid-B;
        slow=head;
        for(int i=0;i<HeadToPostion;i++){
            slow=slow.next;
        }
        return slow.val;

    }


}
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}
public class KthNodeFromMiddelLinkedList{
    public static void main(String[] a){
        ListNode n1=new ListNode(34);
        ListNode n2=new ListNode(33);
        ListNode n3=new ListNode(45);
        ListNode n4=new ListNode(30);
        ListNode n5=new ListNode(32);
        ListNode n6=new ListNode(66);
        ListNode n7=new ListNode(90);
        

        ListNode head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=null;

        Solution s=new Solution();
       int ss= s.solve(head,2);
        
        System.out.println(ss);

    }
}