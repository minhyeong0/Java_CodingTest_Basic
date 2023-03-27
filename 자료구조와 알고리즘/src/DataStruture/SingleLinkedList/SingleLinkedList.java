package DataStruture.SingleLinkedList;

public class SingleLinkedList<T> {
    public Node<T> head = null;

    class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }



    public void addNode(T data){
        if(head == null)
            head = new Node<>(data);
        else{
            Node<T> node = this.head;
            while (node.next != null){
                node = node.next;
            }
            node.next = new Node<>(data);
        }
    }

    public void addInsideNode(T data, T isData){
        Node<T> searchedNode = this.search(isData);
        if(searchedNode == null){
            this.addNode(data);
        }else{
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<>(data);
            searchedNode.next.next = nextNode;
        }
    }

    public boolean delNode(T isData){
        if(this.head == null)
            return false;
        else {
            Node<T> node = this.head;
            if(node.data == isData){
                this.head = this.head.next;
                return true;
            }else{
                while (node.next != null){
                    if(node.next.data == isData){
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }

    private Node<T> search(T data) {
        if(this.head == null)
            return null;
        else{
            Node<T> node = this.head;
            while (node != null){
                if(node.data == data)
                    return node;
                else
                    node = node.next;
            }
            return null;
        }
    }

    public void printAll(){
        if(this.head != null){
            Node<T> node = this.head;
            System.out.print("[");
            while (node.next != null){
                System.out.print(node.data + ", ");
                node = node.next;
            }
            System.out.println(node.data + "]");
        }
    }

}
