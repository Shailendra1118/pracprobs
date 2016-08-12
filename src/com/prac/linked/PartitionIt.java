package com.prac.linked;

public class PartitionIt {

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(4);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(2);
		ListNode e = new ListNode(5);
		ListNode f = new ListNode(2);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = null;
				
		ListNode cur = partition(a, 3);
		while(cur != null){
			System.out.println(cur.val+" ");
			cur = cur.next;
		}
	}
	
	public static ListNode partition(ListNode head, int x) {
        ListNode ptr = head;
        ListNode list1 = null;
        ListNode list2 = null;
        ListNode prev1 = null;
        ListNode prev2 = null;
        ListNode head1 = null, head2 = null;
        while(ptr != null){
            int cur = ptr.val;
            if(cur < x){
                list1 = new ListNode(cur);
                list1.next = null;
                if(head1 == null)
                	head1 = list1;
                if(prev1 == null){
                    prev1 = list1;
                }
                else
                    prev1.next = list1;
                    
                prev1 = list1;
            }else if(cur > x){
                list2 = new ListNode(cur);
                list2.next = null;
                if(head2 == null)
                	head2 = list2;
                if(prev2 == null){
                    prev2 = list2;
                }
                else
                    prev2.next = list2;
                    
                prev2 = list2;
            }
            ptr = ptr.next;
        }
        
        ListNode xNode= new ListNode(x);
        ListNode start = head1;
        while(head1.next != null)
        	head1 = head1.next;
        head1.next = xNode;
        xNode.next = head2;
        
        return start; 
        
    }
	
}
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
