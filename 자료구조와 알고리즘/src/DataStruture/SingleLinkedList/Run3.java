package DataStruture.SingleLinkedList;

public class Run3 {
    public static void main(String[] args) {
        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<>();
        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(4);
        MyLinkedList.addNode(5);
        MyLinkedList.printAll();

        MyLinkedList.delNode(3);
        MyLinkedList.printAll();

        MyLinkedList.delNode(1);
        MyLinkedList.printAll();

        MyLinkedList.delNode(5);
        MyLinkedList.printAll();
    }
}
