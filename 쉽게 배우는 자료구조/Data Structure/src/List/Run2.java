package List;

public class Run2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add(0, "test");
		list.add(0, "sample");
		list.add(0, "String");
		list.printAll();
		
		list.append("test2");
		list.printAll();
		
		list.remove(3);
		list.printAll();
		
		list.add(3, "added-at-3");
		list.add(1, "added-at-1");
		list.add(0, "added-at-0");
		list.printAll();
		
		list.append("appended");
		list.printAll();
		
		list.remove(1);
		list.printAll();
		
		list.removeItem("added-at-3");
		list.printAll();
		
	}

}
