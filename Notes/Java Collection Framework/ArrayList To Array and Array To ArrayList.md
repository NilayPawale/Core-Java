# Array To ArrayList And ArrayList To Array

- Array and ArrayList are two most frequently used data types in java. 
- Array is old derived type which can hold primitive types as well as objects where as ArrayList is a part of Java Collection Framework which holds only objects. 
- One more difference is that array is of fixed size. 
- You can’t change its size once it is created. But, ArrayList is re-sizable. 
- It grows and shrinks as you insert or delete the elements. 

## Array To ArrayList In Java

1) Using Arrays.asList() Method

```
import java.util.ArrayList;
import java.util.Arrays;
 
public class ArrayToArrayListExample 
{   
    public static void main(String[] args) 
    {   
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
         
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
         
        System.out.println(list);
    }   
}
```

Output
```
[ANDROID, JSP, JAVA, STRUTS, HADOOP, JSF]
```

2) Using Collections.addAll() Method

```
import java.util.ArrayList;
import java.util.Collections;
 
public class ArrayToArrayListExample 
{   
    public static void main(String[] args) 
    {   
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
         
        ArrayList<String> list = new ArrayList<String>();
         
        Collections.addAll(list, array);
         
        System.out.println(list);
    }   
}
```

Output
```
[ANDROID, JSP, JAVA, STRUTS, HADOOP, JSF]
```

3) Using list.addAll() Method 

```
import java.util.ArrayList;
import java.util.Arrays;
 
public class ArrayToArrayListExample 
{   
    public static void main(String[] args) 
    {   
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
         
        ArrayList<String> list = new ArrayList<String>();
         
        list.addAll(Arrays.asList(array));
         
        System.out.println(list);
    }   
}
```

Output
```
[ANDROID, JSP, JAVA, STRUTS, HADOOP, JSF]
```

4) Using Streams from Java 8

```
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class ArrayToArrayListExample 
{   
    public static void main(String[] args) 
    {   
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
         
        List<Object> list = Arrays.stream(array).collect(Collectors.toList());
         
        System.out.println(list);
    }   
}
```

Output
```
[ANDROID, JSP, JAVA, STRUTS, HADOOP, JSF]
```

## ArrayList To Array In Java

1) Using list.toArray()

```
import java.util.ArrayList;
 
public class ArrayListToArrayExample 
{   
    public static void main(String[] args) 
    {   
        ArrayList<String> list = new ArrayList<String>();
         
        list.add("JAVA");
         
        list.add("JSP");
         
        list.add("ANDROID");
         
        list.add("STRUTS");
         
        list.add("HADOOP");
         
        list.add("JSF");
         
        String[] array = new String[list.size()]; 
         
        list.toArray(array);
         
        for (String string : array)
        {
            System.out.println(string);
        }
    }   
}
```

Output
```
JAVA
JSP
ANDROID
STRUTS
HADOOP
JSF
```


