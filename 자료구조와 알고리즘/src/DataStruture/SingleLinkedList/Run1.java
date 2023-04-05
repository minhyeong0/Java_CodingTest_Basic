package DataStruture.SingleLinkedList;

public class Run1 {
    public static void main(String[] args) {
        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<>();
        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);

        MyLinkedList.printAll();
    }
}
