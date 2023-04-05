package DataStruture.SingleLinkedList;

public class Run2 {
    public static void main(String[] args) {
        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<>();
        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.printAll();

        MyLinkedList.addNodeInside(5,1);
        MyLinkedList.printAll();

        MyLinkedList.addNodeInside(6,3);
        MyLinkedList.printAll();

        MyLinkedList.addNodeInside(7,20);
        MyLinkedList.printAll();
    }
}
