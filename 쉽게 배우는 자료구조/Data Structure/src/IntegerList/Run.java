package IntegerList;

public class Run {
	
	public static void main(String[] args) {
		IntegerArrayList list = new IntegerArrayList();
		list.add(0, 300);
		list.add(0, 200);
		list.add(0, 100);
		list.printAll();
		
		list.append(500);
		list.append(600);
		list.remove(3);
		list.printAll();
		
		list.add(3, 250);
		list.add(1, 50);
		list.add(0, 10);
		list.append(700);
		list.remove(1);
		list.removeItem(600);
		list.printAll();
		
	}
}
