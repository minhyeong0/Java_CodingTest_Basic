package IntegerList;

public class IntegerArrayList implements IntegerListInterface {
	
	private Integer[] item;
	private int numItem;
	private static final int DEFAULT_CAPACITY = 64;
	
	public IntegerArrayList() {
		item = new Integer[DEFAULT_CAPACITY];
		numItem = 0;
	}
	
	public IntegerArrayList(int n) {
		item = new Integer[n];
		numItem = 0;
	}
	
	@Override
	public void add(int index, Integer x) {
		if(numItem >= item.length || index < 0 || index > numItem) {
			System.err.println("¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù");
			return;
		}else {
			for(int i=numItem-1; i>=index; i--) {
				item[i+1] = item[i];
			}
			item[index] = x;
			numItem++;
		}
	}

	@Override
	public void append(Integer x) {
		if(numItem >= item.length) {
			System.err.println("¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù");
			return;
		}else {
			item[numItem++] = x;
		}
	}

	@Override
	public Integer remove(int index) {
		if(isEmpty() || index < 0 || index > numItem-1) {
			System.err.println("¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù");
			return -1;
		}else {
			Integer tmp = item[index];
			for(int i=index; i<=numItem-2; i++) {
				item[i] = item[i+1];
			}
			numItem--;
			return tmp;
		}
	}

	@Override
	public boolean removeItem(Integer x) {
		int k = 0;
		while(k< numItem && item[k].compareTo(x) != 0) {
			k++;
		}
		if(k == numItem)
			return false;
		else {
			for(int i=k; i<=numItem-2; i++) {
				item[i] = item[i+1];
			}
			
			numItem--;
			return true;
		}
	}

	@Override
	public Integer get(int index) {
		return item[index];
	}

	@Override
	public void set(int index, Integer x) {
		if(0 <= index && index <= numItem-1) {
			item[index] = x;
		}else {
			System.err.println("¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù");
			return;
		}
	}

	@Override
	public int indexOf(Integer x) {
		for(int i=0; i<numItem; i++) {
			if(((Comparable<Integer>)item[i]).compareTo(x) == 0) 
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
		item = new Integer[item.length];
		numItem = 0;
	}

	@Override
	public void printAll() {
		System.out.print("[");
		for(int i=0; i<numItem; i++) {
			System.out.print(item[i]);
			if(i != numItem-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
}
