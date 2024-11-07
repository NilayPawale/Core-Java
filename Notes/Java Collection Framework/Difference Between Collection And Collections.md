# Difference Between Collection And Collections In Java

- “Collection” and “Collections” look similar. 
- Both are part of java collection framework, but both serve different purpose. 
- Collection is a top level interface of java collection framework where as Collections is an utility class. 

## Collection Interface

- Collection is a root level interface of the Java Collection Framework. 
- Most of the classes in Java Collection Framework inherit from this interface. 
- List, Set and Queue are main sub interfaces of this interface. 
- JDK doesn’t provide any direct implementations of this interface. 
- But, JDK provides direct implementations of it’s sub interfaces. 
- ArrayList, Vector, HashSet, LinkedHashSet, PriorityQueue are some indirect implementations of Collection interface. 
- Map interface, which is also a part of java collection framework, doesn’t inherit from Collection interface. 
- Collection interface is a member of java.util package.

## Collections Class

- Collections is an utility class in java.util package. 
- It consists of only static methods which are used to operate on objects of type Collection. 
- For example, it has the method to find the maximum element in a collection, it has the method to sort the collection, it has the method to search for a particular element in a collection. 

- Below is the list of some important methods of Collections class.

| Methods | Description |
|:--------------:|:--------------:| 
| Collections.max() | This method returns maximum element in the specified collection. |
| Collections.min() | This method returns minimum element in the given collection. |
| Collections.sort() | This method sorts the specified collection. |
| Collections.shuffle() | This method randomly shuffles the elements in the specified collection. |
| Collections.synchronizedCollection() | This method returns synchronized collection backed by the specified collection. |
| Collections.binarySearch() | This method searches the specified collection for the specified object using binary search algorithm. |
| Collections.disjoint() | This method returns true if two specified collections have no elements in common. |
| Collections.copy() | This method copies all elements from one collection to another collection. |
| Collections.reverse() | This method reverses the order of elements in the specified collection. |
