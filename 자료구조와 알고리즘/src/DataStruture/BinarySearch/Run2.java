package DataStruture.BinarySearch;

public class Run2 {
    public static void main(String[] args) {
        NodeMgmt myTree = new NodeMgmt();
        myTree.insertNode(2);
        myTree.insertNode(3);
        myTree.insertNode(4);
        myTree.insertNode(6);

        Node testNode = myTree.search(3);
        System.out.println(testNode.value);
        System.out.println(testNode.right.value);
    }
}

