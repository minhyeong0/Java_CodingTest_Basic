package DataStruture.DoubleLinkedList;

public class Run2 {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> myLinkedList = new DoubleLinkedList<>();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);
        myLinkedList.addNode(5);
        myLinkedList.printAll();

        System.out.println(myLinkedList.searchFromHead(1));
        System.out.println(myLinkedList.searchFromTail(1));
    }
}
