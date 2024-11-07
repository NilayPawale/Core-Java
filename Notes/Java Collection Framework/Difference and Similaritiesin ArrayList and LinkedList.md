# Differences and Similarities in ArrayList and LinkedList

## Differences Between ArrayList And LinkedList

| Parameter | ArrayList | LinkedList |
|:--------------:|:--------------:|:--------------:|
| Structure | ArrayList is an index based data structure where each element is associated with an index. | Elements in the LinkedList are called as nodes, where each node consists of three things – Reference to previous element, Actual value of the element and Reference to next element. |
| Insertion And Removal | 
- Insertions and Removals in the middle of the ArrayList are very slow. Because after each insertion and removal, elements need to be shifted.
- Insertion and removal operations in ArrayList are of order O(n). | 
- Insertions and Removals from any position in the LinkedList are faster than the ArrayList. Because there is no need to shift the elements after every insertion and removal. Only references of previous and next elements are to be changed.
- Insertion and removal in LinkedList are of order O(1). |
| Retrieval(Searching or getting an element) | 
- Retrieval of elements in the ArrayList is faster than the LinkedList . Because all elements in ArrayList are index based.
- Retrieval operation in ArrayList is of order of O(1). | 
- Retrieval of elements in LinkedList is very slow compared to ArrayList. Because to retrieve an element, you have to traverse from beginning or end (Whichever is closer to that element) to reach that element.
- Retrieval operation in LinkedList is of order of O(n). |
| Random Access | ArrayList is of type Random Access. i.e elements can be accessed randomly. | LinkedList is not of type Random Access. i.e elements can not be accessed randomly. you have to traverse from beginning or end to reach a particular element. |
| Usage | ArrayList can not be used as a Stack or Queue. | LinkedList, once defined, can be used as ArrayList, Stack, Queue, Singly Linked List and Doubly Linked List. |
| Memory Occupation | ArrayList requires less memory compared to LinkedList. Because ArrayList holds only actual data and it’s index. | LinkedList requires more memory compared to ArrayList. Because, each node in LinkedList holds data and reference to next and previous elements. |
| When To Use | 	If your application does more retrieval than the insertions and deletions, then use ArrayList. | If your application does more insertions and deletions than the retrieval, then use LinkedList. |


## Similarities Between ArrayList And LinkedList

- Both ArrayList and LinkedList implement List interface.
- Both ArrayList and LinkedList are Cloneable and Serializable.
- Both ArrayList and LinkedList maintain insertion order.
- Both are non synchronized.