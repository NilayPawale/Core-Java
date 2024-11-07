# Difference Between Iterator And ListIterator

- Iterator and ListIterator are two interfaces in Java collection framework which are used to traverse the collections. 
- Although ListIterator extends Iterator, there are some differences in the way they traverse the collections.

1) Traversing

- Using Iterator, you can traverse List, Set and Queue type of objects. 
- But using ListIterator, you can traverse only List objects. 
- In Set and Queue types, there is no method to get the ListIterator object. 
- But, In List types, there is a method called listIterator() which returns ListIterator object.

```
class IteratorAndListIterator
{
    public static void main(String[] args)
    {
        List list = new ArrayList();
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
 
        //Traversing list elements using Iterator
        Iterator iterator1 = list.iterator();
 
        while (iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }
 
        Queue queue = new PriorityQueue(list);
 
        //Traversing queue elements using Iterator
        Iterator iterator2 = queue.iterator();
 
        while (iterator2.hasNext())
        {
            System.out.println(iterator2.next());
        }
 
        Set set = new HashSet(list);
 
        //Traversing set elements using Iterator
        Iterator iterator3 = set.iterator();
 
        while (iterator3.hasNext())
        {
            System.out.println(iterator3.next());
        }
 
        //Traversing list elements using ListIterator
        ListIterator listIterator1 = list.listIterator();
 
        while (listIterator1.hasNext())
        {
            System.out.println(listIterator1.next());
        }
 
        //Traversing queue and set elements using ListIterator is not possible
 
        ListIterator listIterator2 = queue.listIterator();    //Compile time error, there is no such method in Queue
 
        ListIterator listIterator3 = set.listIterator();     //Compile time error, there is no such method in Set
    }
}
```

2) Traversing in Forward and Backward Direction

- Using Iterator, we can traverse the elements only in forward direction. 
- But, using ListIterator you can traverse the elements in both the directions – forward and backward. 
- ListIterator has those methods to support the traversing of elements in both the directions.

###### Iterator Methods

- boolean hasNext() –> Checks whether collection has more elements.

- E next()  –> Returns the next element in the collection.

- void remove()  –> Removes the current element in the collection i.e element returned by next().

###### ListIterator Methods 

- boolean hasNext() –> Checks whether the list has more elements when traversing the list in forward direction.

- boolean hasPrevious() –> Checks whether list has more elements when traversing the list in backward direction.

- E next()  –> Returns the next element in the list and moves the cursor forward.

- E previous()  –> Returns the previous element in the list and moves the cursor backward.

- int nextIndex() –> Returns index of the next element in the list.

- int previousIndex() –> Returns index of the previous element in the list.

- void remove()  –> Removes the current element in the collection i.e element returned by next() or previous().

- void set(E e) –> Replaces the current element i.e element returned by next() or previous() with the specified element.

- void add(E e) –> Inserts the specified element in the list.

```
class IteratorAndListIterator
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
 
        list.add("FIRST");
 
        list.add("SECOND");
 
        list.add("THIRD");
 
        //Traversing list elements in forward direction using Iterator
 
        Iterator iterator = list.iterator();
 
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
 
        //      OUTPUT :
        //      FIRST
        //      SECOND
        //      THIRD
 
        //Traversing list elements in forward direction using ListIterator
 
        ListIterator listIterator = list.listIterator();
 
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
 
        //      OUTPUT :
        //      FIRST
        //      SECOND
        //      THIRD
 
        //Traversing list elements in backward direction using ListIterator
 
        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
 
        //      OUTPUT :
        //      THIRD
        //      SECOND
        //      FIRST
    }
}
```

3) Index of next and previous elements

- Using ListIterator, you can obtain index of next and previous elements. 
- But, it is not possible with Iterator interface.

```
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
 
class IteratorAndListIterator
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
 
        list.add("FIRST");
 
        list.add("SECOND");
 
        list.add("THIRD");
 
        ListIterator listIterator = list.listIterator();
 
        while (listIterator.hasNext())
        {
            //Getting index of next element
 
            System.out.println(listIterator.nextIndex()+" : "+listIterator.next());
        }
 
        //      OUTPUT :
        //      0 : FIRST
        //      1 : SECOND
        //      2 : THIRD
 
        while (listIterator.hasPrevious())
        {
            //Getting index of previous element
 
            System.out.println(listIterator.previousIndex()+" : "+listIterator.previous());
        }
 
        //      OUTPUT :
        //      2 : THIRD
        //      1 : SECOND
        //      0 : FIRST
    }
}
```

4) Performing modifications(insert, replace, remove)

- Using ListIterator, you can perform modifications(insert, replace, remove) on the list. 
- But, using Iterator you can only remove the elements from the collection.

```
class IteratorAndListIterator
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
 
        list.add("FIRST");
 
        list.add("SECOND");
 
        list.add("THIRD");
 
        ListIterator<String> listIterator = list.listIterator();
 
        System.out.println(list);       //Output :  [FIRST, SECOND, THIRD]
 
        while (listIterator.hasNext())
        {
            listIterator.next();
 
            //Modifying an element returned by next()
            listIterator.set("MODIFIED");
        }
 
        System.out.println(list);       //Output :  [MODIFIED, MODIFIED, MODIFIED]
 
        Iterator<String> iterator = list.iterator();
 
        while (iterator.hasNext())
        {
            iterator.next();
 
            //Removing an element
            iterator.remove();
        }
 
        System.out.println(list);    //Output : []
    }
}
```

5) Iterate from the specified index

- Using ListIterator, you can iterate a list from the specified index. 
- It is not possible with Iterator.

```
class IteratorAndListIterator
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
 
        list.add("FIRST");
 
        list.add("SECOND");
 
        list.add("THIRD");
 
        list.add("FOURTH");
 
        list.add("FIFTH");
 
        //Iterating list from index 2 using ListIterator
 
        ListIterator<String> listIterator = list.listIterator(2);
 
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
 
        //      OUTPUT :
        //      THIRD
        //      FOURTH
        //      FIFTH
    }
}
```
