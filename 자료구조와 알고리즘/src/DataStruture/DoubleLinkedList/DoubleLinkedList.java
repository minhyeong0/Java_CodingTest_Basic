package DataStruture.DoubleLinkedList;

public class DoubleLinkedList<T> {
    Node<T> head = null;
    Node<T> tail = null;

    class Node<T> {
        T data;
        Node<T> prev = null;
        Node<T> next = null;

        Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (head == null) {
            head = new Node<>(data);
            tail = head;
        } else {
            Node<T> node = head;
            while (node.next != null)
                node = node.next;
            node.next = new Node<>(data);
            node.next.prev = node;
            tail = node.next;
        }
    }

    public T searchFromHead(T isData) {
        if (head == null) return null;
        else {
            Node<T> node = head;
            while (node != null) {
                if (node.data == isData) return node.data;
                node = node.next;
            }
            return null;
        }
    }

    public T searchFromTail(T isData) {
        if (head == null) return null;
        else {
            Node<T> node = tail;
            while (node != null) {
                if (node.data == isData) return node.data;
                node = node.prev;
            }
            return null;
        }
    }

    public boolean insertToFront(T existedData, T addData) {
        if (head == null) {
            head = new Node<>(addData);
            tail = head;
            return true;
        } else if (head.data == existedData){
            Node<T> newHead = new Node<>(addData);
            newHead.next = head;
            head = newHead;
            //head.next.prev = head;
            return true;
        } else {
            Node<T> node = head;
            while (node != null) {
                if(node.data == existedData) {
                    Node<T> nodePrev = node.prev;
                    nodePrev.next = new Node<>(addData);
                    nodePrev.next.next = node;
                    nodePrev.next.prev = nodePrev;
                    node.prev = nodePrev.next;
                    return true;
                }
                node = node.next;
            }
            return false;
        }
    }

    public void printAll() {
        if (head == null)
            System.out.println("[ ]");
        else {
            Node<T> node = head;
            System.out.print("[ ");
            while (node != null) {
                if (node.next == null) break;
                System.out.print(node.data + ", ");
                node = node.next;
            }
            System.out.println(node.data + " ]");
        }
    }
}
