public class BinaryT {
    Node rootNode = null;

    //새로운 노드 삽입
    public void insertNode(int number){
        if(rootNode == null){
            rootNode = new Node(number);// 노드가 없는 경우 새로운 노드 추가(생성자이용)
        }else{
            Node head = rootNode; // 헤드 = 노드설정값
            Node currentNode;
            while(true){
                currentNode = head;
                //현재보다 작으면 왼쪽으로 검색
                if(head.numValue > number){
                    head = head.leftChild;
                    //왼쪽 자식 노드가 비어있으면 추가 노드 삽입
                    if(head == null){
                        currentNode.leftChild = new Node(number);
                        break;
                    }
                }else{ //현재보다 클경우 오른쪽 탐색
                    head = head.rightChild;
                    if(head == null){
                        currentNode.rightChild = new Node(number);
                        break;
                    }
                }
            }
        }
    }
    //출력을 후위순회로 원하기 때문에
    //후위 순회 생성
    public void postorderTree(Node root){
        if(root != null){//이중 재귀로 출력
            postorderTree(root.leftChild);//하위 왼쪽 노드
            postorderTree(root.rightChild);//하위 오른쪽 노드
            System.out.println(root.numValue);
        }
    }
}
