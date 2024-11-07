# Deque Interface

- The Deque is the short name for “Double Ended Queue“. 
- As the name suggest, Deque is a linear collection of objects which supports insertion and removal of elements from both the ends. 
- The Deque interface defines the methods needed to insert, retrieve and remove the elements from both the ends.
- The Deque interface is introduced in Java SE 6. 
- It extends Queue interface. 

Here is the hierarchy diagram of Deque interface.

![alt text](image-13.png)

- The main advantage of Deque is that you can use it as both Queue (FIFO) as well as Stack (LIFO). 
- The Deque interface has all those methods required for FIFO and LIFO operations. 
- Some of those methods throw an exception if operation is not possible and some methods return a special value (null or false) if operation fails. 

## Deque Methods

| Operation             | Throws an exception if operation fails. | Returns null or false if operation fails. |
|:---------------------:|:---------------------------------------:|:----------------------------------------:|
| **Insertion**          |                                         |                                          |
| Front End              | addFirst()                              | offerFirst()                             |
| Rear End               | addLast()                               | offerLast()                              |
| **Retrieval**          |                                         |                                          |
| Front End              | getFirst()                              | peekFirst()                              |
| Rear End               | getLast()                               | peekLast()                               |
| **Retrieval And Removal** |                                      |                                          |
| Front End              | removeFirst()                           | pollFirst()                              |
| Rear End               | removeLast()                            | pollLast()                               |


## How Deque Works ?

- Deque is nothing but the double ended queue. 
- That means, you can insert, retrieve and remove the elements from both the ends. 

![alt text](image-14.png)


## Deque As Queue

- As Deque interface extends Queue interface, it inherits all methods of Queue interface. 
- So, you can use all those inherited methods to perform Queue operations. 
- Along with them, methods defined in the Deque interface can also be used for Queue operations. 
- Below is the list of Queue methods and their equivalent Deque methods.

| Queue Methods | Equivalent Deque Methods |
|:-------------:|:------------------------:|
| add()         | addLast()                |
| offer()       | offerLast()              |
| element()     | getFirst()               |
| peek()        | peekFirst()              |
| remove()      | removeFirst()            |
| poll()        | pollFirst()              |


## Deque As Stack

- Deque interface has two more methods – pop() and push(). 
- These two methods make Deque to function as a stack (Last-In-First-Out). 
- Along with these two methods, you can also use addFirst(), peekFirst() and removeFirst() for stack operations. 
- Below is the list of Stack methods and their equivalent methods of Deque.

| Stack Methods | Equivalent Deque Methods |
|:-------------:|:------------------------:|
| push()        | addFirst()               |
| pop()         | removeFirst()            |
| peek()        | peekFirst()              |


## Properties Of Deque

1) Null Elements

- Unlike Queue, Deque can have null elements. 
- But, it is recommended not to insert null elements as many methods return null to indicate Deque is empty.

2) Duplicate Elements

- Deque can have duplicate elements.

3) Random Access

- You can’t set or get or insert the elements at an arbitrary position of Deque. i.e Random access is not possible with the Deque.

4) Delete Elements

- You can use removeFirstOccurrenec(E e), removeLastOccurrence(E e) and remove(E e) methods to delete the elements from the Deque.

