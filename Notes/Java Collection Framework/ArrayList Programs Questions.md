# ArrayList Program Questions

1. How To Reverse An ArrayList in Java

2. How To Sort An ArrayList in Java

3. How To Remove Duplicate Elements From ArrayList in Java

## How To Reverse An ArrayList In Java

- The given ArrayList can be reversed using Collections.reverse() method. 
- Collections class is an utility class in java.util package which provides many useful methods to operate on Collection classes. 
- Collections.reverse() method reverses the elements of the given ArrayList in linear time i.e it has the time complexity of O(n). 
- Collections.reverse() method takes List type as an argument. 
- So you can use this method to reverse any List type like ArrayList, LinkedList or Vector. 

Below is the program to reverse an ArrayList in Java.

```
import java.util.ArrayList;
import java.util.Collections;
 
public class ReverseArrayListExample
{
    public static void main(String[] args) 
    {
        //Constructing an ArrayList
         
        ArrayList<String> list = new ArrayList<String>();
                 
        list.add("Gold");
         
        list.add("Iron");
         
        list.add("Copper");
         
        list.add("Silver");
         
        list.add("Nickel");
         
        list.add("Cobalt");
         
        list.add("Zinc");
         
        //Printing list before reverse
         
        System.out.println("ArrayList Before Reverse :");
         
        System.out.println(list);
         
        //Reversing the list using Collections.reverse() method
         
        Collections.reverse(list);
         
        //Printing list after reverse
         
        System.out.println("ArrayList After Reverse :");
         
        System.out.println(list);
    }
}
```

Output
```
ArrayList Before Reverse :
[Gold, Iron, Copper, Silver, Nickel, Cobalt, Zinc]
ArrayList After Reverse :
[Zinc, Cobalt, Nickel, Silver, Copper, Iron, Gold]
```

## How To Sort An ArrayList In Java

- To sort an ArrayList, we use sort() method of Collections class. 
- Collections class is an utility class in java.util package consisting of many useful methods.  
- Collections.sort() method has two overloaded forms. 

- They are,

1. sort(List<T> list)  :  This method sorts the specified list according to natural ordering of its elements.

2. sort(List<T> list, Comparator<? super T> c)  : This method sorts the specified list according to supplied Comparator.


1. How To Sort An ArrayList Of Strings

- In this example, we are sorting an ArrayList of strings using first form of Collections.sort() method. 
- This example sorts the string elements while considering the case of the elements.

```
import java.util.ArrayList;
import java.util.Collections;
 
public class ListSorting 
{       
    public static void main(String[] args) 
    {
        //Creating an ArrayList of strings
         
        ArrayList<String> list = new ArrayList<String>();
         
        //Adding elements to list
         
        list.add("Virat");
         
        list.add("rohit");
         
        list.add("Shikar");
         
        list.add("ashwin");
         
        list.add("ravindra");
         
        list.add("Bhargav");
         
        System.out.println("ArrayList Before Sorting :");
         
        System.out.println(list);
         
        //Sorting the list
         
        Collections.sort(list);
         
        System.out.println("ArrayList After Sorting :");
         
        System.out.println(list);
    }   
}
```

Output
```
ArrayList Before Sorting :
[Virat, rohit, Shikar, ashwin, ravindra, Bhargav]
ArrayList After Sorting :
[Bhargav, Shikar, Virat, ashwin, ravindra, rohit]
```

2) How To Sort An ArrayList Of Strings While Ignoring The Case

- To sort an ArrayList of strings while ignoring the case of the elements, we use second form of the Collections.sort() method which takes two arguments. 
- One is the list to be sorted and another one is the Comparator. 
- We pass String.CASE_INSENSITIVE_ORDER as Comparator here. 
- This Comparator ignores the case of the string elements.

```
import java.util.ArrayList;
import java.util.Collections;
 
public class ListSorting 
{       
    public static void main(String[] args) 
    {
        //Creating an ArrayList of strings
         
        ArrayList<String> list = new ArrayList<String>();
         
        //Adding elements to list
         
        list.add("Virat");
         
        list.add("rohit");
         
        list.add("Shikar");
         
        list.add("ashwin");
         
        list.add("ravindra");
         
        list.add("Bhargav");
         
        System.out.println("ArrayList Before Sorting :");
         
        System.out.println(list);
         
        //Sorting the list by ignoring the case
         
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
         
        System.out.println("ArrayList After Sorting :");
         
        System.out.println(list);
    }   
}
```

Output
```
ArrayList Before Sorting :
[Virat, rohit, Shikar, ashwin, ravindra, Bhargav]
ArrayList After Sorting :
[ashwin, Bhargav, ravindra, rohit, Shikar, Virat]
```

3) How To Sort An ArrayList Of Custom Objects

- In this example, we sort an ArrayList of Student objects. 
- To do this, Student class must implement Comparable interface and override compareTo() method like below.

```
import java.util.ArrayList;
import java.util.Collections;
 
//Student class implementing Comparable interface
 
class Student implements Comparable<Student>
{
    int id;
     
    String name;
     
    int percentage;
     
    public Student(int id, String name, int percentage)
    {
        this.id = id;
         
        this.name = name;
         
        this.percentage = percentage;
    }
     
    @Override
    public int compareTo(Student s)
    {
        return this.id - s.id;     //Sorts the objects in ascending order
         
        // return s.id - this.id;    //Sorts the objects in descending order
    }
     
    @Override
    public String toString()
    {
        return "{ID : "+id+", Name : "+name+", Percentage : "+percentage+"}";
    }
}
 
public class MainClass 
{       
    public static void main(String[] args) 
    {
        //Creating an ArrayList of Student objects
         
        ArrayList<Student> listOfStudents = new ArrayList<Student>();
         
        //Adding students to listOfStudents
         
        listOfStudents.add(new Student(123, "Student1", 62));
         
        listOfStudents.add(new Student(231, "Student2", 81));
         
        listOfStudents.add(new Student(85, "Student3", 79));
         
        listOfStudents.add(new Student(478, "Student4", 94));
         
        listOfStudents.add(new Student(365, "Student5", 62));
         
        System.out.println("listOfStudents Before Sorting :");
         
        System.out.println(listOfStudents);
         
        //Sorting the listOfStudents
         
        Collections.sort(listOfStudents);
         
        System.out.println("listOfStudents After Sorting :");
         
        System.out.println(listOfStudents);
    }   
}
```

Output
```
listOfStudents Before Sorting :
[{ID : 123, Name : Student1, Percentage : 62}, {ID : 231, Name : Student2, Percentage : 81}, {ID : 85, Name : Student3, Percentage : 79}, {ID : 478, Name : Student4, Percentage : 94}, {ID : 365, Name : Student5, Percentage : 62}]
listOfStudents After Sorting :
[{ID : 85, Name : Student3, Percentage : 79}, {ID : 123, Name : Student1, Percentage : 62}, {ID : 231, Name : Student2, Percentage : 81}, {ID : 365, Name : Student5, Percentage : 62}, {ID : 478, Name : Student4, Percentage : 94}]
```

4) How To Sort An ArrayList In The Reverse Order

- You can sort the list in the reverse order also by passing the Comparator returned by Collections.reverseOrder() as Comparator to Collections.sort() method.

```
import java.util.ArrayList;
import java.util.Collections;
 
public class MainClass 
{       
    public static void main(String[] args) 
    {
        //Creating an ArrayList of integers
         
        ArrayList<Integer> list = new ArrayList<Integer>();
         
        //Adding elements to list
         
        list.add(1452);
         
        list.add(6854);
         
        list.add(8741);
         
        list.add(6542);
         
        list.add(3845);
         
        System.out.println("ArrayList Before Sorting :");
         
        System.out.println(list);
         
        //Sorting the list in the reverse order
         
        Collections.sort(list, Collections.reverseOrder());
         
        System.out.println("ArrayList Sorted In The Reverse Order :");
         
        System.out.println(list);
    }   
}
```

Output
```
ArrayList Before Sorting :
[1452, 6854, 8741, 6542, 3845]
ArrayList Sorted In The Reverse Order :
[8741, 6854, 6542, 3845, 1452]
```

## How To Remove Duplicate Elements From ArrayList

- ArrayList is one of the most used Collection type in java. 
- It gives the flexibility of adding multiple null elements, duplicate elements and also maintains the insertion order of elements. 
- While coding, you often come across the requirement where you have to remove duplicate elements from already constructed ArrayList. 

1) Removing Duplicate Elements From ArrayList Using HashSet

- In this method, we use HashSet to remove duplicate elements from an ArrayList. 
- As we know, HashSet doesn’t allow duplicate elements. 
- We use this property of HashSet to remove duplicate elements from already constructed ArrayList. 
- But, there is one disadvantage of this method. 
- That is, it erases the insertion order of ArrayList elements. 
- That means, after removing the duplicate elements, elements will not be in the insertion order. 

```
import java.util.ArrayList;
import java.util.HashSet;
 
public class MainClass
{
    public static void main(String[] args)
    {
        //Constructing An ArrayList
 
        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("J2EE");
 
        listWithDuplicateElements.add("JSP");
 
        listWithDuplicateElements.add("SERVLETS");
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("STRUTS");
 
        listWithDuplicateElements.add("JSP");
 
        //Printing listWithDuplicateElements
 
        System.out.print("ArrayList With Duplicate Elements :");
 
        System.out.println(listWithDuplicateElements);
 
        //Constructing HashSet using listWithDuplicateElements
 
        HashSet<String> set = new HashSet<String>(listWithDuplicateElements);
 
        //Constructing listWithoutDuplicateElements using set
 
        ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);
 
        //Printing listWithoutDuplicateElements
 
        System.out.print("ArrayList After Removing Duplicate Elements :");
 
        System.out.println(listWithoutDuplicateElements);
    }
}
```

Output
```
ArrayList With Duplicate Elements :[JAVA, J2EE, JSP, SERVLETS, JAVA, STRUTS, JSP]
ArrayList After Removing Duplicate Elements :[JAVA, SERVLETS, JSP, J2EE, STRUTS]
```

- You notice the output of the above example. 
- Elements are shuffled after duplicate elements are removed. 
- They are not in the insertion order. 
- If you want insertion order of elements to be maintained even after removing the duplicate elements, then this method is not recommended. 
- There is another method exist which doesn’t alter the insertion order of elements even after removing the duplicate elements i.e. using LinkedHashSet.

## Removing Duplicate Elements From ArrayList Using LinkedHashSet

- In this method, we use LinkedHashSet to remove duplicate elements from ArrayList. 
- As you know that LinkedHashSet doesn’t allow duplicate elements and also maintains the insertion order of elements. 
- Both these properties of LinkedHashSet is used here in order to remove duplicate elements from ArrayList and also maintain the insertion order of elements. 

```
import java.util.ArrayList;
import java.util.LinkedHashSet;
 
public class MainClass
{
    public static void main(String[] args)
    {
        //Constructing An ArrayList
 
        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("J2EE");
 
        listWithDuplicateElements.add("JSP");
 
        listWithDuplicateElements.add("SERVLETS");
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("STRUTS");
 
        listWithDuplicateElements.add("JSP");
 
        //Printing listWithDuplicateElements
 
        System.out.print("ArrayList With Duplicate Elements :");
 
        System.out.println(listWithDuplicateElements);
 
        //Constructing LinkedHashSet using listWithDuplicateElements
 
        LinkedHashSet<String> set = new LinkedHashSet<String>(listWithDuplicateElements);
 
        //Constructing listWithoutDuplicateElements using set
 
        ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);
 
        //Printing listWithoutDuplicateElements
 
        System.out.print("ArrayList After Removing Duplicate Elements :");
 
        System.out.println(listWithoutDuplicateElements);
    }
}
```

Output
```
ArrayList With Duplicate Elements :[JAVA, J2EE, JSP, SERVLETS, JAVA, STRUTS, JSP]
ArrayList After Removing Duplicate Elements :[JAVA, J2EE, JSP, SERVLETS, STRUTS]
```

- Notice the output. 
- Insertion order of elements is maintained even after the duplicate elements are removed from ArrayList.