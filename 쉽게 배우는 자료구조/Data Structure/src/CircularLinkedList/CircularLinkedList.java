package CircularLinkedList;

import List.ListInterface;

public class CircularLinkedList<E> implements ListInterface<E> {
	
	private Node<E> tail;
	private int numItem;
	
	
	public CircularLinkedList() {
		numItem = 0;
		tail = new Node(-1);
		tail.next = tail;
	}
	

	private Node<E> getNode(int index) {
		if(-1 <= index && index <= numItem) {
			Node<E> currNode = tail.next;
			for(int i=0; i<=index; i++) {
				currNode = currNode.next;
			}
			return currNode;
		}else {			
			return null;
		}
	}

	@Override
	public void add(int index, E item) {
		if(0 <= index && index <= numItem) {
			Node<E> preNode = getNode(index-1);
			Node<E> newNode = new Node<>(item, preNode.next);
			preNode.next = newNode;
			
			if(index == numItem)
				tail = newNode;
			numItem++;
		}
	}

	@Override
	public void append(E item) {
		Node<E> preNode = tail;
		Node<E> newNode = new Node<>(item, tail.next);
		preNode.next = newNode;
		tail = newNode;
		numItem++;
	}

	@Override
	public E remove(int index) {
		if(0<=index && index <= numItem-1) {
			Node<E> preNode = getNode(index-1);
			E rItem = preNode.next.item;
			preNode.next = preNode.next.next;
			if(index == numItem)
				tail = preNode;
			numItem--;
			return rItem;
		}
		return null;
	}

	@Override
	public boolean removeItem(E item) {
		Node<E> currNode = tail;
		Node<E> preNode;
		
		for(int i=0; i<numItem; i++) {
			preNode = currNode;
			currNode = preNode.next;
			if(((Comparable)(currNode.item)).compareTo(item) == 0) {
				preNode.next = currNode.next;
				numItem--;
				return true;
			}
		}
		return false;
	}

	@Override
	public E get(int index) {
		if(0 <= index && index <= numItem-1)
			return getNode(index).item;
		else		
			return null;
	}

	@Override
	public void set(int index, E item) {
		if(0 <= index && index <= numItem-1)
			getNode(index).item = item;	
	}

	@Override
	public int indexOf(E item) {
		Node<E> currNode = tail.next;
		for(int i=0; i<=numItem-1; i++) {
			currNode = currNode.next;
			if(((Comparable)(currNode.item)).compareTo(item) == 0)
				return i;
		}
		
		return -1;
	}

	@Override
	public int len() {
		return numItem;
	}

	@Override
	public boolean isEmpty() {
		return numItem == 0;
	}

	@Override
	public void clear() {
		numItem = 0;
		tail = new Node(-1);
		tail.next = tail;
	}

	@Override
	public void printAll() {
		Node<E> currNode = tail.next;
		System.out.print("[");
		for(int i=0; i<numItem; i++) {
			currNode = currNode.next;
			System.out.print(currNode.item);
			if(i != numItem -1)
				System.out.print(", ");
			else
				System.out.println("]");
		}
	}
}
