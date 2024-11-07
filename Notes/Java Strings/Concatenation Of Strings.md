# Concatenation Of Strings

The “+” operator is used to concatenate two or more string objects or string literals.
```
public class StringExamples
{
    public static void main(String[] args)
    {
        //Concatenating five string literals using "+" operator
 
        String s = "Java"+"Concept"+"Of"+"The"+"Day";
 
        System.out.println(s);       //Output : JavaConceptOfTheDay
 
        //Creating five string objects
 
        String s1 = new String("Java");
 
        String s2 = new String("Concept");
 
        String s3 = new String("Of");
 
        String s4 = new String("The");
 
        String s5 = new String("Day");
 
        //Concatenating five string objects using "+" operator
 
        System.out.println(s1+s2+s3+s4+s5);      //Output : JavaConceptOfTheDay
    }
}
```

We can concatenate a string object with other data types like int, double, long, char etc using “+” operator. 
There is a one rule of “+” operator which states that  “If any one operand of ‘+’ operator is a string, then it will be string concatenation otherwise it will be a normal addition”. The same rule applies here also.
```
	
public class StringExamples
{
    public static void main(String[] args)
    {
        //Concatenating a string object with int type
 
        int i = 1000;
 
        String s = "Java"+i;
 
        System.out.println(s);        //Output : Java1000
 
        //Concatenating a string object with double type
 
        double d = 523.69;
 
        String s1 = "Java"+d;
 
        System.out.println(s1);      //Output : Java523.69
 
        //Concatenating a string object with char type
 
        char c = 'A';
 
        String s2 = "Java"+c;
 
        System.out.println(s2);       //Output : JavaA
 
        //Concatenating a string object with boolean type
 
        boolean b = true;
 
        String s3 = "Java"+b;
 
        System.out.println(s3);      //Output : Javatrue
    }
}
```
We can concatenate a string object not only with primitive types but also with the derived types. When you use derived type in the string concatenation, the string returned by the toString() method of that derived type is used.
```
package strings;
 
class A
{
    int i;
 
    public A(int i)
    {
        this.i = i;
    }
 
    //toString() method is not overrided.
    //So, it will return physical address of the object
}
 
class B
{
    int i;
 
    public B(int i)
    {
        this.i = i;
    }
 
    //Overriding toString() method
 
    @Override
    public String toString()
    {
        return "i = "+i;
    }
}
 
public class StringExamples
{
    public static void main(String[] args)
    {
        A a = new A(50);
 
        String s = "Java";
 
        //Concatenating a string object with A-type
 
        System.out.println(s+a);      //Output : Javastrings.A@42719c
 
        B b = new B(100);
 
        //Concatenating string object with B-type
 
        System.out.println(s+b);     //Output : Javai = 100
    }
}
```
When you are adding two or more objects of different types using “+” operator, addition of the objects takes place from left to right. While adding, if any one operand is string then it will be string concatenation otherwise it will be normal addition.
```
public class StringExamples
{
    public static void main(String[] args)
    {
        int i = 5000;
 
        double d = 6000.0006;
 
        String s = "Java";
 
        System.out.println(i+d+s);      //Output : 11000.0006Java
 
        System.out.println(s+i+d);      //Output : Java50006000.0006
 
        System.out.println(i+s+d);      //Output : 5000Java6000.0006
    }
}
```

Can we concatenate the string objects without using “+” operator?.
Yes, we can concatenate string objects without using “+” operator. This can be done using concat() method of java.lang.String class. But using concat() method, we can concatenate only two string objects. It is not possible to concatenate more than two string objects using concat() method. And also using concat() method we can’t concatenate a string object with other type of object. Because, concat() method takes only String type as an argument.
```
public class StringExamples
{
    public static void main(String[] args)
    {
        String s1 = "JAVA";
 
        String s2 = "J2EE";
 
        System.out.println(s1.concat(s2));      //Output : JAVAJ2EE
    }
}
```

Here is one special example of String concatenation. You can add two null objects referred by two String type reference variables (Like in Line 9 in the below example) , but you can’t add two hard coded null objects (Like in Line 15 in the below example). It gives compile time error.
```
public class StringExamples
{
    public static void main(String[] args)
    {
        String s1 = null;
 
        String s2 = null;
 
        System.out.println(s1+s2);       //Output : nullnull
 
        System.out.println("null"+"null");    //Output : nullnull
 
        System.out.println(s1+"JAVA"+s2);     //Output : nullJAVAnull
 
    //  System.out.println(null+null);     //Compile Time Error
    }
}
```
