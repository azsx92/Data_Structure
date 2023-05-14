# 여러가지 자료구조에 대해 알아보자
## 자료구조란 무엇인가? (Data Structure)

- 프로그램에서 사용할 많은 데이타를 메모리 상에서 관리하는 여러 구현방법들
- 효율적인 자료구조가 성능 좋은 알고리즘의 기반 됨
- 자료 효율적인 관리는 프로그램의 수행속도와 밀접한 관련이 있음
- 여러 자료 구조 중에서 구현하려는 프로그램에 맞는 최적의 자료구조를 활용해야 하므로 자료구조에 대한 이해가 중용함

# 자료구조에는 어떤 것이들이 있나?
- <span style='background-color:#fff5b1'>한 줄로 자료를 관리하기(선형 자료구조)</span>
  - <h4>배열</h4>(Array) : 선형으로 자료를 관리, 정해진 크기의 머모리를 먼저 할당받아 사용하고, 자료릐 물리적 위치와 논리적 위치가 같음

    ![img_1.png](img_1.png)
- <h4>연결 리스트</h4> (LinkedList) : 선형으로 자료를 관리, 자료가 추가될 때마다 메모리를 할당 받고, 자료는 링크로 연결됨. 자료의 물리적 위치와 논리적 위치가 다를 수 있음
  리스트에 자료 추가하기

  ![img.png](img.png)
  
 
-  리스트에서 자료 삭제하가ㅣ
  ![img_2.png](img_2.png)
  - <h4>스택</h4> (Stack) : 가장 나중에 입력 된 자료가 가장 먼저 출력되는 자료 구조 (Last In First OUt)
  ![img_3.png](img_3.png)
- <h4>큐</h4> (Queue) : 가장 먼저 입력 된 자료가 가장 먼저 출력되는 자료 구조 (First In First Out)
- ![img_4.png](img_4.png)
- <h4>트리</h4> (Tree) : 부모 노드와 자식 노드간의 연결로 이루어진 자료 구조

- Max heap : 부모 노드는 자식 노드보다 항상 크거나 같은 값을 갖는 경우
- Min heap : 부모 노드는 자식 노드보다 항상 작거나 같은 값을 갖는 경우

- heap 정렬에 활용 할수 있음.
- <span style='background-color:#fff333'>이진 트리 (binary tree) : 부모노드에 자식노드가 두 개 이하인 트리</span>
  ![img_5.png](img_5.png)
  
  #### 이진 검색 트리 (binary search tree)
  ![img_6.png](img_6.png)

- 자료(key)의 중복을 허용하지 않음
- 왼쪽 자식 노드는 부모 노드보다 작은 값, 오른쪽 자식 노드는 부모 노드보다 큰 값을 가짐
- 자료를 검색에 걸리는 시간이 평균 log(n) 임
- inorder traversal 탐색을 하게 되면 자료가 정렬되어 출력됨 
- <span style='background-color:#fff333'> 예) [23, 10, 28, 15, 7, 22, 56] 순으로 자료를 넣을때 BST</span>
- 나중에 tresset이나 treemap 할떄 compaable인터페이스 구현해서 비교하게끔 구현할 거.
     ![img_7.png](img_7.png)

- 정점(vertex) : 여러 특성을 가지는 객체, 노드(node)
- 간선(edge) : 이 객체들을 연결 관계를 나타냄. 링크(link)
- 간선은 방향성이 있는 경우와 없는 경우가 있음(노드와 노드 연결하는걸 edge나 link라고 한다.)
- 그래프를 구현하는 방법 : 인접 행렬(adjacency matrix), 인접 리스트(adjacency list)
- 그래프를 탐색하는 방법 : BFS(bread first search), DFS(depth first search)

그래프의 예)

  ![img_8.png](img_8.png)
- <p>해싱<p> (Hashing) : 자료를 검색하기 위한 자료 구조
- 검색을 위한 자료 구조
- 키(key)에 대한 자료를 검색하기 위한 사전(dictionary) 개념의 자료 구조
- key는 유일하고 이에 대한 value를 쌍으로 저장
- index = h(key) : 해시 함수가 key에 대한 인덱스를 반환해줌 해당 인덱스 위치에 자료를 저장하거나 검색하게 됨
- 해시 함수에 의해 인덱스 연산이 산술적으로 가능 O(1)
- 저장되는 메모리 구조를 해시테이블이라 함

- jdk 클래스 : HashMap, Properties

- 키는 중복 되지 않음. 나머지를 구하는게 해시함수(123%100해서 23번쨰 자리에 저장) 해시테이블
  
    ![img_9.png](img_9.png)

#### 체이닝
   ![img_12.png](img_12.png)


- 해시는 키에대한 밸류가 있다.
- 키는 유해서 키는 중복될 수 없다. 키만 알면 밸류를 꺼낼 수 없다. 해시는 들어가는 순서와 상관이 없다. 배열과 비슷하게 생겨서 많이 오해. 해시펑션에 의해 정해져서 순서랑은 무관하다.

#  배열(Array) 구현하기
## Array의 특징
- 동일한 데이터 타입을 순서에 따라 관리하는 자료 구조
- 정해진 크기가 있음
- 요소의 추가와 제거시 다른 요소들의 이동이 필요함
- 배열의 i 번째 요소를 찾는 인덱스 연산이 빠름
- jdk 클래스 : ArrayList, Vector

- MyArray.java
- MyArrayTest.java
- MyObjectArray.java

# 02. 연결 리스트 (LinkedList) 구현하기
## LinkedList 특징

- 동일한 데이터 타입을 순서에 따라 관리하는 자료 구조

- 자료를 저장하는 노드에는 자료와 다음 요소를 가리키는 링크(포인터)가 있음

- 자료가 추가 될때 노드 만큼의 메모리를 할당 받고 이전 노드의 링크로 연결함 (정해진 크기가 없음)

- 연결 리스트의 i 번째 요소를 찾는게 걸리는 시간은 요소의 개수에 비례 : O(n)

- jdk 클래스 : LinkedList

- MyListNode.java
- MyLinkedList.java
- MyLinkedListTest.java

# 03. 스택(Stack) 구현하기
##    Stack의 특징
- 맨 마지막 위치(top)에서만 자료를 추가,삭제, 꺼내올 수 있음 ( 중간의 자료를 꺼낼 수 없음)
- Last In First Out ( 후입선출 ) 구조
- 택배 상자가 쌓여있는 모양
- 가장 최근의 자료를 찾아오거나 게임에서 히스토리를 유지하고 이를 무를때 사용할 수 있음
- 함수의 메모리는 호출 순서에 따른 stack 구조
- jdk 클래스 : Stack
### 배열을 활용하여 Stack 구현하기

- MyArrayStack.java
- MyArrayStackTest.java

# 04. 큐(Queue) 구현하기
##   Queue의 특징
- 맨 앞(front) 에서 자료를 꺼내거나 삭제하고, 맨 뒤(rear)에서 자료를 추가 함
- Fist In First Out (선입선출) 구조
- 일상 생활에서 일렬로 줄 서 있는 모양
- 순차적으로 입력된 자료를 순서대로 처리하는데 많이 사용 되는 자료구조
- 콜센터에 들어온 문의 전화, 메세지 큐 등에 활용됨
- jdk 클래스 : ArrayList
#### 연결 리스트를 활용하여 Queue 구헌하기
- MyListQueue.java
- MyListQueueTest.java

- 개발자는 대충한다.
- 개발자를 하지않는다.
- 개발자를 잘하기 위해 공부한다. 


