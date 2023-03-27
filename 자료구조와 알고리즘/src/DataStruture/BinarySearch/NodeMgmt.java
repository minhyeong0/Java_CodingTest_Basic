package DataStruture.BinarySearch;


class Node {
    Node left;
    Node right;
    int value;

    public Node(int data){
        this.value = data;
        this.left = null;
        this.right = null;
    }
}
public class NodeMgmt {

    Node head = null;

    public boolean insertNode(int data){
        //CASE1 : 노드가 하나도 없을 때
        if(this.head == null)
            this.head = new Node(data);
        //CASE2 : 노드가 하나이상 있을 때
        else{
            Node findNode = this.head;
            while (true){
                //CASE2-1 : 현재노드의 왼쪽에 노드가 들어가야하는 경우
                if(data < findNode.value){
                    if(findNode.left != null)
                        findNode = findNode.left;
                    else{
                        findNode.left = new Node(data);
                        break;
                    }
                //CASE2-2 : 현재노드의 오른쪽에 노드가 들어가야하는 경우
                } else{
                    if(findNode.right != null)
                        findNode = findNode.right;
                    else{
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }

    public Node search(int data){
        //CASE1 : 노드가 하나도 없는 경우
        if(this.head == null)
            return null;
        //CASE2 : 노드가 하나이상 있을 경우
        else{
            Node finNode = this.head;
            while (finNode != null){
                if(data == finNode.value)
                    return finNode;
                else if(data < finNode.value)
                    finNode = finNode.left;
                else
                    finNode = finNode.right;

            }
            return null;
        }
    }

    public boolean delete(int value){
        boolean searched = false;
        Node currParentNode = this.head;
        Node currNode = this.head;

        //예외 케이스1 : 노드가 하나도 없을 때
        if(this.head == null)
            return false;
        else {
            //예외 케이스2 : 노드가 단지 하나만 있고, 해당 노드가 삭제할 노드 일때
            if(this.head.value == value && this.head.left == null && this.head.right == null){
                this.head = null;
                return true;
            }

            while (currNode != null){
                if(value == currNode.value){
                    searched = true;
                    break;
                } else if (value < currNode.value) {
                    currParentNode = currNode;
                    currNode = currNode.left;
                } else {
                    currParentNode = currNode;
                    currNode = currNode.right;
                }
            }
            if(searched == false) return false;
        }
        //여기까지 실행되면
        //currNode에는 해당 데이터를 가지고 있는 Node
        //currParentNode에는 해당 데이터를 가지고 있는 Node의 부모 Node를 가지게 됨

        //CASE1 : 삭제할 노드가 Leaf Node인 경우
        if(currNode.left == null && currNode.right == null){
            if(value < currParentNode.value){
                currParentNode.left = null;
                currNode = null;
            } else {
                currParentNode.right = null;
                currNode = null;
            }
            return true;

        //CASE2-1 : 삭제할 노드가 Child Node를 왼쪽에 한개 가지고 있는 경우
        } else if (currNode.left != null && currNode.right == null) {
            if(value < currParentNode.value){
                currParentNode.left = currNode.left;
                currNode = null;
            }else{
                currParentNode.right = currNode.left;
                currNode = null;
            }
            return true;
        //CASE2-2 : 삭제할 노드가 Child Node를 오른쪽에 한개 가지고 있는 경우
        } else if (currNode.left == null && currNode.right != null) {
            if(value < currParentNode.value){
                currParentNode.left = currNode.right;
                currNode = null;
            } else{
                currParentNode.right = currNode.right;
                currNode = null;
            }
            return true;
        //CASE3 : 삭제할 노드가 child Node를 2개 가지고 있는 경우
        }else{
            //CASE3-1 : 삭제할 노드가 부모 Node의 왼쪽에 있는 경우
            if(value < currParentNode.value){
                Node changeNode = currNode.right;
                Node changeParentNode = currNode.right;

                while (changeNode.left != null){
                    changeParentNode = changeNode;
                    changeNode = changeNode.left;
                }
                //여기까지 실행되면
                //changeNode에는 오른쪽 Node 중에서 가장 작은 노드가 됨

                //CASE3-1-1 : changeNode의 오른쪽 Child Node가 있는 경우
                if(changeNode.right != null){
                    changeParentNode.left = changeNode.right;
                //CASE3-1-2 : changeNode의 Child Node가 없는 경우
                } else{
                    changeParentNode.left = null;
                }

                //currParent Node의 왼쪽 Child Node에 삭제할 Node의 오른쪽 자식 중,
                //가장작은 값을 가진 changeNode로 연결한다.
                currParentNode.left = changeNode;

                //Parent Node의 왼쪽 Child Node가 현재 changeNode이고
                //changeNode의 왼쪽/오른쪽 ChildNode를 모두, 삭제할 currNode의
                //기존 왼쪽/오른쪽 Node로 변경
                changeNode.left = currNode.left;
                changeNode.right = currNode.right;
                currNode = null;
            //CASE3-2 : 삭제할 노드가 부모 Node의 오른쪽에 있는 경우
            } else{
                Node changeNode = currNode.right;
                Node changeParentNode = currNode.right;

                while (changeNode.left != null){
                    changeParentNode = changeNode;
                    changeNode = changeNode.left;
                }
                //여기까지 실행되면
                //changeNode에는 오른쪽 Node 중에서 가장 작은 노드가 됨

                //CASE3-2-1 : changeNode의 오른쪽 Child Node가 있는 경우
                if(changeNode.right != null){
                    changeParentNode.left = changeNode.right;
                //CASE3-2-2 : changeNode의 Child Node가 없는 경우
                } else{
                    changeParentNode.left = null;
                }

                //currParent Node의 오른쪽 Child Node에 삭제할 Node의 오른쪽 자식 중,
                //가장작은 값을 가진 changeNode로 연결한다.
                currParentNode.right = changeNode;

                //Parent Node의 왼쪽 Child Node가 현재 changeNode이고
                //changeNode의 왼쪽/오른쪽 ChildNode를 모두, 삭제할 currNode의
                //기존 왼쪽/오른쪽 Node로 변경
                changeNode.left = currNode.left;
                changeNode.right = currNode.right;
                currNode = null;
            }
            return true;
        }
    }
}
