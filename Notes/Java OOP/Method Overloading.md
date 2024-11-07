# Method Overloading in Java

- When a class has more than one method with same name, then we call that method is overloaded. 
- The overloaded methods will have different number of arguments or different types of arguments, but name of the methods remains same.

- Compiler checks method signature for duplicate methods or for method overloading. 
- Method signature consist of three things, 
1) Method Name   
2) Number Of Arguments   
3) Types of arguments.

If these three things are same for any two methods in a class, then compiler gives duplicate method error.

- Compiler first checks method name. 
- If it is same, then it checks number of arguments. 
- If methods differs in number of arguments, then it does not check types of argument. 
- It treats as methods are overloaded. 
- If number of arguments are same then compiler checks types of arguments. 
- If types of arguments are also same, then compiler will give duplicate method error. 
- If types of arguments are not same, then compiler will treat them as methods are overloaded.

- For method overloading to be successful, method name must be same and methods must have different number of arguments or different types of arguments. 
- If method names are different, then those methods will be treated as two different methods.

```
public class MethodOverloading
{
    void methodOverloaded()
    {
        //No argument method
    }
 
    void methodOverloaded(int i)
    {
        //One argument is passed
    }
 
    void methodOverloaded(double d)
    {
        //One argument is passed but type of argument is different
    }
 
    void methodOverloaded(int i, double d)
    {
        //Two argument method
        //Method signature of this method is methodOverloaded(int, double)
    }
 
    void methodOverloaded(double d, int i)
    {
        //It is also two argument method but type of arguments changes
        //Method signature of this method is methodOverloaded(double, int)
    }
 
    void methodOverloaded(double d1, int i1)
    {
                //It has same method signature methodOverloaded(double, int) as of above method
        //So, it is a Duplicate method, You will get compile time error here
    }
 
    void differentMethod()
    {
        //Different method
    }
}
```

- Overloaded methods may have same return types or different return types. 
- It does not effect method overloading.
```
public class MethodOverloading
{
    void methodOverloaded()
    {
        //No argument method, return type is void
    }
 
    int methodOverloaded(int i)
    {
        //Returns int type
        return i;
    }
 
    int methodOverloaded(double d)
    {
        //Same return type as of above method
        return 0;
    }
 
    void methodOverloaded(double d)
    {
        //Duplicate method because it has same method signature as of above method
    }
}
```

- If two methods have same signature and different return types, then those methods will not be treated as two different methods or methods overloaded. 
- For duplication, compiler checks only method signature not return types. 
- If method signature is same, straight away it gives duplicate method error.
- Overloaded methods may have same access modifiers or different access modifiers. It also does not effect method overloading.
```
public class MethodOverloading
{
    private void methodOverloaded()
    {
        //No argument, private method
    }
 
    private int methodOverloaded(int i)
    {
        //One argument private method
        return i;
    }
 
    protected int methodOverloaded(double d)
    {
        //Protected Method
        return 0;
    }
 
    public void methodOverloaded(int i, double d)
    {
        //Public Method
    }
}
```

Overloaded methods may be static or non-static. This also does not effect method overloading.
```
public class MethodOverloading
{
    private static void methodOverloaded()
    {
        //No argument, private static method
    }
 
    private int methodOverloaded(int i)
    {
        //One argument private non-static method
        return i;
    }
 
    static int methodOverloaded(double d)
    {
        //static Method
        return 0;
    }
 
    public void methodOverloaded(int i, double d)
    {
        //Public non-static Method
    }
}
```

- It is clear that compiler will check only method signature for method overloading or for duplicate methods. 
- It does not check return types, access modifiers and static or non-static.




