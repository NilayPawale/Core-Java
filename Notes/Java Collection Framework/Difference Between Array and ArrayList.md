# Difference Between Array and ArrayList

- Array and ArrayList are two important and most used data structures in Java. 
- Array is a basic data structure which is the part of Java from the beginning. 
- ArrayList is a class in Java Collection Framework which is introduced from JDK 1.2. 
- You can describe ArrayList as an advanced version of Array. 
- Because, array is a fixed length data structure. You can’t change its size once it is created. 
- To overcome this drawback of array, ArrayList is introduced in Java. 
- ArrayList automatically resizes itself when you add elements more than its capacity. 

1) Static Vs Dynamic

- Array is static in nature i.e its length is fixed. 
- You can’t change its size once it is created. 
- Where as ArrayList is dynamic in nature. 
- ArrayList is also called as dynamic array or re-sizable array. 
- Because, it automatically resizes itself if you try to add elements beyond its capacity.

2) How they are implemented?

- ArrayList internally uses an array to store its elements. 
- So, internal implementation of both array and ArrayList is almost the same. 
- The only difference is that when you try to add elements to ArrayList beyond its capacity, it creates the new array with increased size and copies the elements from old array to new array.

3) How they Perform?

- Both, array and ArrayList, give constant time performance for both add and get operations. 
- But, in case of ArrayList, if adding an element requires resizing of an ArrayList, then it gets slightly slower as it involves creating a new array in the background and copying all elements from old array to new array.

4) What they can hold?

- Array can hold both primitive data types (int, float….) as well as objects. 
- Where as ArrayList can hold only objects. 
- If you try to insert primitive data into ArrayList, data is automatically boxed into corresponding wrapper classes.

5) How they can be iterated?

- ArrayList provides iterators to iterate through its elements. 
- You can also use for loop or for-each loop to iterate an ArrayList. 
- But to iterate an array, you have to use either for loop or for-each loop.

6) How you can check their size?

- The size of an array can be checked using its attribute called length. 
- The ArrayList provides method called size() to check its size.

7) Type Safety : Compile Time Type Checking Vs Run Time Type Checking

- As ArrayList supports generics, it ensures the type safety during compilation itself. i.e the type of each element is checked at compile time. 
- If you try to add an incompatible element, compiler will show an error. 
- But, array does not support generics. 
- If you add an incompatible element into an array, compiler doesn’t show any error but you will get ArrayStoreException at run time. 
- That means it checks the type of each element at run time.

8) Are they multi-dimensional?

- Array is multi-dimensional. You can have one, two or three dimensional arrays. 
- But, ArrayList is one dimensional.

9) How do you add elements into them?

- The elements are inserted into ArrayList using add() method. 
- To insert elements into an array, we use assignment operator.

10) How do you manipulate their elements?

- ArrayList provides methods like get(), isEmpty(), contains(), indexOf(), replaceAll()…… to manipulate its elements. 
- Where as array doesn’t provide such methods.

## Differences Between Array And ArrayList In Java

| Array | ArrayList | 
|:--------------:|:--------------:| 
| Arrays are static in nature. Arrays are fixed length data structures. You can’t change their size once they are created. | ArrayList is dynamic in nature. Its size is automatically increased if you add elements beyond its capacity. | 
| Arrays can hold both primitives as well as objects. | ArrayList can hold only objects. | 
| Arrays can be iterated only through for loop or for-each loop. | ArrayList provides iterators to iterate through their elements. | 
| The size of an array is checked using length attribute. | The size of an ArrayList can be checked using size() method. | 
| Array gives constant time performance for both add and get operations. | ArrayList also gives constant time performance for both add and get operations provided adding an element doesn’t trigger resize. | 
| Arrays don’t support generics. | ArrayList supports generics. | 
| Arrays are not type safe. | ArrayList are type safe. | 
| Arrays can be multi-dimensional. | ArrayList can’t be multi-dimensional. | 
| Elements are added using assignment operator. | Elements are added using add() method. | 






