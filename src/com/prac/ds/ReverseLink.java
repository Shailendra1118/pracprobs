package com.prac.ds;

public class ReverseLink {

	static LNode head = null;
	public static void main(String[] args) {
		LNode a = new LNode(2);
		LNode b = new LNode(6);
		LNode c = new LNode(5);
		LNode d = new LNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		head = a;
		reverse(a);
		System.out.println(head.data);
		
	}
	
	private static void reverse(LNode p) {
		if(p.next == null){
			head = p;
			return;
		}
		reverse(p.next);
		LNode q = p.next;
		q.next = p;
		p.next = null;
	}
	
	

}

class LNode{
	int data;
	LNode next;
	LNode(int data){
		this.data = data;
		this.next = null;
	}
}
