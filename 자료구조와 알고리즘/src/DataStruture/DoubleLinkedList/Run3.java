package DataStruture.DoubleLinkedList;

public class Run3 {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> myLinkedList = new DoubleLinkedList<>();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);
        myLinkedList.addNode(5);
        myLinkedList.printAll();
        System.out.println("-----------");

        myLinkedList.insertToFront(3,2 );
        myLinkedList.printAll();
        System.out.println("-----------");

        myLinkedList.insertToFront(6,2 );
        myLinkedList.insertToFront(1,0 );
        myLinkedList.printAll();
        System.out.println("-----------");

        myLinkedList.addNode(6);
        myLinkedList.printAll();

    }
}
