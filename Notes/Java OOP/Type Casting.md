# Type Casting in Java

- Type casting in java or simply casting is used to convert data from one data type to another data type. 
- Please note that by using casting, data can not be modified but only type of data can be modified.

There are two types of casting,

1) Primitive Casting

2) Derived Casting

## Primitive Casting

- Primirive Casting is used to convert data from one primitive data type to another primitive data type.

- Consider primitive data types in java which represent the numbers.

- These are data types with no decimal places.

1) byte     
2) short     
3) int      
4) long

- These are data types with decimal places.

5) float     
6) double

When you put them in the increasing order of their memory size, you get
```
byte < short < int < long < float < double.
```

- byte is the smallest data type and double is the biggest data type in terms of memory size.

There are two types in primitive casting. 
1) Auto Widening   
2) Explicit Narrowing

1) Auto Widening

- When you are converting data from small sized data type to big sized data type, i.e when you are converting data from left-placed data type to right-placed data type in the above order, auto widening will be used. 
- For example, when you are converting byte to short or short to int, auto widening will be used.
```
class AutoWidening
{
    static float methodOne(int i)
    {
        long j = i;     //int is auto widened to long
        return j;       //long is auto widened to float
    }
 
    public static void main(String[] args)
    {
        byte b = 10;
        short s = b;      //byte is auto widened to short
        double d = methodOne(s);    //short is auto widened to int and float to double
        System.out.println(d);
    }
}
```

2) Explicit Narrowing

- When you are converting data from big sized data type to small sized data type, i.e when you are converting data from right-placed data type to left-placed data type in the above order, explicit narrowing will be used. 
- For example, when you are converting double to float or float to int, explicit narrowing will be used.
```
class ExplicitlyNarrowing
{
    static short methodOne(long l)
    {
        int i = (int) l;     //long is explicitly narrowed to int
        return (short)i;       //int is explicitly narrowed to short
    }
 
    public static void main(String[] args)
    {
        double d = 10.25;
        float f = (float) d;      //double is explicitly narrowed to float
        byte b = (byte) methodOne((long) f);    //float is explicitly narrowed to long and short to byte
        System.out.println(b);
    }
}
```

## Derived Casting

- Derived casting is used to change the type of object from one user defined data type to another user defined data type in the class hierarchy.

There are two types in derived casting. 
1) Auto-up Casting  
2) Explicit Down Casting.

1) Auto-Up Casting

Auto-Up Casting is used to change the type of object from sub class type to super class type. i.e an object of sub class type is automatically converted to an object of super class type. 
```
class A
{
    int i = 10;
}
 
class B extends A
{
    int j = 20;
}
 
class C extends B
{
    int k = 30;
}
 
class D extends C
{
    int m = 40;
}
 
public class AutoUpCasting
{
    public static void main(String[] args)
    {
        D d = new D();
        C c = d;       // D type object is Auto-Up Casted to C type
        B b = d;      // D type object is Auto-Up Casted to B type
        C c1 = new C();
        A a = c1;    // C type object is Auto-Up Casted to A type
        A a1 = new B(); // B type object is Auto-Up Casted to A type
    }
}
```

2) Explicit Down Casting

Explicit down Casting is used to change the type of object from super class type to sub class type. i.e you have to explicitly convert an object of super class type to an object of sub class type. 
```
class A
{
    int i = 10;
}
 
class B extends A
{
    int j = 20;
}
 
class C extends B
{
    int k = 30;
}
 
class D extends C
{
    int m = 40;
}
 
public class ExplicitDownCasting
{
    public static void main(String[] args)
    {
        A a = new A();
        B b = (B) a;   //A type is explicitly downcasted to B type
        C c = (C) a;   //A type is explicitly downcasted to C type
        D d = (D) a;   //A type is explicitly downcasted to D type
        B b1 = new B();
        D d1 = (D) b1;  //B type is explicitly downcasted to D type
        d1 = (D) new C();  //C type is explicitly downcasted to D type
    }
}
```
