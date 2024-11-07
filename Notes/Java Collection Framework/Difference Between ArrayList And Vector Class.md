# Difference Between ArrayList And Vector Class

1) Thread Safety

- This is the main difference between ArrayList and Vector class. 
- ArrayList class is not thread safety where as Vector class is thread safety. 
- Vector class is a synchronized class. 
- Only one thread can enter into Vector object at any moment of time during execution. 
- Where as ArrayList class is not synchronized. 
- Multiple threads can access ArrayList object simultaneously. 

2) Performance

- ArrayList has better performance compared to Vector. 
- It is because, Vector class is synchronized. 
- It makes the threads to wait for object lock to enter into vector object. 
- Where as ArrayList class is not synchronized. 
- Threads need not to wait for object lock to access ArrayList object. 
- This makes ArrayList faster than the Vector class.

3) Capacity Increment

- Whenever the size of the ArrayList exceeds it’s capacity, the capacity is increased by half of the current capacity. 
- Where as in case of Vector, the capacity is increased by Capacity Increment passed while creating the Vector object. 
- If Capacity increment is not passed, capacity will be doubled automatically when the size exceeds it’s capacity. 
- In ArrayList, there is no provision to pass Capacity increment while creating it. 
- It’s capacity is automatically increased by half of the current capacity whenever size exceeds capacity.

4) Size

- You can manually change the current size of the vector. 
- Vector class has a method called setSize(). 
- Using this method, you can change the current size of the vector. 
- If the new size is greater than the current size, new slots will be filled with null elements and if the new size is smaller than the current size, extra elements will be discarded. 
- But in case of ArrayList, you can’t change the current size manually. 
- It doesn’t have methods which alter it’s size. 
- The size of the ArrayList will be changed only when you add or delete it’s elements.

5) Traversing The Elements

- ArrayList elements can be traversed using Iterator, ListIterator and using either normal or advanced for loop. 
- But, vector elements can be traversed using Enumeration also along with these methods. 
- Vector class has a method called elements() which returns Enumeration object containing all elements of the vector. 
- Where as ArrayList does not have such methods.

6) Searching The Elements

- In ArrayList, you have to start searching for a particular element from the beginning of an Arralist. 
- But in the Vector, you can start searching for a particular element from a particular position in a vector. 
- This makes the search operation in Vector faster than in ArrayList.

7) Legacy Code

- Vector class is considered as Legacy code. 
- Because, it exist in Java before the introduction of Collection Framework. 
- Earlier it was not a part of Collections. 
- Later it has been included in Collections. 
- But, the older methods of vector class have been retained as it is.