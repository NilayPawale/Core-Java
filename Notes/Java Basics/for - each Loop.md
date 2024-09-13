- for-each loop in java is the enhanced version of for loop. 
- It is introduced from JDK 5. 
- It is used to iterate all elements of an array or Collection.

## Syntax Of for-each Loop

The syntax of for-each loop is as follows,
```
for(Data_Type variable : array or collection)
{
 
}
```

Where, Data_Type specifies type and variable specifies iteration variable.

## How for-each loop works

- The iteration variable in the for-each loop receives every element of an array or collection one at a time starting from first element to last element. i.e In the first iteration, it gets the first element. 
- In the second iteration, it gets the second element and so on. Thus it iterates all elements of an array or the collection. 
- The type of iteration variable must be compatible with the type of array or collection.


## Example of for-each loop which iterates an array 

```
public class ForEachLoop
{
    public static void main(String[] args)
    {
        //An array of strings
        String[] str = {"First", "Second", "Third", "Fourth", "Fifth"};
 
        //iterating every element of str using for-each loop
        for (String s : str)
        {
            System.out.println(s);
        }
    }
}
```

Output :
```
First
Second
Third
Fourth
Fifth
```

## Example of for-each loop which iterates the collection 

```
public class ForEachLoop
{
    public static void main(String[] args)
    {
        //An ArrayList of strings
        ArrayList<String> list = new ArrayList<String>();
 
        //Adding elements to ArrayList
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
 
        //iterating every element of list using for-each loop
        for (String s : list)
        {
            System.out.println(s);
        }
    }
}
```

Output :
```
First
Second
Third
Fourth
```

## Nested for-each Loop 

for-each loop can be nested like normal for loop. Here is the example for Nested for-each loop which iterates two dimensional array.

```
public class ForEachLoop
{
    public static void main(String[] args)
    {
        //Two Dimensional Array
        int[][] twoDArray = { {1, 2, 3, 4}, {5, 6, 7, 8} };
 
        //iterating every element of twoDArray using for-each loop
        for (int[] oneDArray : twoDArray)
        {
            System.out.print("[");
 
            //iterating every element of oneDArray using for-each loop
            for (int i : oneDArray)
            {
                System.out.print(i+"\t");
            }
            System.out.println("]");
        }
    }
}
```

Output :
```
[1 2 3 4 ]
[5 6 7 8 ]
```

## Advantages of for-each loop 
- You need not to specify the initialization, condition and increment or decrement as you specify in the normal for loop.
- It increases the readability of the code.

## Disadvantages Of for-each loop 

You can’t iterate only few elements of an array or collection using for-each loop.