# String Character Extraction

java.lang.String class provides many methods to extract the characters from a string object. The characters in the string object are not stored like character array where each character is indexed. But, many string methods use indexes to address the characters in the string object. Like array, The index of string also starts from 0 (Zero).

Below are some methods which are used to extract characters from a string object.

## 1) charAt() Method 

This method returns character at the specified index. Here is signature of this method.
```
public char charAt(int index)
```
Where index must be between 0 and length() – 1. This method will throw StringIndexOutOfBoundsException if index passed is negative or not less than the length of the string.
```
public class StringExamples
{
    public static void main(String[] args)
    {
        String s = "Java Concept Of The Day";
 
        System.out.println(s.charAt(5));      //Output : C
 
        System.out.println(s.charAt(10));     //Output : p
 
        System.out.println(s.charAt(25));     //This statement will throw StringIndexOutOfBoundsException
    }
}
```

## 2) getChars() Method

This method copies the set of characters from the string into specified character array. Here is the signature of this method.
```
public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
```
This method copies characters of a string object starting from ‘srcBegin’ to ‘srcEnd’ into character array ‘dst’ at the index ‘dstBegin’. This method will also throw StringIndexOutOfBoundsException if ‘srcBegin’ or ‘srcEnd’ are not between 0 and length() – 1 or if characters extracted does not fit into destination array.
```
	
public class StringExamples
{
    public static void main(String[] args)
    {
        String s = "Java Concept Of The Day";
 
        //Defining destination char array
 
        char[] dst = new char[10];
 
        //Copying the set of characters from s into dst.
 
        s.getChars(5, 11, dst, 2);
 
        for (char c : dst)
        {
            System.out.print(c);       //Output : --Concep--
        }
    }
}
```

## 3) toCharArray() Method

This method converts whole string into a character array. Below is the signature of this method.
```
public char[] toCharArray()
```
```
public class StringExamples
{
    public static void main(String[] args)
    {
        String s = "Java Concept Of The Day";
 
        //Converting string 's' into character array.
 
        char[] dst = s.toCharArray();
 
        for (char c : dst)
        {
            System.out.print(c);     //Output : Java Concept Of The Day
        }
    }
}
```

## 4) subString() Method

This method returns a sub string of the specified string. This method has two forms.

public String substring(int beginIndex) –> This form returns sub string starting from ‘beginIndex’ to the end of the specified string.

public String substring(int beginIndex, int endIndex) –> This form returns sub string starting from ‘beginIndex’ to ‘endIndex’ of the specified string.
```
public class StringExamples
{
    public static void main(String[] args)
    {
        String s = "Java Concept Of The Day";
 
        String subString1 = s.substring(11);     
 
        System.out.println(subString1);           //Output : t Of The Day
 
        String subString2 = s.substring(5, 15);
 
        System.out.println(subString2);         //Output : Concept Of
    }
}
```