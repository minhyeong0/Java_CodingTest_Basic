package CircularDoublyLinkedList;

public class BidireactionalNode<E> {
	
	public E item;
	public BidireactionalNode<E> prev;
	public BidireactionalNode<E> next;
	
	public BidireactionalNode() {
		prev = null;
		next = null;
		item = null;
	}
	
	public BidireactionalNode(E newItem) {
		prev = null;
		next = null;
		item = newItem;
	}
	
	public BidireactionalNode(BidireactionalNode<E> preNode,
			E newitem, BidireactionalNode<E> nextNode) {
		prev = preNode;
		next = nextNode;
		item = newitem;
	}
}
