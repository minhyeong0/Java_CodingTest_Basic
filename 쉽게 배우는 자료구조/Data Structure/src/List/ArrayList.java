package List;

public class ArrayList<E> implements ListInterface<E> {
	
	private E[] item;
	private int numitem;
	private static final int DEFAULT_CAPACITY = 64;
	
	public ArrayList(){
		item = (E[])new Object[DEFAULT_CAPACITY];
		numitem = 0;
	}
	
	public ArrayList(int n) {
		item = (E[])new Object[n];
		numitem = 0;
	}
	
	@Override
	public void add(int index, E x) {
		if(numitem >= item.length || index < 0 || index > numitem) {
			System.err.println("¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù");
		}else {
			for(int i=numitem-1; i>=index; i--) {
				item[i+1] = item[i];
			}
			item[index] = x;
			numitem++;
		}
	}

	@Override
	public void append(E x) {
		if(numitem >= item.length) {
			System.err.println("¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù");
		}else {
			item[numitem++] = x;
		}
	}

	@Override
	public E remove(int index) {
		if(isEmpty() || index < 0 || index > numitem-1) {
			System.out.println("¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù.");
			return null;
		}else {
			E tmp = item[index];
			for(int i=index; i<=numitem-2; i++) {
				item[i] = item[i+1];
			}
			numitem--;
			return tmp; 
		}
	}

	@Override
	public boolean removeItem(E x) {
		int k=0;
		while(k<numitem && ((Comparable)item[k]).compareTo(x) != 0) {
			k++;
		}
		if(k == numitem) 
			return false;
		else {
			for(int i=k; i<=numitem-2; i++) {
				item[i] = item[i+1];
			}
			numitem--;
		}
		return true;
	}

	@Override
	public E get(int index) {
		if(0 <= index && index <= index-1) {
			return item[index];
		}else {
			return null;
		}
	}

	@Override
	public void set(int index, E x) {
		if(0 <= index || index <= index-1) {
			item[index] = x;
		}else {
			System.err.println("¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù");
		}
	}

	@Override
	public int indexOf(E x) {
		for(int i=0; i<numitem; i++) {
			if(((Comparable)item[i]).compareTo(x) ==0)
				return i;
		}
		return -1;
	}

	@Override
	public int len() {
		return numitem;
	}

	@Override
	public boolean isEmpty() {
		return numitem == 0;
	}

	@Override
	public void clear() {
		item = (E[])new Object[item.length];
		numitem = 0;
	}

	@Override
	public void printAll() {
		System.out.print("[");
		for(int i=0; i<numitem; i++) {
			System.out.print(item[i]);
			if(i != numitem-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
}
