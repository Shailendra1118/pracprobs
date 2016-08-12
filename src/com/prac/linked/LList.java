package com.prac.linked;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class LList {

	public static void main(String[] args) {
		OLinkedList<Integer> list = new OLinkedList<>();
		System.out.println("size now "+list.size());
		list.add(new Integer(100));
		list.add(new Integer(200));
		System.out.println("size now "+list.size());
		list.add(new Integer(2300));
		System.out.println("size now "+list.size());
		//list.remove();
		//list.remove();
		list.remove();
		System.out.println("size now "+list.size());
		
		System.out.println(list.toString());
		
	}

}

class OLinkedList<E> implements Queue<E>{
	
	Node<E> head = null;
	Node<E> tail = null;
	
	static class Node<E>{
		E data;
		Node<E> next;
		
		public Node(E e){
			this.data = e;
			this.next = null;
		}
	}
	
	class OIterator implements Iterator<E>{
		int count = 0;
		Node<E> cur = head;
		@Override
		public boolean hasNext() {
			if(cur == null)
				return false;
			else 
				return true;
		}

		@Override
		public E next() {
			Node<E> now = cur;			
			cur = cur.next;			
			return now.data;
			
		}
		
	}
	
	

	
	public OLinkedList(){
		head = tail = null;
	}
	

	@Override
	public boolean isEmpty() {
		if(this.size() == 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean contains(Object o) {		
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		OIterator iter = new OIterator();		
		return iter;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean add(E e) {
		Node<E> cur = head;
		if(cur == null){
			//first node to be added
			Node<E> node = new Node<>(e);
			head = node;
			return true;
		}
		while(cur.next != null)
			cur = cur.next;
		Node<E> newNode = new Node<E>(e);
		cur.next = newNode;
		newNode.next = null;
		//cur = null;
		return true;
	}

	@Override
	public boolean offer(E e) {
		return false;
	}

	@Override
	public E remove() {
		Node<E> head = this.head;
		E data = head.data;
		this.head = this.head.next;
		head = null;
		return data;
	}

	@Override
	public E poll() {
		return remove();
	}

	@Override
	public E element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		E data = head.data;
		return data;
	}


	@Override
	public int size() {
		Node<E> cur = head;
		if(cur == null)
			return 0;
		int ctr = 0;
		while(cur.next != null){
			cur = cur.next;
			ctr++;
		}
		return ctr+1;
	}
	
	public String toString(){
		Iterator<E> iter = this.iterator();
		StringBuilder builder = new StringBuilder();		
		while(iter.hasNext()){
			System.out.println(iter.next());
			builder.append(iter.next());
		}
		return builder.toString();
		
	}
}
