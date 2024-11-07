# Different Ways Of Iterating An ArrayList

1) Iteration Using Normal for loop.

2) Iteration Using Iterator Object.

3) Iteration Using ListIterator Object.

4) Iteration Using Enhanced for loop.

## Iteration Using Normal for loop 

- This method is useful when you also need index of the elements along with the elements itself. 
- Using this method, you can also iterate a part of an ArrayList. Here is the template for this method.

```
for (int i = 0; i < list.size(); i++)
{
        type_of_element element = list.get(i);
}
```

## Iteration Using Iterator

- This method is useful when you don’t want index of an element, but you want to remove the elements as you iterate through an ArrayList.

```
while (iterator.hasNext())
{
    System.out.println(iterator.next());
 
    //Removing an element from ArrayList
    iterator.remove();
}
```

## Iteration Using ListIterator

- If you want to iterate the list in both the directions – forward and backward, then use the ListIterator method. 
- One more advantage of this method is, you can start iteration from a specific element in an ArrayList.

```
while (listIterator.hasNext() or listIterator.hasPrevious())
{
    System.out.println(listIterator.next());
 
        System.out.println(listIterator.previous());
}
```

## Iteration Using Enhanced for loop

- This method is useful when you don’t need indexes of elements and you just want to access the elements without removing them or modifying them (it is the most common case). 
- This method is also short and very easy to write.

```
for (type_of_element element : list)
{
    System.out.println(element);
}
```

Here is the program which implements all of the above four methods.

```
class ArrayListIteration
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("FIRST");
 
        list.add("SECOND");
 
        list.add("THIRD");
 
        list.add("FOURTH");
 
        list.add("FIFTH");
 
        //1. Using for loop
 
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
 
        //2. Using Iterator
 
        Iterator<String> it = list.iterator();
 
        while (it.hasNext())
        {
            System.out.println(it.next());
 
            //Removing an element from list
            it.remove();
        }
 
        //3. Using ListIterator
 
        ListIterator<String> listIt = list.listIterator();
 
        while (listIt.hasNext())
        {
            System.out.println(listIt.next());
        }
 
        //4. Using enhanced for loop
 
        for (String element : list)
        {
            System.out.println(element);
        }
    }
}
```