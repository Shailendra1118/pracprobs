package com.calm.think;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

import com.calm.think.HospitalController.Patient;

public class MyQueue {

	public static void main(String[] args) {

	}
	
	
	static class SomeArrayQueue implements Queue<Patient>{

		@Override
		public int size() {
			return 0;
		}

		@Override
		public boolean isEmpty() {
			return false;
		}

		@Override
		public boolean contains(Object o) {
			return false;
		}

		@Override
		public Iterator<Patient> iterator() {
			return null;
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
		public boolean addAll(Collection<? extends Patient> c) {
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
		public boolean add(Patient e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean offer(Patient e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Patient remove() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Patient poll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Patient element() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Patient peek() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
