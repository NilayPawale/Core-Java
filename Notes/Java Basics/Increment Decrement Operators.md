1) Post Increment Operator
```
public class Sample
{
     public static void main(String[] args)
     {
          int i = 0;
          System.out.println(i++);
     }
}
```

- If you run this program output will be 0 not 1. 
- Because the operator used is post increment operator. According to definition of Post-Increment operator, first, value of the variable is used and then incremented i.e first, value of i (0) is printed and then i is incremented to 1.
- So, here usage value(used value)  of i is 0 and storage value(Value stored in the memory) is 1.

2) Pre Increment Operator

```
public class Sample
{
     public static void main(String[] args)
     {
          int i = 0;
          System.out.println(++i);
     }
}
```
- Here, output will be 1, The operator used is pre increment operator. 
- When you use pre increment operator, first, value is incremented and then used. 
- In the above program, first, value of i is incremented to 1 then it is used. 
- So, usage value and storage value both are same.

3) Post Decrement Operator

```
public class Sample
{
     public static void main(String[] args)
     {
          int i = 0;
          System.out.println(i--);
     }
}
```
- Here, the operator used is post decrement operator. 
- It operates in the same manner as post increment operator but here the value is decremented. 
- The output of this program will be 0 not -1, because first, value is used and then decremented. 
- So, here usage value is 0 and storage value is -1.

4) Pre Decrement Operator

```
public class Sample
{
     public static void main(String[] args)
     {
          int i = 0;
          System.out.println(--i);
     }
}
```
- Here, the operator used is pre decrement operator. 
- It is also operates in the same manner as pre increment operator but here the value is decremented. If you run this program, output will be -1. 
- That means first, value is decremented and then used. 
- So, usage value is -1 and storage value is also -1.