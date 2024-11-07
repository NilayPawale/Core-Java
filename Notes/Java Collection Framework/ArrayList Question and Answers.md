# ArrayList Question and Answers

1) Explain the different ways of constructing an ArrayList?

ArrayList can be created in 3 ways.

- ArrayList() —> It creates an empty ArrayList with initial capacity of 10.

- ArrayList(int initialCapacity) —> It creates an empty ArrayList with supplied initial capacity.

- ArrayList(Collection c) —> It creates an ArrayList containing the elements of the supplied collection.

```
public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();            //First Method
 
        ArrayList<String> list2 = new ArrayList<String>(20);         //Second Method
 
        ArrayList<Integer> list3 = new ArrayList<Integer>(list1);      //Third Method
    }
}
```

2) How do you increase the current capacity of an ArrayList?

- ensureCapacity() method is used to increase the current capacity of an ArrayList. 
- However, capacity of an ArrayList is automatically increased when we try to add more elements than the current capacity. 
- To manually increase the current capacity, ensureCapacity() method is used.

```
public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        //Now 'list' can hold 10 elements (Default Initial Capacity)
 
        list.ensureCapacity(20);
 
        //Now 'list' can hold 20 elements.
    }
}
```

3) How do you decrease the current capacity of an ArrayList to the current size?

- trimToSize() method is used to trim the capacity of arrayList to the current size of ArrayList. 
- We use this method to minimize the storage area of an ArrayList.

```
public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        //Now 'list' can hold 10 elements (Default Initial Capacity)
 
        list.ensureCapacity(20);
 
        //Now 'list' can hold 20 elements.
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
 
        list.add("FOUR");
 
        //reducing the current capacity to current size of an ArrayList.
 
        list.trimToSize();
    }
}
```

4) How do you find the number of elements present in an ArrayList?

- Using size() method. 
- size() method returns number of elements present in an ArrayList.

```
public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<Double> list = new ArrayList<Double>();
 
        list.add(1.1);
 
        list.add(2.2);
 
        list.add(3.3);
 
        list.add(4.4);
 
        list.add(5.5);
 
        System.out.println(list);     //Output : [1.1, 2.2, 3.3, 4.4, 5.5]
 
        System.out.println("Size Of ArrayList = "+list.size());   //Output : Size Of ArrayList = 5
    }
}
```

5) How do you find out whether the given ArrayList is empty or not?

- isEmpty() method of ArrayList is used to check whether the given ArrayList is empty or not. 
- This method returns true if an ArrayList contains no elements otherwise returns false.

```
public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<Double> list = new ArrayList<Double>();
 
        System.out.println(list.isEmpty());    //Output : true
    }
}
```

- Note : You can also use size() method to check whether the given ArrayList is empty or not. size() method returns ‘0’ if an ArrayList is empty.

6) How do you check whether the given element is present in an ArrayList or not?

- Using contains() method of ArrayList, we can examine whether the ArrayList contains the given element or not. 
- This method returns true if ArrayList has that element otherwise returns false.

```
public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<Double> list = new ArrayList<Double>();
 
        list.add(1.1);
 
        list.add(11.11);
 
        list.add(111.111);
 
        list.add(1111.1111);
 
        //Checking whether list conatins '111.1111'
 
        System.out.println(list.contains(111.1111));    //Output : false
    }
}
```

7) How do you get the position of a particular element in an ArrayList?

- We can use indexOf() and lastIndexOf() methods to find out the position of a given element in an ArrayList. 
- indexOf() method returns index of first occurrence of a specified element where as lastIndexOf() method returns index of last occurrence of a specified element in an ArrayList. 
- If element is not found, they will return -1.

```
public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("JAVA");
 
        list.add("J2EE");
 
        list.add("JSP");
 
        list.add("JAVA");
 
        list.add("SERVLETS");
 
        list.add("JAVA");
 
        list.add("STRUTS");
 
        System.out.println(list);     //Output : [JAVA, J2EE, JSP, JAVA, SERVLETS, JAVA, STRUTS]
 
        //Getting the index of first occurrence of "JAVA"
 
        System.out.println(list.indexOf("JAVA"));     //Output : 0
 
        //Getting the index of last occurrence of "JAVA"
 
        System.out.println(list.lastIndexOf("JAVA"));    //Output : 5
    }
}
```

8) How do you convert an ArrayList to Array?

- Using toArray() method of ArrayList class. 
- toArray() method returns an array containing all elements of the ArrayList. 
- This method acts as a bridge between normal arrays and collection framework in java.

```
public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("JAVA");
 
        list.add("J2EE");
 
        list.add("JSP");
 
        list.add("SERVLETS");
 
        list.add("STRUTS");
 
        System.out.println(list);      //Output : [JAVA, J2EE, JSP, SERVLETS, STRUTS]
 
        //getting an array containing all elements of the list.
 
        Object[] array = list.toArray();
 
        //Printing the elements of the returned array.
 
        for (Object object : array)
        {
            System.out.println(object);
        }
 
//      Output :
 
//      JAVA
//      J2EE
//      JSP
//      SERVLETS
//      STRUTS
    }
}
```

9) How do you retrieve an element from a particular position of an ArrayList?

- get() method returns an element from a specified position of an ArrayList. 
- This method takes index of the element as an argument.

```
public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
 
        list.add(111);
 
        list.add(222);
 
        list.add(333);
 
        list.add(444);
 
        System.out.println(list);     //Output : [111, 222, 333, 444]
 
        //Getting element at index 3
 
        System.out.println(list.get(3));    //Output : 444
 
        //Getting element at index 1
 
        System.out.println(list.get(1));    //Output : 222
    }
}
```

10) How do you replace a particular element in an ArrayList with the given element?

- set() method replaces a particular element in an Arraylist with the given element. 
- This method takes two arguments. 
- One is the index of the element to be replaced and another one is the element to be placed at that position.

```
public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
 
        list.add(111);
 
        list.add(222);
 
        list.add(333);
 
        list.add(444);
 
        System.out.println(list);     //Output : [111, 222, 333, 444]
 
        //Replacing the element at index 1 with '000'
 
        list.set(1, 000);
 
        //Replacing the element at index 3 with '000'
 
        list.set(3, 000);
 
        System.out.println(list);   //Output : [111, 0, 333, 0]
    }
}
```

11) How do you append an element at the end of an ArrayList?

- add() method appends an element at the end of an ArrayList.

```
public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
 
        list.add("FOUR");
 
        System.out.println(list);     //Output : [ONE, TWO, THREE, FOUR]
    }
}
```

12) How do you insert an element at a particular position of an ArrayList?

- add() method which takes index and an element as arguments can be used to insert an element at a particular position of an ArrayList. 
- The elements at the right side of that position are shifted one position right i.e indices of right side elements of that position are increased by 1.

```
public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
 
        list.add("FOUR");
 
        System.out.println(list);     //Output : [ONE, TWO, THREE, FOUR]
 
        //Inserting "AAA" at index 1
 
        list.add(1, "AAA");
 
        //Inserting "BBB" at index 3
 
        list.add(3, "BBB");
 
        System.out.println(list);    //Output : [ONE, AAA, TWO, BBB, THREE, FOUR]
    }
}
```

13) How do you remove an element from a particular position of an ArrayList?

- remove() method which takes int type as an argument is used to remove an element from a particular position of an ArrayList.

```
public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("AAA");
 
        list.add("BBB");
 
        list.add("ccc");
 
        list.add("DDD");
 
        list.add("e");
 
        System.out.println(list);     //Output : [AAA, BBB, ccc, DDD, e]
 
        //Removing an element from position 2
 
        list.remove(2);
 
        System.out.println(list);    //Output : [AAA, BBB, DDD, e]
 
        //Removing an element from position 3
 
        list.remove(3);
 
        System.out.println(list);   //Output : [AAA, BBB, DDD]
    }
}
```

14) How do you remove the given element from an ArrayList?

- remove(Object obj) method removes the first occurrence of the specified element ‘obj‘. If that element doesn’t exist, ArrayList will be unchanged.

```
public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("AAA");
 
        list.add("BBB");
 
        list.add("AAA");
 
        list.add("CCC");
 
        list.add("BBB");
 
        System.out.println(list);     //Output : [AAA, BBB, AAA, CCC, BBB]
 
        //Removing first occurrence of "AAA"
 
        list.remove("AAA");
 
        System.out.println(list);    //Output : [BBB, AAA, CCC, BBB]
 
        //Removing first occurrence of "BBB"
 
        list.remove("BBB");
 
        System.out.println(list);   //Output : [AAA, CCC, BBB]
    }
}
```

15) How do you remove all elements of an ArrayList at a time?

- clear() method removes all elements of an ArrayList. ArrayList will be empty after this method is executed.

```
public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("AAA");
 
        list.add("BBB");
 
        list.add("AAA");
 
        list.add("CCC");
 
        list.add("BBB");
 
        System.out.println(list);     //Output : [AAA, BBB, AAA, CCC, BBB]
 
        //Removing all elements of the list
 
        list.clear();
 
        System.out.println(list);    //Output : []
    }
}
```

16) How do you retrieve a portion of an ArrayList?

- Using subList() method of ArrayList, we can retrieve a portion of an ArrayList. 
- subList() method returns a view of a portion of an ArrayList in the given range. 
- The returned subList is backed by original ArrayList. 
- That means any changes made to subList will be reflected in original ArrayList or Vice-Versa.

```
public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
 
        list.add(111);
 
        list.add(222);
 
        list.add(333);
 
        list.add(444);
 
        list.add(555);
 
        list.add(666);
 
        System.out.println(list);     //Output : [111, 222, 333, 444, 555, 666]
 
        //Retrieving a SubList
 
        List<Integer> subList = list.subList(1, 4);
 
        System.out.println(subList);    //Output : [222, 333, 444]
 
        //Modifying the list
 
        list.set(2, 000);
 
        //Changes will be reflected in subList
 
        System.out.println(subList);    //Output : [222, 0, 444]
 
        //Modifying the subList
 
        subList.set(2, 000);
 
        //Changes will be reflected in list
 
        System.out.println(list);    //Output : [111, 222, 0, 0, 555, 666]
    }
}
```

17) How do you join two ArrayLists?

- We can use addAll() method which takes Collection type as an argument to join two ArrayLists. 
- This method appends all elements of the passed collection to the end of the invoking collection.

```
public class MainClass
{
    public static void main(String[] args)
    {   
        ArrayList<Integer> list1 = new ArrayList<Integer>();
         
        list1.add(111);
         
        list1.add(222);
         
        list1.add(333);
         
        list1.add(444);
         
        System.out.println(list1);     //Output : [111, 222, 333, 444]
         
        ArrayList<Integer> list2 = new ArrayList<Integer>();
         
        list2.add(555);
         
        list2.add(666);
         
        list2.add(777);
         
        list2.add(888);
 
        System.out.println(list2);    //Output : [555, 666, 777, 888]
         
        //Joining list1 and list2
         
        list1.addAll(list2);
         
        System.out.println(list1);    //Output : [111, 222, 333, 444, 555, 666, 777, 888]
    }
}
```

18) How do you insert more than one element at a particular position of an ArrayList?

- Another version of addAll() method which takes two arguments, one is index and another one is Collection type, can be used for this requirement. 
- This method inserts all of the elements of passed collection at a specified position of an ArrayList.

```
public class MainClass
{
    public static void main(String[] args)
    {   
        ArrayList<Integer> list1 = new ArrayList<Integer>();
         
        list1.add(111);
         
        list1.add(222);
         
        list1.add(333);
         
        list1.add(444);
         
        System.out.println(list1);     //Output : [111, 222, 333, 444]
         
        ArrayList<Integer> list2 = new ArrayList<Integer>();
         
        list2.add(555);
         
        list2.add(666);
         
        list2.add(777);
         
        list2.add(888);
 
        System.out.println(list2);    //Output : [555, 666, 777, 888]
         
        //Inserting all elements of list2 at index 2 of list1
         
        list1.addAll(2, list2);
         
        System.out.println(list1);    //Output : [111, 222, 555, 666, 777, 888, 333, 444]
    }
}
```
