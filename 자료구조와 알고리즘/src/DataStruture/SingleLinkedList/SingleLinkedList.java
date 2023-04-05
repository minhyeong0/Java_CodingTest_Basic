package DataStruture.SingleLinkedList;

public class SingleLinkedList<T> {
    public Node<T> head  = null;

    class Node<T> {
        T data;
        Node<T> next = null;

        Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data) {
        if(head == null)
            head = new Node<>(data);
        else {
            Node<T> node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(data);
        }
    }

    public Node<T> search(T data) {
        if(head == null)
            return null;
        else {
            Node<T> node = head;
            while (node != null) {
                if(node.data == data) return node;
                else node = node.next;
            }
        }
        return null;
    }

    public void addNodeInside(T data, T isData) {
        Node<T> searchNode = search(isData);
        if (searchNode == null)
            addNode(data);
        else {
            Node<T> nextNode = searchNode.next;
            searchNode.next = new Node<T>(data);
            searchNode.next.next = nextNode;
        }
    }

    public boolean delNode(T isData) {
        if (head == null)
            return false;
        else {
            Node<T> node = head;
            if(node.data == isData) {
                head = node.next;
                return true;
            } else {
                while (node.next != null) {
                    if(node.next.data == isData) {
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }

    public void printAll() {
        if(head != null) {
            Node<T> node = this.head;
            System.out.print("[ ");
            while (node.next != null) {
                System.out.print(node.data + ", ");
                node = node.next;
            }
            System.out.println(node.data + " ]");
        }
    }
}
