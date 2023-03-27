package SingleLinkedList;

import List.ListInterface;

public class SingleLinkedList<E> implements ListInterface<E> {
	
	private Node<E> head;
	private int numItem;
	
	
	public SingleLinkedList() {
		numItem = 0;
		head = new Node<>(null, null); //더미헤드
	}
	
	public Node<E> getNode(int index) {
		if(-1 <= index && index <= numItem-1) {
			Node<E> currNode = head;
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
			Node<E> preNode = getNode(index - 1);
			Node<E> newNode = new Node<>(item, preNode.next);
			preNode.next = newNode;
			numItem++;
		}
	}

	@Override
	public void append(E item) {
		Node<E> preNode = head;
		while(preNode.next != null) {
			preNode = preNode.next;
		}
		Node<E> newNode = new Node<>(item, null);
		preNode.next = newNode;
		numItem++;
	}

	@Override
	public E remove(int index) {
		if(0<=index && index <= numItem) {
			Node<E> preNode = getNode(index-1);
			Node<E> currNode = preNode.next;
			preNode.next = currNode.next;
			numItem--;
			return currNode.item;
		}else {			
			return null;
		}
	}

	@Override
	public boolean removeItem(E item) {
		Node<E> currNode = head;
		Node<E> preNode;
		
		for(int i=0; i<numItem; i++) {
			preNode = currNode;
			currNode = currNode.next;
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
		if(0 <= index && index <= numItem) {
			return getNode(index).item;
		}else {
			return null;
		}
	}

	@Override
	public void set(int index, E item) {
		if(0<= index && index <= numItem) {
			getNode(index).item = item;
		}
	}

	@Override
	public int indexOf(E item) {
		Node<E> currNode = head;
		for(int i=0; i<numItem; i++) {
			currNode = currNode.next;
			if(((Comparable)(currNode.item)).compareTo(item) == 0) {
				return i;
			}
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
		head = new Node<>(null, null);
	}

	@Override
	public void printAll() {
		Node<E> currNode = head;
		System.out.print("[");
		while(currNode.next != null) {
			currNode = currNode.next;
			System.out.print(currNode.item);
			if(currNode.next != null)
				System.out.print(", ");
		}
		System.out.println("]");
	}

}
